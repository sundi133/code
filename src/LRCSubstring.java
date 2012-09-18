
public class LRCSubstring {

	public static void main(String[] args) {
		
		
		String str= new String("abcaadcbacd");
		
		int maxl=0;
		int index=0;
		String tmp= new String("");
		int len=0;
		int start_index=0;
		for(int k=0;k<str.length();k++){
			String kmp= str.substring(k,k+1);
			
			if(tmp.indexOf(kmp)!=-1){
	
				//System.out.println("1");
				tmp=null;
				tmp = new String();
				len=0;
			}else{
				
				tmp+=kmp;
				len++;
				
				if(maxl<len){
					//System.out.println("2" + tmp);
					maxl=len;
				    start_index = k;
				}
				
			}
			
		}
		System.out.println(maxl + ", "+ str.substring(start_index-maxl, start_index));
	}
}
