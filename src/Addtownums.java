
public class Addtownums {

	public static void main(String[] args) {
		int y =2;
	
		int x=1100;
		System.out.println(addnums(x,y));
		System.out.println(add(x,y));
	}

	private static int addnums(int x, int y) {
		// TODO Auto-generated method stub
		if(x==0) 
			return y;
		else if (y==0)
			return x;
		else{
			return addnums( ((x & y) << 1) , x^y);
		}
	}
	private static int add(int x, int y) {
	    int carry = 0;
	    int result = 0;
	    int i;

	    for(i = 0; i < 32; ++i) {
	        int a = (x >> i) & 1;
	        int b = (y >> i) & 1;
	        result |= ((a ^ b) ^ carry) << i;
	        carry = (a & b) | (b & carry) | (carry & a);
	    }

	    return result;
	}

	
}
