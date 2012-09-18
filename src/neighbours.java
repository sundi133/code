import java.util.Scanner;


public class neighbours {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //System.out.println("Enter the numbers ");
        Scanner inp = new Scanner(System.in);
        
        int[] arr={ 10, 3, 2, 5, 7, 8 };
        int[] max = new int[100];
        int k=0;
        max[0]=arr[k];
        max[1]=maxi(arr[k],arr[k+1]);
        max[2]=maxi(max[1],arr[k+2]);
        //System.out.println( max[0] );
        //System.out.println( max[1] );
        //max[2] =maxi(max[1],arr[k+2]);
        for(int i=3;i<arr.length;i++){
        	max[i] = maxi( max[i-2]+arr[i],max[i-3] + arr[i-1]);
        	System.out.println( max[i]);	
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
        
        	System.out.println( max[i]);	
        }
        

	}

	private static int maxi(int i, int j) {
		// TODO Auto-generated method stub
		return i>j?i:j;
	}

}
