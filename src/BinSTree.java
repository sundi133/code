class BNode{
    
    int data;
    BNode left;
    BNode right;
    
    

    public BNode(int item) {
        data=item;
        left=null;
        right=null;
    }


}

class DLList{
    
    
    BNode root;
    
    public void DLList(){
        root =null;
    }
    
    public DLList(BNode node){
        root=node;
        
        
    }
    
    public void traverse(BNode node){
        root = node;
        while(node.right!=root){
            System.out.println(" " + node.data);
            node=node.right;
        }
        return;
    }
}

class BinSrchTree{
    
    BNode root;
    
    public void BSTree(){
        root =null;
    }
    
    public BNode insert(BNode node,int data){
    if(node==null){
        node = new BNode(data);
    }else if(data<node.data){
        node.left = insert(node.left,data);
    }else if(data>node.data){
        node.right = insert(node.right,data);
    }else{
        System.out.println("Duplicate Data");
    }
    
    return node;
    }
    
    public boolean search(BNode node, int item){
        if(node.data==item)
            return true;
        else if(item<node.data){
            return search(node.left,item);
        }else if(item>node.data){
            return search(node.right,item);
        }
        return false;
    }

    public void printinorder(BNode root) {
        if(root==null)
            return;
        else{
            printinorder(root.left);
            System.out.print(" " + root.data );
            printinorder(root.right);
        }
        return;
        
    }

    public BNode toDLL(BNode root) {
        
        // l1=find largest node in left subtree
        // l2=find smallest node in right subtree
        // call toDLL(root.left)
        // call toDLL(root.right)
        // root.left  = l1
        // root.right = l2
        
        return root;
        
        
    }

	public void printinorderRange(BNode node, int i, int j) {
		if(node==null)
            return;
		else if(node.data < i ){
			printinorderRange(node.right,i,j);
						
		}else if(node.data > j){
			printinorderRange(node.left,i,j);
		}
        else{
        	printinorderRange(node.left,i,j);
            System.out.print(" " + node.data );
            printinorderRange(node.right,i,j);
        }
        return;
		
	}

	public boolean printancestor(BNode node, int i) {
		if(node==null)
            return false;
		else if(node.data == i ){
			System.out.print(" "+node.data);
			return true;
		}
        else{
        	if(printancestor(node.left, i)==true){
        		
        		System.out.print(" "+node.data);
        		return true;
        	}
        	else if(printancestor(node.right, i)==true){
        			
        		System.out.print(" "+node.data);
        		return true;
        	}
        	
        }
       return false;
		
	}

	public int printKSmallest(BNode node,int k) {
		
		if(node==null){
			return 0;
		}
		else{
			int l= printKSmallest(node.left, k);
			if(l+1==k){
				System.out.print(node.data);
				return 0;

			}else{
				int r = printKSmallest(node.right, k);
				return l+r+1;	
			}
			
		}
		
		
		
	}
    
    
    
}
public class BinSTree {

    
    public static void main(String[] args) {
        
        BinSrchTree bt = new BinSrchTree();
    
        BNode root = new BNode(10);
        bt.insert(root, 5);
        bt.insert(root, 3);
        bt.insert(root, 1);
        bt.insert(root, 2);
        bt.insert(root, 7);
        bt.insert(root, 8);
        bt.insert(root, 9);
        bt.insert(root, 16);
        bt.insert(root, 13);
        bt.insert(root, 11);
        bt.insert(root, 12);
        bt.insert(root, 17);

        bt.printinorder(root);
        System.out.println();
        bt.printinorderRange(root,5,13);
        System.out.println();
        bt.printancestor(root,12);
        System.out.println();
        int res = bt.printKSmallest(root,4);
        
        
        

        //bt2
        //BinTree bt2 = new BinTree();
        /*
        BNode root2 = new BNode(26);
        root2.left         = new BNode(10);
        root2.right         = new BNode(3);
        root2.left.left         = new BNode(4);
        root2.left.right         = new BNode(6);
        root2.right.right         = new BNode(3);
        boolean sumtree2 = checkSumtree(root2);
        System.out.println(sumtree2);*/

        

        
       /* BNode rootDDL= bt.toDLL(root);
        DLList dll =  new DLList(rootDDL);
        dll.traverse(rootDDL);
        */
        
        
        //boolean sumtree = checkSumtree(root);
        //System.out.println(sumtree);
                
    }

	private static boolean checkSumtree(BNode root) {
		if(root ==null || (root.left ==null && root.right==null))
			return true;
		int sumleftright = sumelems(root.left) + sumelems(root.right);
		//System.out.println(sumleftright + ", " + root.data);
		return ((sumleftright==root.data) && checkSumtree(root.left) && checkSumtree(root.right));
	}

	private static int sumelems(BNode node) {
		if(node==null)
			return 0;
		else
			return node.data + sumelems(node.left) + sumelems(node.right);
		
	}

}
