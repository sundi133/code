import java.util.Scanner;


public class Mult2LargeNums {

	public static void main(String[] args) {

		/*Scanner in = new Scanner(System.in);
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		int int1= in.nextInt();
		int int2= in.nextInt();

		///////////////////System.out.println((int1+int2));
		
		int i=0;
		while(int1!=0){
			int mod1 = int1%10;
			int1=int1/10;
			arr1[i]=mod1;
			i++;

		}

		i=0;
		while(int2!=0){
			int mod2 = int2%10;
			int2=int2/10;
			arr2[i]=mod2;
			i++;

		}
		//int[] arr3 = addtwo(arr1,arr2);
		int[] arr3 = multwo(arr1,arr2);*/
		//for(int k=arr3.length-1;k>0;k--){
			//System.out.print(arr3[k]);
		//}
		//System.out.print(getSingleDigitProduct(1137638147));
		//String s="123231";
		//System.out.print(getEqualSumSubstring(s,0,s.length()-1));
		int[] A ={1,2,3,4,5,6};
		int[] B ={9,9,9,4,9,9};
		multiplyTwoNumber(A, B);
		
	}
	
	public static void multiplyTwoNumber(int[] A, int[] B){
        int[] C = new int[A.length+B.length];
        int s = C.length-1;
        
        for(int j=B.length-1; j>=0; j--){
            int carry=0;
            int shift = s;
            System.out.println(shift);
            for(int i=A.length-1; i>=0; i--){
                int m = A[i]*B[j];
                int sum = m+C[shift]+carry;
                int num = sum%10;
                int c = sum/10;
                C[shift] = num;
                carry=c;
                shift--;
            }
            C[shift]=C[shift]+carry;            
            s--;            
        }
        printArray(C);
    }
	private static void printArray(int[] c) {
		for(int k=0;k<c.length;k++){
			System.out.print(c[k]);
		}
		
	}

	public static int getEqualSumSubstring(String s,int lo,int hi) {
		
		System.out.println(lo +"," +hi); 
		if(lo>=hi)
			return 0;
		int mid=(lo+hi)/2;
		int leftsum =  Integer.parseInt(s.substring(mid-1, mid))+getEqualSumSubstring(s,0,mid);
		int rightsum = Integer.parseInt(s.substring(mid, mid+1))+getEqualSumSubstring(s,mid+1,hi);
		if(leftsum==rightsum)
			return leftsum;
		else return 0;
	}

	public static int getSingleDigitProduct(int int1) {


		
		int i=0;
		int arr1=1;
		int counter=1;
		if(int1/10==0) return 0;
		while(int1!=0){
			int mod1 = int1%10;
			int1=int1/10;
			arr1*=mod1;
			i++;

		}
		
		while(arr1/10!=0){
			int arr2=1;
			//System.out.println(arr1);
			while(arr1!=0){
				int mod1 = arr1%10;
				arr1=arr1/10;
				arr2*=mod1;
				i++;

			}
			arr1=arr2;
			counter++;
		}
		
		return counter;
		
	}
	
	private static int[] multwo(int[] arr1, int[] arr2) {
	
		
		return arr1;
		
	}

	private static int[] addtwo(int[] arr1, int[] arr2) {
		reverse(arr1);
		reverse(arr2);

		int[] arr3 = new int[arr1.length];
		arr3 = add(arr1,arr2,arr3);
		//reverse(arr3);
		
		
		/*for(int k=0;k<arr1.length;k++){
			System.out.print(arr1[k]);
		}
		System.out.println();
		for(int k=0;k<arr2.length;k++){
			System.out.print(arr2[k]);
		}
		System.out.println();
		*/
		return arr3;
	
		

		
	}

	private static int[] add(int[] arr1, int[] arr2,int[] arr3) {
		
		int carry=0;
		for(int k=0;k<arr1.length;k++){
			int sum = arr1[k]+ arr2[k] + carry;
			int mod=sum%10;
			if (sum>10)
				carry=1;
			else
				carry =0;
			arr3[k]=mod;
			
		}
		return arr3;
		
	}

	private static void reverse(int[] arr) {

		for(int k=0;k<arr.length;k++){
			int temp=arr[k];
			arr[k]=arr[arr.length-1-k];
			arr[arr.length-1-k]=temp;
		}


	}

}
