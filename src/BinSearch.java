
public class BinSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,100};
		int pos=binsearch(arr,0,arr.length,7);
		System.out.println(pos);

	}

	private static int binsearch(int[] arr,int lo, int hi,int data) {
		System.out.println(lo + ", "+hi);
		if(lo>hi)
			return -1;
		int l=-1;
		int r=-1;
		int mid = (lo+hi)/2;
		if(arr[mid]==data){
			return mid;
			
		}else if(arr[mid]>data){
			 l =binsearch(arr, lo, mid-1,data);
			
		}else if(arr[mid]<data){
			r =binsearch(arr, mid+1, hi,data);
			
		}
		if(l!=-1 || r!=-1){
			if(l!=-1)	
				return l;
			else	
				return r;
			
		}else {
			return 0;
		}
			
		
		
		
		
	}

}
