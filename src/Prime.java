import java.util.Scanner;


public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)
				break;
			int p= checkprime(n);
			System.out.println(p);
			
		}

	}

	private static int checkprime(int n) {
		//if(n==1)
			return 2;
		
	}

}
