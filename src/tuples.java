import java.util.ArrayList;


class bstNode{
	
	int key;
	int value;
	
	public bstNode(String keyval){
		key = Integer.parseInt(keyval.split(",")[0]);
		value = Integer.parseInt(keyval.split(",")[1]);
	}
	
	public int compare(bstNode node){
		if(value > node.value)
			return 1;
		else return -1;
	}
	
	public int getKey(){
		return key;
	}
	
	public int getValue(){
		return value;
	}
}
public class tuples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] vals={"1,3", "8,6", "10, 11", "19, 4", "23, 9"};
		ArrayList<bstNode> list = new ArrayList<bstNode>();
		for(int k=0;k<vals.length;k++){
			bstNode bn=new bstNode(vals[k]);
			list.add(bn);
		}
		search(list,6);

	}

	private static void search(ArrayList<bstNode> list, int i) {
		
		
		
	}

}
