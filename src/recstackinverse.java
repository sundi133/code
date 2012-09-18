
public class recstackinverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackX s = new StackX();
		s.push(10);
		s.push(9);
		s.push(8);
		s.push(7);
		s.push(6);
		
		
		
		reverse(s);
		while(!s.isEmpty()){
			System.out.print(s.pop());
		}
		
		//int initialAmount=15; 
		//String betResults = "LLLWLLLL";
		//int amount = getFinalAmount(initialAmount, betResults);
		//System.out.print(amount);
		
	}
	public static void reverse(StackX s) {
        if (s.isEmpty()) return;
        int last = getLast(s);
        // reverse the remaining stack
        reverse(s);
        // put the last element on the top
        s.push(last);
    }
 
    // retrieve and remove the deepest element of the stack
    public static int getLast(StackX s) {
        int a = s.pop();
        if (s.isEmpty()) {
            return a;
        } else {
            int last = getLast(s);
            s.push(a);
            return last;
        }
    }
	
	public static int getFinalAmount(int initialAmount , String betResults) {
		//return initialAmount;
		int initam=1;
		int sum=initialAmount;
		int incr=1;
		int prev=0;
		//System.out.println(betResults.length());
		try{
			
		
		for(int k=0;k<betResults.length();k++){
			
			int bet=initam;
			
			
				if(bet > sum)
					return sum;
			
			
			char c= betResults.charAt(k);
			if(c=='L'){
				initam=bet*2;
				
				if(bet<0)
					incr=1;
				else{
					incr=-1;
				}
				prev=0;//lose
			}else if(c=='W'){
				initam=1;
				incr=1;
				prev=1;//win
				
			}
			
			
			System.out.println(sum + ", " + initam + ", " +bet + ", " + incr);
			sum+=initam*incr;
			
			
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return sum;

	}

	private static void reverse(StackX s, int i) {
		int tmp=0;
		if(!s.isEmpty()){
			 tmp= s.pop();
			 reverse(s,tmp);
			 s.push(tmp);
		}else{
			s.push(i);
		}
			
		
		
	}

}
