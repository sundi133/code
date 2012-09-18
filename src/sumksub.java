
public class sumksub {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,13,4,7,3,8,12,9,1,5};
				   
		subk(arr);

	}

	private static void subk(int[] arr) {
		//dp[i][j][k]//index i, sum of element from i to i-j
		int[] sample = new int[arr.length];
		
		for(int k=0;k<arr.length;k++){
			int i=k;
			if(k-1>=0)
				sample[k] =sample[k-1]+ arr[i];
			else
				sample[k] =arr[i];
			for(int j=0;j<k;j++){
				//sample
			}
		}
		
	}

}
