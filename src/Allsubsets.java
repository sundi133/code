
public class Allsubsets {

	public static int i=0;
	public static int length=0;
	public static void main(String[] args) {
		String perm="abcde";
		int req=5;
		int len=perm.length();
		
		length = len-req;
		RecPermute("",perm);
	}
	
	static void RecPermute(String soFar, String rest)
	{
		//if (rest.isEmpty()) {
		if (rest.isEmpty()) {
			
			System.out.println(soFar);
			return;
			
		} else {
			
				String remaining = rest.substring(1);
				RecPermute(soFar + rest.charAt(0), remaining);
				RecPermute(soFar , remaining);
			
		}
	}

}
