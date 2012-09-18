
interface Tree {
 public void add(int currentData);
 public Node search(int data);
}

class Node {
	 Node left;
	 Node right;
	 Node parent;
	 int data;
}

 public class LCA implements Tree{
	  
	 private Node root;
	  
	 public void add(int currentData){
	  if(root == null){
	   root = new Node();
	   root.data = currentData;
	   return;
	  }
	  add(currentData, root);
	 }
	  
	 private void add(int currentData, Node position){
	  if(currentData<position.data){
	   if(position.left==null){
	    position.left = new Node();
	    position.left.data = currentData;
	    position.left.parent = position;
	    return;
	   }
	   add(currentData, position.left);
	  }else{
	   if(position.right==null){
	    position.right = new Node();
	    position.right.data = currentData;
	    position.right.parent = position;
	    return;
	   }
	   add(currentData, position.right);
	  }
	 }
	  
	 public Node search(int searchData){
	  if(root == null){
	   return null;
	  }
	  return search(searchData, root);
	 }
	  
	 /*
	  * O(log n) on average case
	  */
	 private Node search(int searchData, Node node){
		 //System.out.println("sund" + searchData);
		 //System.out.println("sund" + node.data);
		 if(node==null)
			 return null;
	  if(node.data == searchData){
	   return node;
	  }
	  if(searchData < node.data){
	   return search(searchData, node.left);
	  }else{
	   return search(searchData, node.right);
	  }
	 }
	  
	 public void printOrdered(){
	  if(root == null){
	   return;
	  }
	  printOrdered(root);
	 }
	  
	 //DO A IN ORDER TRAVERSAL
	 //VISIT LEFT
	 //VISIT ROOT
	 //VISIT RIGHT
	 public void printOrdered(Node node){
	  if(node.left != null){
	   printOrdered(node.left);
	  }
	  System.out.println(node.data);
	  if(node.right!=null){
	   printOrdered(node.right);
	  }
	 }
	  
	 public void printValues(){
	  print(root);
	 }
	  
	 private void print(Node node){
	  if(node == null){
	   return;
	  }else{
	   print(node.left);
	   print(node.right);
	  }
	 }
	  
	 public static void main(String args[]){
	  LCA bTree = new LCA();
	  int[] arr= new int[10];
	  for(int i=0;i<10;i++){
	   int t = (int)(Math.random()*20);
	   //System.out.println(t);
	   bTree.add(t);
	   arr[i]=t;
	   
	  }
	  //bTree.printValues();
	  /*for(int i=0;i<10;i++){
	   int t = (int)(Math.random()*20);
	   System.out.println("For i="+t+": "+bTree.search(t));
	  }*/
	  System.out.println();
	  bTree.printOrdered();
	  System.out.println();
	  for(int k=0;k<10;k++){
		  System.out.println(arr[k]);  
	  }
	  System.out.println("LCA of " +arr[4] + "," + arr[6] + "---"+ bTree.getLCA(arr[4],arr[6]).data);
	 }

	private Node getLCA(int i, int j) {
		
		return getLCA(root,i,j);
	}

	private Node getLCA(Node pnode, int i, int j) {
		// TODO Auto-generated method stub
		if(pnode==null)
			return null;
		if(i<pnode.data && j<pnode.data)
			getLCA(pnode.left, i, j);
		if(i>pnode.data && j>pnode.data)
			getLCA(pnode.right, i, j);
		
		
		return pnode;
	}
	}
