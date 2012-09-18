
public class totalpaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] arr = {
					   {-1,0,0},
				       {0,0,0},
				       {0,0,10 }
				       
		              };
		int zeros=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(arr[i][j]==0){
					zeros++;
				}
			}
		}
		
		int tot=findpaths(arr,0,0,zeros,3,3);
		System.out.println(tot);

	}

	private static int findpaths(int[][] arr,int startx,int starty, int count,int ROWS,int COLS) {
		
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				System.out.print(" "+arr[i][j]);
				
			}
			System.out.println();
		}
		int sum=1;
		if(startx < 0 || starty < 0 || startx >= ROWS || starty >= COLS){
			System.out.println("bt");
			return 0;
		}
		if(arr[startx][starty]==1){
			System.out.println("btone");
			System.out.println(startx +", " +starty);
			return 0;
		}
		if(arr[startx][starty]==10){
			System.out.println(startx +", " +starty);
			return 1;
		}	
		else{
			
			
			arr[startx][starty]=1;
			int x=startx+1;
			int y=starty;
			try{
			if(arr[x][y]==0){
				
				System.out.println("-----");
				System.out.println(x +",e " +y);
				sum= findpaths(arr,startx+1,starty, count,ROWS,COLS);
				//arr[x][y]=0;
				if(sum==1){
					System.out.println("sundi " + sum);
				}
				
			}}catch (Exception e) {
				// TODO: handle exception
			}
			
            
			x=startx;
			y=starty+1;
			try{
			if(arr[startx][starty+1]==0){
				System.out.println("-----");
				System.out.println(x +",e1 " +y);
				//arr[startx][starty+1]=1;
				sum= findpaths(arr,startx,starty+1, count,ROWS,COLS);
				//arr[startx][starty+1]=0;
				if(sum==1){
					System.out.println("sundi ");
				}
			}}catch (Exception e) {
				// TODO: handle exception
			}
			
			
			x=startx-1;
			y=starty;
			try{
			if(arr[startx-1][starty]==0){
				System.out.println("-----");
				System.out.println(x +",e2 " +y);
				//arr[startx-1][starty]=1;
				sum= findpaths(arr,startx-1,starty, count,ROWS,COLS);
				//arr[startx-1][starty]=0;
				if(sum==1){
					System.out.println("sundi ");
				}
			}}catch (Exception e) {
				// TODO: handle exception
			}
			
			x=startx;
			y=starty-1;
			try{
			if(arr[startx][starty-1]==0){
				System.out.println("-----");
				System.out.println(x +",e3 " +y);
				//arr[startx][starty-1]=1;
				sum=findpaths(arr,startx,starty-1, count,ROWS,COLS);
				//arr[startx][starty-1]=0;
				if(sum==1){
					System.out.println("sundi ");
				}
			}
			else{
				arr[startx][starty]=1;
				return 0;
			}}catch (Exception e) {
				// TODO: handle exception
				arr[startx][starty]=1;
				return 0;
			}
			arr[startx][starty]=1;
			
		}
		return sum;
	}
	

}
