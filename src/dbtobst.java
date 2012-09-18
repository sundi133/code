
class DBNode{
	
	int value;
	DBNode next;
	DBNode prev;

	
}

public class dbtobst {

	/**
	 * @param args
	 */
	DBNode root=null;
	static int global=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DBNode root = DBNode(1);
		int[] arr={1,2,3,4,5,6,7};

		DBNode r = new DBNode();
		DBNode RO= genall(arr,0,arr.length-1,"",r);
		System.out.println("total " +  global);
		
	}
	
	public static void printinorder(DBNode root) {
        if(root==null)
            return;
        else{
            printinorder(root.prev);
            System.out.print(" " + root.value );
            printinorder(root.next);
        }
        return;
        
    }
	 public boolean search(DBNode node, int item){
	        if(node.value==item)
	            return true;
	        else if(item<node.value){
	            return search(node.prev,item);
	        }else if(item>node.value){
	            return search(node.next,item);
	        }
	        return false;
	    }

	private static DBNode genall(int[] arr, int i, int j, String string,DBNode root) {
		System.out.println(i+", " + j + ", " + string);
		if(i<0||j<0||j>arr.length-1||i>arr.length-1)
			return null;
		if(i==j){
			if(root == null)
			{
				DBNode root1= new DBNode();
				root1.value=arr[i];
				root1.prev=null;
				root1.prev=null;
				string=string+arr[i];
				return root1;
			}
		}
		
		for(int k=i;k<j;k++){
			root= new DBNode();
			root.value=arr[k];
			root.prev=genall(arr,i,k-1,string,root.prev);
			root.next=genall(arr,k+1,j,string,root.next);
			//if(string.length()==arr.length)
			//System.out.println(countnum(root) + " " +(j-i+1));
			
					//+ countnum(root));
			//printinorder(root);
			//if(countnum(root)==j-i+1){
				global++;
				System.out.println("tree q");
				printinorderQue(root);
			//}
				
		}
		return root;
	}
	
	private static void printinorderQue(DBNode root) {
		StackX st = new StackX();
			st.push(root);
		DBNode rootl = new DBNode();
		while(!st.isEmpty()){
			DBNode root1=st.popNode();
			if(root1==null)
				break;
			st.push(root1.next);
			st.push(root1);
			st.push(root1.prev);
			
		}
		while(!st.isEmpty()){
			DBNode root1=st.popNode();
			if(root1!=null)
				System.out.println(root1.value);	
		}
		
		
	}

	private static int countnum(DBNode root2) {
		// TODO Auto-generated method stub
		
	        if(root2==null)
	            return 0;
	        else{
	            return countnum(root2.prev) + countnum(root2.next)+1;
	            
	        }
	        
	        
	    
	}

	private static void genall(int[] arr,int i,int j) {
		// TODO Auto-generated method stub

			System.out.println(i+", " + j);
			if(i==j)
			return ;
			if(i==arr.length)
				return ;
			for(int k=i+1;k<arr.length;k++){
				genall(arr,i,k-1);
				genall(arr,k+1,arr.length);
			}
			return ;

	}

	

}
