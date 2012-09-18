
public class topcoder {

	public static void main(String args[]){
		
		int x =3;
		System.out.println(catalan(x));
	}

	private static int catalan(int n)
	{
	    if (n == 1)
	       return 1;
	    else
	
	       return 2 * (2*n - 1) * catalan(n-1) / (n+1);
	
	} 
	
	
}
