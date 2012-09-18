
public class revrecstack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackX s = new StackX();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
		System.out.println("");
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		Queue q = new Queue();
		rev(s,q);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}

	}

	private static void rev(StackX s, Queue q) {
		if(s.isEmpty()){
			return ;
		}else{
			int num = s.pop();
			q.insert(num);
			rev(s,q);
			s.push(q.remove());
			
			
		}
		
		return;
		
	}

}
