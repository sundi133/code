public class LCS {

  public static String lcs(String a,String b) {
      String x;
      String y;


      int alen=a.length();
      int blen=b.length();
      if (alen==0 || blen==0) {
        return "";
      }
      else if (a.charAt(alen-1)==b.charAt(blen-1)) {
        return lcs(a.substring(0,alen-1),b.substring(0,blen-1)) + a.charAt(alen-1);
      }
      else {
    	//longest comon subsequence
        x=lcs(a,b.substring(0,blen-1));
        y=lcs(a.substring(0,alen-1),b);
        
    	  
      }
      //longest comon subsequence
      return (x.length()>y.length()) ? x : y;
      
  }


  public static void main(String[]args){

    String a="computer";
    String b="houseboat";
    System.out.println(lcs(a,b));

  }
}