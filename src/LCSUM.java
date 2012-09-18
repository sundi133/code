
public class LCSUM {

	
	
	public static void main(String[] args) {

	int[] arr = {31, -41, 59, 26, -53, 58, 97, -93, -23, 84};
	int max_sum=0;
	int index=0;
	int glb_sum=0;
	int sindex=0;
	int eindex=0;
	
	for(int k=0;k < arr.length;k++ ){
		max_sum=max_sum+arr[k];
		if(max_sum<0){
			max_sum=0;
			sindex=k;
			
		}
		if(glb_sum<max_sum){
			glb_sum=max_sum;
			eindex=k;
		}
			
	}
	System.out.println(glb_sum + ", " + (sindex+1) + ", " + eindex);
	
	}
}
