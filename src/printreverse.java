
public class printreverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="geeksforgeeks";
		printrev(s,0);

	}

	private static void printrev(String s,int i) {
		//System.out.println(i);
		if(i==s.length())
			return;
        printrev(s,i+1);
		System.out.print(s.charAt(i));
		
	}

}
