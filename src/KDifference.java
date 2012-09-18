import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


public class KDifference {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int k= in.nextInt();
		int[] arr = new int[n];
		int i=0;
		while(i!=n){
			arr[i]=in.nextInt();
			i++;
		}
		int size=n;
		int count=0;
		Arrays.sort(arr);
		for(int j=0;j<size;j++){
			int num = arr[j];
			for(int jin=0;jin<size;jin++){
			   if(arr[jin]-arr[j]==k){
				   count++;
			   }else if(arr[jin]-arr[j]>k){
				   break;
			   }
			}
		}
		System.out.println(count);
	}

}
