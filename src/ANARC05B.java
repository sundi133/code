import java.util.Scanner;


public class ANARC05B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		
		String inp1= in.nextLine();
		String inp2= in.nextLine();
		
		String[] input1=inp1.split(" ");
		int[] in1=new int[input1.length];
		for(int k=0;k<input1.length;k++){
			in1[k]=Integer.parseInt(input1[k]);
		}
		
		String[] input2=inp2.split(" ");
		int[] in2=new int[input2.length];
		for(int k=0;k<input2.length;k++){
			in2[k]=Integer.parseInt(input2[k]);
		}
		int l1= input1.length;
		int l2= input2.length;
		
		int[][] dp = new int[input1.length][input2.length];

		dp[0][0]=0;
		for(int i=1;i<l1;i++){
			dp[i][0] = dp[i-1][0] +in1[i];
		}
			
		for(int j=1;j<l2;j++){
			dp[0][j] = dp[0][j-1]+in2[j];
		}
		
		//for()
		 int i, j;
		 
	 
	     for (i = 1; i <= l1; i++)
	        for (j = 1; j <= l2; j++)
	            dp[i][j] = min(dp[i-1][j-1], dp[i-1][j], dp[i][j-1]) + cost[i][j];
	 
	     System.out.pr tc[m][n];

	}

}
