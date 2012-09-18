

public class LCSubstring {

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


		  public static void main(String[]args){

		    String a="abcdef";
		    String b=new String();
		    for(int k=a.length()-1;k>=0;k--){
		    	b=b+a.charAt(k);
		    }
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(lcs(a,b));

		  }
		}

