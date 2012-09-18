
public class histogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	    //int a[]={3,5,4,6,5,2,1,4,3,7,5,4};
		int a[]={3,5,4,1};
		int maxarea = maxArea(a);
		System.out.println(maxarea);

	}

	private static int maxArea(int[] a) {
		// TODO Auto-generated method stub
		int len=a.length;
		int[] dp = new int[len+1];

		dp[0]=1;
		for(int i=1;i<=a.length;i++){
			int maxAi=1;
			for(int k=0;k<i;k++){
				int Ai=(i-k)*min(a[k],a[i-1]);
					if(maxAi < Ai){
						maxAi=Ai;
						dp[i] = maxAi;
					}
				
				}
				
				
			}
		return dp[len];
		}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?j:i;
	}

	

}
