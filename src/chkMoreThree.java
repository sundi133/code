
public class chkMoreThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[] arr={2,2,13,4,7,3,8,12,9,1,5};
		
		int lo=0;
		int hi=lo+1;
		int left_sum=0;
		int right_sum=0;
		while(lo<arr.length){
			
			left_sum+=arr[lo];
			right_sum+=arr[hi];
			
		}

	}

}
