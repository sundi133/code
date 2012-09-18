
public class BitOps {

	public static void main(String[] args) {
		int y =2;
		/*System.out.println( y | ( y >>1 ));
		System.out.println( y | ( y >>2 ));
		System.out.println( y | ( y >>4 ));
		System.out.println( y | ( y >>8 ));
		System.out.println( y | ( y >>16 ));
		System.out.println( y & (y-1) ^ y);*/
		/*int x=y;
		
		
		while(true){
			System.out.println(printbits(x));
			x=(x-1)&y;
			if(x==0)
				break;
		}*/
		
		System.out.println( getIntegerComplement(50));
		
		
	}

	public static int getIntegerComplement(int value){
		
		
		 String getbits = null;
		 int displayMask = 1 << 31;
         StringBuffer buf = new StringBuffer();
        
         for ( int c = 1; c <= 32; c++ ) 
             {
             buf.append( ( value & displayMask ) == 0 ? '0' : '1' );
             value <<= 1;
            
         }
       
         String finalgetbits = new String();
         getbits = buf.toString();
         int posmsbset=0;
         for(int k=0;k<getbits.length();k++){
        	 if(getbits.charAt(k) == '1'){
        		 posmsbset=k;
        		
        		 break;
        	 }else{
        		 finalgetbits+="0";
        	 }
         }
         for(int k=posmsbset;k<getbits.length();k++){
        	 if(getbits.charAt(k) == '1'){
        		 finalgetbits+="0";
        	 }else{
        		 finalgetbits+="1";
        	 }
         }
         //System.out.println(getbits);
         //System.out.println(finalgetbits);
         int num=0;
         for ( int c = 1; c <= 32; c++ ) {
        	 int ch = (int ) finalgetbits.toString().charAt(c-1);
        	 int chk = (ch==48)?0:1;
        	 //System.out.println(chk + ", " + (32-c) );
        	 num+=chk * (1 << (32-c));
         }
         return num;
	}
	
	private static String printbits(int value) {
		
		 int displayMask = 1 << 31;
         StringBuffer buf = new StringBuffer( 35 );
        
         for ( int c = 1; c <= 32; c++ ) 
             {
             buf.append( ( value & displayMask ) == 0 ? '0' : '1' );
             value <<= 1;
            
         }
        
         return buf.toString();
	}
}
