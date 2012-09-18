
public class allperm {

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
		if (rest.length()==length) {
			i++;
			System.out.println(i+": "+soFar);
			return;
			
		} else {
			for (int i = 0; i < rest.length(); i++) {
				String remaining = rest.substring(0, i)  + rest.substring(i+1);
				RecPermute(soFar + rest.charAt(i), remaining);
			}
		}
	}

}
