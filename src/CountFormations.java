import java.util.Arrays;


public class CountFormations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sides={3,6,8,10};
		System.out.println("res "+countFormations(sides));

	}

	public static long countFormations(int[] sides) {
	    Arrays.sort(sides);
	    long[][] ret = new long[sides.length][sides[sides.length - 1]];
	    for (int i = 0; i < sides[0]; i++)
	        ret[0][i] = 1;
	    for (int i = 1; i < sides.length; i++)
	        for (int j = 0; j < sides[i]; j++)
	            for (int k = 0; k <= j; k++)
	                ret[i][j] += ret[i - 1][k];
	    long res = 0;
	    for (int i = 0; i < sides[sides.length - 1]; i++)
	        res += ret[sides.length - 1][i];
	   
	    for (int i = 1; i < sides.length; i++){
	        for (int j = 0; j < sides[sides.length-1]; j++){
	        	System.out.print( " "+ ret[i][j]);
	        }
	    	System.out.println();
		}
	    
	    return res;
	}
}
