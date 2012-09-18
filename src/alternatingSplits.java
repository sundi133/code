
class Lnode{
	int data;
	Lnode next; 
	public Lnode(int num) {
		data =num;
		next =null;
		
	}
}
public class alternatingSplits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lnode head = new Lnode(1);
		addtoLL(head,2);
		addtoLL(head,3);
		addtoLL(head,4);
		/*addtoLL(head,5);
		addtoLL(head,6);
		addtoLL(head,7);
		addtoLL(head,8);*/
		
		printList(head);

	}

	private static void printList(Lnode head) {
		Lnode tmp=head;
		while(tmp.next!=null){
			System.out.print(" " + tmp.data);
			tmp=tmp.next;
		}
		
	}

	private static void addtoLL(Lnode head, int i) {
		Lnode tmp= head;
		while(tmp.next!=null){
			tmp=tmp.next;
			System.out.println("t");
		}
			
		System.out.println("t1" + i);
		Lnode node = new Lnode(i);
		tmp.next=node;
		
	}

}
