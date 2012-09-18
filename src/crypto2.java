import java.util.Scanner;


public class crypto2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		while(true){
			int n = in.nextInt();
			if(n/100 ==0){
				if(n==99)
					System.out.println((n+1));
				else
					System.out.println("0"+(n+1));
			}
				
			else
				System.out.println((n+1));
			
		}

	}

}
