
public class chkRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="geeksforgeeks";
		String t ="eksforgeeksge";
		boolean val = chkRotation(s,t);
		System.out.println(val);

		findFNRepeatChar(s);
	}

	private static void findFNRepeatChar(String s) {
		int[] arr=new int[26];
		int[] fc=new int[s.length()];
		for(int j=0;j<s.length();j++)
			arr[j]=0;
		//int fc=0;
		int ind=0;
		for(int k=0;k<s.length();k++){
			int a =s.charAt(k)-96;
			if(arr[a]!=1){
				arr[a]=1;
				fc[ind++]=k;
				
			}else{
				arr[a]=arr[a]+1;
			}
			
		}
		
	}

	private static boolean chkRotation(String s, String t) {
		// TODO Auto-generated method stub
		String m = s+s;
		if(m.indexOf(t)!=-1)
			return true;
		else 
			return false;
	}

}
