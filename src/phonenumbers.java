import java.util.ArrayList;


public class phonenumbers {

	/**
	 * @param args
	 */
	public static String mappings[][] = {
		{"0"}, {"1"}, {"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"},
		{"J", "K", "L"}, {"M", "N", "O"}, {"P", "Q", "R", "S"}, 
		{"T", "U", "V"}, {"W", "X", "Y", "Z"}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phone = "3333456789";
		ArrayList<String> list= generateAllnums(phone,"",0);
	}

	private static ArrayList<String> generateAllnums(String phone,String sofar,int j) {
		// TODO Auto-generated method stub

		//System.out.println(phone);
		if(phone.isEmpty()){
			System.out.println(sofar);
			for(int k1=0;k1<sofar.length();k1++){
				int m=sofar.toLowerCase().charAt(k1)-48;
				if(m==-16)
					continue;
				int i=k1;
				while(true && i<sofar.length()-2){
					if(sofar.charAt(i+1)==' ')
						break;
					else if(sofar.charAt(i+1)==sofar.charAt(k1)){
						i++;
					}else{
						break;
					}
						
				}
				i=i-k1;
				//System.out.print(" " + m +", " + i + " ");
				System.out.print(mappings[m][i%3]);
				k1=k1+i;
			}
			System.out.println();
			
			return null;
		}
		int num= phone.charAt(j);
		int k=0;
		for(int i=j+1;i<phone.length();i++){
			if(phone.charAt(i)==num){
				k++;
			}
		}

		if(k!=0){

				int p=0;
				ArrayList<String> list2= generateAllnums(phone.substring(p+1), sofar+phone.charAt(p)+ " ", 0);
				ArrayList<String> list3= generateAllnums(phone.substring(p+1), sofar+phone.charAt(p), 0);

		}
		else{
			ArrayList<String> list1= generateAllnums(phone.substring(1), sofar+phone.charAt(0), 0);
		}
		return null;

	}

}
