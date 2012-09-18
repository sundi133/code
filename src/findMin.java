
public class findMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int res= findMin(arr);
		System.out.println(res);
	}

	private static int findMin(int[] arr) {
		// TODO Auto-generated method stub
		int Max=1000;
		int len=arr.length;
		int[] dp = new int[arr.length];
		dp[0]=0;
		
		for(int i=1;i<arr.length;i++){
			dp[i]=Max;
			for(int j=0;j<i;j++){
				//System.out.println("" + i+" " + +j + " " +arr[j]);
				if(i-j<=arr[j]){
					//System.out.println((dp[j]+1) +"  " + dp[i] );  
					dp[i]=min(dp[j]+1,dp[i]);
					System.out.println("m " +dp[i]);
				}
			}

		}

		return dp[len-1];

	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return i<j?i:j;
	}


}
