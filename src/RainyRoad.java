
public class RainyRoad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] road={".W.W.W."
				,"W.W.W.W"}

		;

		int[][] dp = new int [2][road[0].length()];
		if(isreach(road,0,0,dp)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}


	}

	private static boolean isreach(String[] road, int i, int j, int[][] dp) {
		// TODO Auto-generated method stub

		if(i < 0 || i > 1 || j <0 || j > road[0].length()-1)
			return true;

		

		if(i==0 && j==road[0].length()-1){
			return true;
		}
		char ati=road[i].toString().charAt(j);
		if(ati=='W' || dp[i][j]==1){
			return false;
		}
		
		char tmp=road[i].toString().charAt(j);


		dp[i][j]=1;
		boolean reach1=false;
		boolean reach2=false;
		boolean reach3=false;
		boolean reach4=false;
		boolean reach5=false;
		if(i==0){
			reach1 = isreach(road, i+1,j+1,dp );
			reach2= isreach(road, i+1,j,dp );
			reach3= isreach(road, i,j+1,dp );
		}else{
			reach3= isreach(road, i,j+1,dp );
			reach4= isreach(road, i-1,j ,dp);
			reach5= isreach(road, i-1,j+1,dp );	
		}


		dp[i][j]=0;

		if(reach1 || reach2 || reach3||reach4 || reach5){
			return true;
		}else{
			return false;
		}

	}

}
