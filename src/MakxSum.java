import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;


public class MakxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i=0;
		while(i<num){
			int n=in.nextInt();
			int k1=in.nextInt();
			int k2=in.nextInt();
			int k3=in.nextInt();
			int[] arr = new int[n];

			for(int p=0;p<n;p++)
				arr[p]=in.nextInt();

			int[] res=calcres(arr);
			System.out.println();
			i++;
		}

	}

	private static int[] calcres(int[] arr) {
		// TODO Auto-generated method stub
		int[] res=new int[arr.length];
		genesub(arr,0,res);
		return res;
	}

	private static int[] genesub(int[] arr, int i, int[] res) {
		System.out.println("index : "+i);
		int [] ares= new int[arr.length];
		int [] ans= new int[arr.length-i];
		if(i==arr.length-1){
			ans[0]=arr[arr.length-1];
			return ans;
		}
		else{
			int sum=0;

			ans= genesub(arr, i+1, res);
			System.out.println(ans);
			if(ans!=null){
				for(int m=0;m<ans.length;m++){

					sum=getelem(arr,i+1)+ans[m];
					ares[m]=sum;
					sum=0;
					System.out.println(sum);
				}
			}
		}
		return ares;
	}

	private static int getelem(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i<arr.length)
			return arr[i];
		else
			return 0;

	}

}
