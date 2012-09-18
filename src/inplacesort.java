
public class inplacesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] arr = {
				{1,6,8},
				{2,7,9},
				{3,9,10},
				{4,11,12}
		};

		int rowsize=4;
		int colsize=3;
		
		for(int i=0;i<rowsize;i++){
			for(int j=0;j<colsize;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		int cnt=rowsize;
		while(cnt--!=0){
		for(int i=0;i<rowsize;i++){
			for(int j=0;j<colsize;j++){
				
				//System.out.print(arr[i][j]);
				if(i+1<rowsize){
				if(arr[i][j]>arr[i+1][0]){
					arr[i][j]   = arr[i+1][0]+arr[i][j];
					arr[i+1][0] = arr[i][j]-arr[i+1][0];
					arr[i][j]   = arr[i][j]-arr[i+1][0];
					for(int k=0;k<colsize-1;k++){
						if(arr[i+1][0]>arr[i+1][k]){
							arr[i+1][0] = arr[i+1][0] +arr[i+1][k];
							arr[i+1][k] = arr[i+1][0]-arr[i+1][k];
							arr[i+1][0] = arr[i+1][0]-arr[i+1][k];
						}
					}
				}
				}
				else{
					for(int k=0;k<colsize-1;k++){
						if(arr[i][0]>arr[i][k]){
							arr[i][0] = arr[i][0] +arr[i][k];
							arr[i][k] = arr[i][0]-arr[i][k];
							arr[i][0] = arr[i][0]-arr[i][k];
						}
					}
				}
					
			}
		}
		}
		System.out.println("");
		for(int i=0;i<rowsize;i++){
			for(int j=0;j<colsize;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		

	}

	

}
