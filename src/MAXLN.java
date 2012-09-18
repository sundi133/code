import java.util.Scanner;


public class MAXLN {

	private static double maxl=0.00;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner text = new Scanner(System.in);
		    int num = text.nextInt();
		    int i=1;
		    while(num--!=0){
		    	double r = text.nextDouble();
		    	double res= 4*r*r + .25;
		
		    	System.out.println("Case "+ i + ": "+res);
		    	i++;
		    	
		    }
		
		
	}

	

}
