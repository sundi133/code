
public class changedenoms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int deno[]= {10, 5, 1};
		int cost = 25;
		int cash = 10;
		int  change = 10;
		//System.out.println(change);
		//int res= numdenoms(change,deno);
		int res= makeChange(change, 1);
		System.out.println(res);

	}

	private static int numdenoms(int change, int[] deno) {
		// TODO Auto-generated method stub

		System.out.print( "" + change);
		if(change==0)
			return 1;
		else if(change<0){
			return 0;
		}
		int cnt=0;

		for(int k=0;k<deno.length;k++){
			if(change-deno[k]>=0)
				cnt+=numdenoms(change-deno[k], deno);
		}
		System.out.println(" , " + cnt);
		return cnt;

	}

	public static int makeChange(int n, int denom) {
		int next_denom = 0;
		switch (denom) {
		case 25:
			next_denom = 10;
			break;
		case 10:
			next_denom = 5;
			break;
		case 5:
			next_denom = 1;
			break;
		case 1:
			return 1;
		}
		int ways = 0;
		for (int i = 0; i * denom <= n; i++) {
			ways += makeChange(n - i * denom, next_denom);
		}
		return ways;
	}
}
