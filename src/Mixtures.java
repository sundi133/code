import java.util.ArrayList;


public class Mixtures {

	private static final int MAXINT = 1000000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String inp = "40 60 20";


		String[] mix=inp.split(" ");

		ArrayList inplist = new ArrayList();
		int len=mix.length;
		int[] mixI = new int[len];
		int[] minmix = new int[len];
		for(int k=0;k<mix.length;k++){
			//inplist.add(mix[k]);
			mixI[k]=Integer.parseInt(mix[k]);
		}

		int min=0;
		//int mix[]=new int[100];
		for(int rnd=1;rnd<len;rnd++){


			for(int k=1;k<len;k++){
				for(int j=k;j<k;j++){
					//(a+b) mod 100
					//min[i] = mini(min[i-1] )
					//minmix[k][j]=
				}

			}
		}

		// length[p] = n + 1

	}

}
