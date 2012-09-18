
public class maxpath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int[][] M =  {{0, 1, 1, 0, 1},
                 {1, 1, 0, 1, 0},
                 {0, 1, 1, 1, 0},
                 {1, 1, 1, 1, 0},
                 {1, 1, 1, 1, 1},
                 {0, 0, 0, 0, 0}};
		 
		 maxpath(M,6,5);

	}

	private static void maxpath(int[][] m,int row,int col) {
		int [][] dp= new int [row][col];
		for(int i=0;i<row;i++)
			dp[i][0]=m[i][0];
		for(int i=0;i<col;i++)
			dp[0][i]=m[0][i];
		
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				if(m[i][j]==1)
					dp[i][j]=min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1])+1;
				else
					dp[i][j]=0;
			}
		}
		int max=dp[0][0];
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					if(max<dp[i][j]){
						max=dp[i][j];
					}
					
				}
			}
			
			System.out.println(max);
		
	}

	private static int min(int i, int j, int k) {
		int min = i>j?j:i;
		return min>k?k:min;
	}

}
