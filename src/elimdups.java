
public class elimdups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abashasasa";
		int[] sofar=new int[26];
		eliminate(str.toUpperCase(),sofar,0);

	}

	private static void eliminate(String str, int[] sofar, int i) {
		if(i>str.length()-1){
			for(int j=0;j<26;j++){
				if(sofar[j]==1){
				char c= (char) (j+65);
				System.out.print(c);
				}
			}
				
		}
		else{
			int k= str.charAt(i)-65;
			System.out.println(k);
			if(sofar[k]==1){
				eliminate(str,sofar,i+1);
			}else{
				sofar[k]=1;
				eliminate(str,sofar,i+1);
			}
			}	
		
	}

}
