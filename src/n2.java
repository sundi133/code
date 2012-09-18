
public class n2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int[] a = new int[2*n]; 
		put(a, n); 



	}

	private static void put(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i>0){ 
			for(int j=0;j<a.length-i-1;j++){ 
				if(a[j]==0 && a[j+i+1]==0){ 
					a[j]=i; 
					a[j+i+1]=i; 
					put(a, i-1); 
					a[j]=0; 
					a[j+i+1]=0; 

				} 
			} 
		}else if(i==0){ 

			for (int k : a) { 
				System.out.print(k +" "); 
			} 

			System.out.println(); 
		} 
	}

}
