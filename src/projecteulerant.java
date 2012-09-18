import java.math.BigInteger;


public class projecteulerant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("1000000000000000000");
		BigInteger m = new BigInteger("8");
		BigInteger m1 = a.mod(m);
		int ans=0;
		if(m1.intValue()==0 || m1.intValue()==8)
			ans=0;
		else if(m1.intValue()==1 || m1.intValue()==7)
			ans=1;
		else if(m1.intValue()==2 || m1.intValue()==6)
			ans=2;
		else if(m1.intValue()==3 || m1.intValue()==5)
			ans=3;
		else if(m1.intValue()==4)
			ans=4;
			
		System.out.println(ans);

	}

}
