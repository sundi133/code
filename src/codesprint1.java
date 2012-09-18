import java.util.Scanner;


public class codesprint1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		while(r--!=0){
		int a = in.nextInt();
		int b = in.nextInt();
		if(a>b){
			a=b;
			b=a;
		}
		System.out.println(countBits(a,b));
		}
		
		

	}

	private static int countBits(int a, int b) {
		//System.out.println(" " + a + "," + b);
		
		if(a==b)
		{
			return cBits(a);
		}
		int c = (a+b)/2;
		if(b==c){
			return cBits(a)+cBits(b);
		}
		int l= countBits(a, c);
		int r=countBits(c+1, b);
		return l+r;
		
	}
	static int cBits(int i)
	{
	    i = i - ((i >> 1) & 0x55555555);
	    i = (i & 0x33333333) + ((i >> 2) & 0x33333333);
	    return (((i + (i >> 4)) & 0x0F0F0F0F) * 0x01010101) >> 24;
	}

}
