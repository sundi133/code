
class Stacktmp{
	
	int top=-1;
	int size=100;
	
	int[] stackelems ; 

	public void Stacktmp(){
		stackelems = new int[size];
	}
	
	public int pop(){
		int tmp=stackelems[top];
		top--;
		return tmp;
		
	}
	
	public void push(int item){
		top++;
		stackelems[top]=item;
		
	}
	
	public int peek(){
		return stackelems[top];
	}
	
}

class TNode{
	int data;
	TNode left;
	TNode right;
}
class BSTree{
	TNode root;
	
	public void  insert(int data){
		if(root==null){
			TNode root = new TNode();
		}
		
	}
	
}
public class stackClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		

	}

}
