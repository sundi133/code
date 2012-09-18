

	import java.io.*;
import java.util.*;
	 
	public class spojLCS
	{
		static char [] p1 = new char [6110], p2 = new char [6110];
		static BufferedInputStream in = new BufferedInputStream(System.in);
		
		public static void main (String [] args)throws IOException
		{
			int times = new Integer(readLine().trim()),l;
			String s;
			String p11= new String();
			String p12= new String();
			
			for(int ii = 1 ; ii <= times ; ii++){
				p11 = readLine().trim();
				l = p11.length();
				for(int k=p11.length()-1;k>=0;k--){
				    	p12=p12+p11.charAt(k);
				}
				 System.out.println((l-lcs(p11,p12)));
				
			}
		}
		 public static int lcs(String a,String b) {
		      String x;
		      String y;


		      int alen=a.length();
		      int blen=b.length();
		      if (alen==0 || blen==0) {
		        return 0;
		      }
		      else if (a.charAt(alen-1)==b.charAt(blen-1)) {
		        return lcs(a.substring(0,alen-1),b.substring(0,blen-1)) + 1;
		      }
		      else {
		    	return Math.max(lcs(a.substring(0, alen-1), b), lcs(a,b.substring(0, blen-1)));
		      }
		      //longest comon subsequence
		     // return (x.length()>y.length()) ? x.length() : y.length();
		      
		  }
		public static int LCS(int m){
			System.out.println(p1);
			System.out.println(p2);
			int n = m , ii =0,i , j;
			int [][] c = new int [n+1][n+1];
			c [0][0] = 0;
			for(i = 1; i <= m; i++)
			{
				ii = i&1;
				for(j = 1; j <= m; j++){
					if(p1[i] == p2[j]){
						c [ii][j] = 1 + c[1-ii][j-1];
						//System.out.print(p2[j]);
					}
					else c[ii][j] = Math.max(c[ii][j-1], c[1-ii][j]);
				}
			}
			return c [ii][m];
		}
		 static String readLine ()  // utility function to read from stdin
		    {
			 	int maxLg = 6200;
		        byte lin[] = new byte [maxLg];
		        int lg = 0, car = -1;
		        String line = "";
	 
		        try
		        {
		            while (lg < maxLg)
		            {
		                car = in.read();
		                if ((car < 0) || (car == '\n')) break;
		                lin [lg++] += car;
		            }
		        }
		        catch (IOException e)
		        {
		            return (null);
		        }
	 
		        if ((car < 0) && (lg == 0)) return (null);  // eof
		        return (new String (lin, 0, lg));
		    }
	}
	 
