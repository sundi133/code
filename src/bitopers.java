public class bitopers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int y=7;
        int x=y;
        int k=y;
        
        while(k--!=0){
            //System.out.println("test" + k);
            printbits(x);
            x=(x-1) & y;
            if(x==0){
                printbits(x);
                break;
            }
                
            
        }
    }

    private static void printbits(int x) {
        int disp=1<<31;
        String resp=new String();
        for(int k=0;k<32;k++){
            String bit = (disp & x) ==0 ? "0":"1";
            x=x<<1;
            resp+=bit;
            
        }
        
        System.out.println(resp);
    }

}
