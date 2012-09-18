import java.io.Console;
import java.io.ObjectInputStream.GetField;


public class perm1 {

	/**
	 * @param args
	 */
	static  int  N = 10;
	static int level=-1;
	static int[] Value = new int[N];
	public static void main(String[] args) {



		for (int i = 0; i < N; i++) {
			Value[i] = i;
		}
		int  p=fact(N);
		System.out.print(p);
		while(p--!=0){
			getNext();
			
			
		}
		
		


	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		else 
			return n*fact(n-1);
		
	}

	static void getNext()
	{
		int i = N - 1;
		while (Value[i-1] >= Value[i]) 
			i = i-1;

		int j = N;
		while (Value[j-1] <= Value[i-1]) 
			j = j-1;

		swap(i-1, j-1);    // swap values at positions (i-1) and (j-1)

		System.out.println();
		for (int k = 0; k < N; k++) {
			System.out.print(Value[k]);
		}
		i++; j = N;
		while (i < j)
		{
			swap(i-1, j-1);
			System.out.println();
			for (int k = 0; k < N; k++) {
				System.out.print(Value[k]);
			}
			
			i++;
			j--;
		}
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int tmp = Value[i];
		Value[i]=Value[j];
		Value[j]=tmp;
		return;

	}
}
