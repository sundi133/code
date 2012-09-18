import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class Stirling {

	/**
	 * @param args
	 */
	static BufferedInputStream in = new BufferedInputStream(System.in);
	
	public static void main(String[] args) {
		try{
			
		
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int times=in.nextInt();
		while(times--!=0){
			//String p11 = readLine().trim();
			//int a = Integer.parseInt(p11.split(" ")[0]);
			//int b= Integer.parseInt(p11.split(" ")[1]);
			int a = in.nextInt();
			int b = in.nextInt();
			
			int z = a-upper(b);
			int w = lower(b)/2;
		
			int com=com(z,w);
			System.out.println(com%2);
		}
		}catch (Exception e) {
			// TODO: handle exception
			
		}

	}

	private static int com(int n, int k) {
		// TODO Auto-generated method stub
		try {
		if(n<=0 && k>0)
			return 0;
		else if(k<=0 && n>=0)
			return 1;
			
		else{
			return com(n-1,k-1) + com(n-1,k);
		}
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	}

	private static int lower(int i) {
		// TODO Auto-generated method stub
		try{
		if((i-1)%2==0)
			return (i-1)/2;
		else
			return (i-1)/2 -1;
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
			
		}
	}

	private static int upper(int i) {
		// TODO Auto-generated method stub
		try{
		if((i+1)%2==0)
			return (i+1)/2;
		else
			return (i+1)/2 +1;
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
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
