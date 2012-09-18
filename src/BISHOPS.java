import java.math.BigInteger;
import java.util.Scanner;


public class BISHOPS {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//int cases = in.nextInt();
		while(true){
			BigInteger num = in.nextBigInteger();
			BigInteger num1 = new BigInteger("2");

			if(num.intValue() ==1)
				System.out.println("1");
			else{
				num= num.multiply(num1);
				num= num.subtract(num1);

				System.out.println(num);
			}
			

		}

	}
}
