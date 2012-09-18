
public class radixsort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[] arr= {3,4,7,2,2,6,0,9};
		

		int row=4;
		int col=arr.length/row;

		for(int k=0;k<col;k++){
			int sum=0;
			for(int i=0;i<row;i++){
				sum+=arr[col*i+k];
			}
			System.out.println("sum : " + k + ": " + sum);
		}
		/*for()
			
			//sort al the single digit
			//sort al the double digit
			//sort al the triple digit
			/*
			 * 9 97 1
			for each elem in single digit array
			largest in
			*/
		

	}

}
