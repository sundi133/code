class qNode{
	
	int value;
	qNode left;
	qNode right;
	int level;
}
class QueNod{
	
	int front;
	int rear;
	qNode[] list = new qNode[10];
	public QueNod(){
		front=0;
		rear=-1;
	}
	public void push(qNode v){
		rear++;
		list[rear]=v;
	}
	public qNode remove(){
		
		return list[front--];
	}
	
	
}

public class BinaryTree {

	
  public static void main(String[] args) {
    new BinaryTree().run();
  }
 
  static class Node {
    Node left;
 
    Node right;
 
    int value;
 
    public Node(int value) {
      this.value = value;
    }
  }
 
  public void run() {
    // build the simple tree from chapter 11.
    Node root = new Node(5);
    //System.out.println("Binary Tree Example");
    //System.out.println("Building tree with root value " + root.value);
    insert(root, 1);
    insert(root, 8);
    insert(root, 6);
    insert(root, 3);
    insert(root, 9);
    //System.out.println("Traversing tree1 in order");
    //printInOrder(root);
    
    Node root1 = new Node(7);
    //System.out.println("Binary Tree Example");
    //System.out.println("Building tree with root value " + root.value);
    insert(root1, 4);
    insert(root1, 2);
    insert(root1, 10);
    insert(root1, 11);
    insert(root1, 12);
    //System.out.println();
    //System.out.println("Traversing tree2 pre order");
    //printPreOrder(root1);
    //printInOrder(root1);
    System.out.println();
    printPreOrderStack(root1);
    System.out.println();
    printlevels(root1);
    //printInOrder(root1);
    //System.out.println();
    //printasc(root,root1);
  }
 
  private void printlevels(Node root1) {
	
	  int level=0;
	  /*QueNod st = new QueNod();
	  qNode qn = new qNode();
	  qn.value = root1.value;
	  
	  //qn.left = root1.lef;
	  //qn.value = root1.value;
	   * */
	  
	   QueNod st = new StackX();
	   st.pushnod(root1);
	   StackX lev = new StackX();
	   lev.push(0);
	   
	  while(!st.isEmpty()){
		Node p = st.popNod();
		int lev1=0;
		if(!lev.isEmpty())
			 lev1= lev.pop();
		if(p!=null)
			System.out.print(" " + p.value);
		if(lev1==level){
			System.out.println();
			level=lev1+1;
		}
		if(p!=null){
		st.pushnod(p.right);
		st.pushnod(p.left);
		lev.push(level);
		}
		  
	  }
	
}

private void printPreOrderStack(Node root1) {
	if(root1==null)
		return;
	StackX a = new StackX();
	a.pushnod(root1);
	while(!a.isEmpty()){
		Node node = a.popNod();
		if(node==null){
			continue;
		}else{
			System.out.print(" " + node.value);
		}
			
		
		a.pushnod(node.right);
		a.pushnod(node.left);
	}
		
	
}

private void printPreOrder(Node root1) {
	  if(root1==null){
		  return ;
	  }
	  System.out.print(" "+root1.value);
	  printPreOrder(root1.left);
	  printPreOrder(root1.right);
	
}

private void printasc(Node root, Node root1) {
	  
	  try{
		  //System.out.println(root.value+" , "+root1.value);
	  }catch (Exception e) {
		// TODO: handle exception
		  //e.printStackTrace();
	}
	if(root==null && root1==null){
		return ;
	}else if(root==null && root1!=null){
		printasc(root, root1.left);
		System.out.print(" "+root1.value);
		printasc(root, root1.right);
	}else if(root!=null && root1==null){
		printasc(root.left, root1);
		System.out.print(" "+root.value);
		printasc(root.right, root1);
	}else{
		/*if(root.value < root1.value){
			printasc(root, root1.left);
			System.out.print(" "+root1.value);
			printasc(root, root1.right);
		}else{
			printasc(root.left, root1);
			System.out.print(" "+root.value);
			printasc(root.right, root1);
		}*/
		if(root.value < root1.value){
			printasc(root, root1.left);
			System.out.print(" "+root1.value);
			printasc(root, root1.right);
		}else{
			printasc(root.left, root1);
			System.out.print(" "+root.value);
			printasc(root.right, root1);
		}
	}
	
}

public void insert(Node node, int value) {
    if (value < node.value) {
      if (node.left != null) {
        insert(node.left, value);
      } else {
        //System.out.println("  Inserted " + value + " to left of "
            //+ node.value);
        node.left = new Node(value);
      }
    } else if (value > node.value) {
      if (node.right != null) {
        insert(node.right, value);
      } else {
        //System.out.println("  Inserted " + value + " to right of "
          //  + node.value);
        node.right = new Node(value);
      }
    }
  }
 
  public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.print( " " +node.value);
      printInOrder(node.right);
    }
  }
 
  /**
   * uses in-order traversal when the origin is less than the node's value
   * 
   * uses reverse-order traversal when the origin is greater than the node's
   * order
   */
  public void printFrontToBack(Node node, int camera) {
    if (node == null)
      return;
    if (node.value > camera) {
      // print in order
      printFrontToBack(node.left, camera);
      System.out.println("  Traversed " + node.value);
      printFrontToBack(node.right, camera);
    } else if (node.value < camera) {
      // print reverse order
      printFrontToBack(node.right, camera);
      System.out.println("  Traversed " + node.value);
      printFrontToBack(node.left, camera);
    } else {
      // order doesn't matter
      printFrontToBack(node.left, camera);
      printFrontToBack(node.right, camera);
    }
  }
 
}