public class Parenthesis {
	static int count=0;
    static void brackets(int openStock, int closeStock, String s) {
    	
        if (openStock == 0 && closeStock == 0) {
        	count++;
            System.out.println(s);
        }
        if (openStock > 0) {
            brackets(openStock-1, closeStock+1, s + "<");
        }
        if (closeStock > 0) {
            brackets(openStock, closeStock-1, s + ">");
        }
    }
    public static void main(String[] args) {
        brackets(4, 0, "");
        System.out.println(count);
    }
}