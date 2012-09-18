
public class PointErasingTwo {
	
	public static void main(String[] args) {
		
		int[] y ={ 10, 19, 10, 19 };
		
		int max= get_max(y);
		System.out.println(max);
		
	}

	private static int get_max(int[] y) {


		int size=y.length;
		int res=0;
		for(int k=0;k<size;k++){
			for(int k1=k+1;k1<size;k1++){
				int c=0;
				for(int j=0;j<size;j++){
					if(k<j && j <k1){
						if( y[j] > min(y[k],y[k1]) && y[j] < max(y[k],y[k1]) )
							c++;
							
					}
				}
				res=max(res, c);

				
			}
		}
		
		return res;
	}

	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return i<j?i:j;
	}
	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?i:j;
	}

}
