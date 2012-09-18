import java.math.BigInteger;


public class Factorial
{
	public static BigInteger compute(int num) { 
		if(num < 0) { 
			throw new IllegalArgumentException("");
		}
		if(num < 2) {
			return BigInteger.ONE;  
		} 
		BigInteger factorial = BigInteger.ONE; 
		while(num > 1) {  
			factorial = factorial.multiply(BigInteger.valueOf(num--));
		}
		return factorial; 
	}

	public static void main(String args[]){
		//for (int i=2; i<25;i++)
		System.out.println("The " + 48 +", "+ compute(48));
	}
}