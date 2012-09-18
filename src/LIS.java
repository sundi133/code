
public class LIS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		//LIS(arr);
		int row=6;
		int col=5;
		int[][] M =  {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

	printMaxSubSquare(M,row,col);

	}

	private static void printMaxSubSquare(int[][] m,int row,int col) {
		int[][] dp = new int[row][col];
		
		
	}

	private static void LIS(int[] arr) {
		int[] dp = new int[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			dp[i]=1;
		}
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<j;i++){
				if(arr[j]>arr[i] && dp[j]<dp[i]+1)
					dp[j]=dp[i]+1;
			}
		}
		int max=dp[0];
		for(int i =1;i<arr.length;i++)
		{
			if(max<dp[i])
				max=dp[i];
		}
		
		System.out.println(max);
	}

}
