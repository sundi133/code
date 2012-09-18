import java.util.Scanner;


public class FourNumbers {

	/**
	 * @param args
	 */
	public static int total =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[total];
		for(int k=0;k<total;k++)
			arr[k]=0;
		int p=-1;
		while(p++!=total-1){
			 arr[p]= in.nextInt();
			 if(arr[p]==-100)
				 break;
			
		}
		
		for(int k=0;k<total;k++)
			System.out.println(arr[k]);
		System.out.println("print sum" + p);
		int sum = in.nextInt();
		
		int[] subarray = new int[total];
		int i=0;
		for(int k=0;k<p;k++){
			for(int j=k+1;j<p;j++){
				subarray[i]=arr[k]+arr[j];
				i++;
			}
		}
			


		for(int k=0;k<subarray.length;k++)
			System.out.println(subarray[k]);
		
		//findSum(sum,arr);
		findSum(sum,subarray);
		


	}

	private static void findSum(int sum, int[] arr) {
		int size= arr.length;
		int[] subarray = new int[size];
		for(int i=0;i<total;i++){
			subarray[i] = sum -arr[i];
		}
		int lo=0;
		for(int k=total-1;k>=0;k--){
			if(arr[k]!=0){
				total=k;
				break;
			}
				
		}
		int hi=total;
		//System.out.println(arr[lo] +  "," + arr[hi] + ", " + lo + ", " + hi);
		while(lo<=hi){
			//System.out.println(arr[lo] +  "," + arr[hi] + ", " + lo + ", " + hi);
			if(arr[lo] + arr[hi] > sum){
				hi--;
			}else if (arr[lo] + arr[hi] < sum){
				lo++;
			}else if((arr[lo] + arr[hi] == sum)){
				
				System.out.println(arr[lo] +  "," + arr[hi]);
				lo++;
				hi--;
			}
		}
		
		
	}

}
