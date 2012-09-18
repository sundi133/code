
public class testString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test= "greateribblizing";
		
		String res= printRes(test,0,0,"");
		System.out.println(res);
	}

	private static String printRes(String test, int j, int k,String res) {
		// TODO Auto-generated method stub
		String str="";
		if(j>=test.length())
			return res;
		if(k<3){
			if(test.charAt(j)=='a'||
					test.charAt(j)=='e'||
					test.charAt(j)=='i'||
					test.charAt(j)=='o'||
					test.charAt(j)=='u'){
				str=printRes(test, j+1, k+1,res+test.charAt(j));
				
			}else{
				str=printRes(test, j+1, k,res+test.charAt(j)+"");
			}
		}else{
			if(test.charAt(j)=='a'||
					test.charAt(j)=='e'||
					test.charAt(j)=='i'||
					test.charAt(j)=='o'||
					test.charAt(j)=='u'){
				str=printRes(test, j+1, k+1,res+test.charAt(j) + "^");
				
			}else{
				str=printRes(test, j+1, k,res+test.charAt(j)+"");
			}
		}
		return str;
	}

}
