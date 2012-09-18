
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcbd";
		
		int sum = minsteps(str,0,str.length()-1);
		System.out.println(sum);

	}

	private static int minsteps(String str, int i, int length) {
		if(i>=length){
			return 0;
		}
		if(str.length()==1){
			return 0;
		}
		int min1=str.length();
		int min2=str.length();
		int min3=str.length();
		if(str.charAt(i)==str.charAt(length)){
			min1=minsteps(str, i+1, length-1);
			return min1;
		}else{
			min2 =minsteps(str, i, length-1)+1;
			min3 =minsteps(str, i+1, length)+1;
			return min2>min3?min3:min2;
		}
		
		
		
	}

}
