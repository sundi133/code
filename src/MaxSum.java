
public class MaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr ={1,12,6,1,2,11,9};
		
		int max= getMax(arr,0,arr.length-1,0);
		System.out.println(max);
		
	}

	private static int getMax(int[] arr, int i, int j,int k) {
		if(i==j)
			return arr[i];
		if(k==0){
		int sum1=arr[i]+getMax(arr, i+1, j,1);
		int sum2=arr[j]+getMax(arr, i, j-1,1);
		if(sum1>sum2){
			System.out.println(arr[i]);
			return sum1;
		}else{
			System.out.println(arr[j]);
			return sum2;
		}
		}else{
			int sum1=arr[i]-getMax(arr, i+1, j,0);
			int sum2=arr[j]-getMax(arr, i, j-1,0);
			if(sum1<sum2){
				System.out.println(arr[i]);
				return sum1;
			}else{
				System.out.println(arr[j]);
				return sum2;
			}	
		}
		
		
	}

}
