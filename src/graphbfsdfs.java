

class StackX
{
	private final int SIZE = 50;
	private int[] st;
	private int top;
	private  DBNode[] stnode;
	private  BinaryTree.Node[] bnode;
	// ------------------------------------------------------------
	public StackX()           // constructor
	{
		st = new int[SIZE];    // make array
		stnode= new DBNode[SIZE];
		bnode= new BinaryTree.Node[SIZE];
		top = -1;
	}
	// ------------------------------------------------------------
	public void pushnod(BinaryTree.Node root1)   // put item on stack
	{ 
		top++;
		bnode[top] = root1; 
		//++top;
	}
	public BinaryTree.Node popNod()   // put item on stack
	{ 

		BinaryTree.Node tmp = bnode[top];
		top--;
		return tmp;  
		
	}
	// ------------------------------------------------------------
	public int pop()          // take item off stack
	{ 

		int tmp = st[top];
		top--;
		return tmp; 

	}
	// ------------------------------------------------------------
	public int peek()         // peek at top of stack
	{ return st[top]; }
	// ------------------------------------------------------------
	public boolean isEmpty()  // true if nothing on stack
	{ return (top == -1); }

	public int numberOfElements()  // true if nothing on stack
	{ 
		return (top + 1); 
	}
	// ------------------------------------------------------------
	public void pushdbnode(DBNode root) {
		// TODO Auto-generated method stub
		top++;
		stnode[top] = root;
		return;
	}
	public DBNode popdbnode() {
		// TODO Auto-generated method stub
		DBNode tmp = stnode[top];
		top--;
		return tmp;

	}
	public void push(int root) {
		// TODO Auto-generated method stub
		top++;
		st[top] = root;
		return;
	}

}  // end class StackX

class Queue
{
	private final int SIZE = 50;
	private int[] queArray;
	private int front;
	private int rear;

	public Queue()            // constructor
	{
		queArray = new int[SIZE];
		front = 0;
		rear = -1;
	}
	// -------------------------------------------------------------
	public void insert(int j) 
	{
		if(rear == SIZE-1)
			rear = -1;
		queArray[++rear] = j;
	}
	// -------------------------------------------------------------
	public int remove()       
	{
		int temp = queArray[front++];
		if(front == SIZE)
			front = 0;
		return temp;
	}
	// -------------------------------------------------------------
	public boolean isEmpty()  
	{
		return ( rear+1==front || (front+SIZE-1==rear) );
	}
	// -------------------------------------------------------------
}  // end class Queue

class Vertex
{
	public String label;        
	public boolean wasVisited;
	public int level;
	// -------------------------------------------------------------
	public Vertex(String lab)   
	{
		label = lab;
		wasVisited = false;
	}
	// -------------------------------------------------------------
} 
class Graph
{
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; // list of vertices
	private int adjMat[][];      // adjacency matrix
	private int nVerts;          // current number of vertices
	private Queue theQueue;
	private StackX theStack;
	boolean solutionfoundids=false;

	public Graph()               // constructor
	{
		vertexList = new Vertex[MAX_VERTS];
		// adjacency matrix
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++)      // set adjacency
			for(int k=0; k<MAX_VERTS; k++)   //    matrix to 0
				adjMat[j][k] = 0;
		theQueue = new Queue();
		theStack = new StackX();
	}  // end constructor
	// -------------------------------------------------------------
	public void addVertex(String lab)
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	// -------------------------------------------------------------
	public void addEdge(int start, int end)
	{
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	// -------------------------------------------------------------
	public void displayVertex(int v)
	{
		System.out.println( "--"+ vertexList[v].label + "--");
	}
	// -------------------------------------------------------------
	public void bfs()                   // breadth-first search
	{                                // begin at vertex 0
		vertexList[0].wasVisited = true; // mark it
		displayVertex(0);                // display it
		theQueue.insert(0);              // insert at tail
		int v2;

		while( !theQueue.isEmpty() )     // until queue empty,
		{
			int v1 = theQueue.remove();   // remove vertex at head
			// until it has no unvisited neighbors
			if(Integer.parseInt(vertexList[v1].label.toLowerCase().split(",")[0]) == 2){
				System.out.println("Jug1 is now filled with 2 Units");
				return ;
			}
			while( (v2=getAdjUnvisitedVertex(v1)) != -1 )
			{                                  // get one,
				vertexList[v2].wasVisited = true;  // mark it
				displayVertex(v2);                 // display it
				theQueue.insert(v2);               // insert it
			}   // end while
		}  // end while(queue not empty)

		// queue is empty, so we're done
		for(int j=0; j<nVerts; j++)             // reset flags
			vertexList[j].wasVisited = false;
	}  // end bfs()
	// -------------------------------------------------------------
	// returns an unvisited vertex adj to v
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j<nVerts; j++)
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		return -1;
	}  // end getAdjUnvisitedVertex()
	// -------------------------------------------------------------
	public void dfs() {
		vertexList[0].wasVisited = true;  // mark it
		displayVertex(0);                 // display it
		theStack.push(0);                 // push it

		while( !theStack.isEmpty() )      // until stack empty,
		{
			// get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1)                    // if no such vertex,
				theStack.pop();
			else                           // if it exists,
			{
				vertexList[v].wasVisited = true;  // mark it
				displayVertex(v);                 // display it
				theStack.push(v);                 // push it

				if(Integer.parseInt(vertexList[v].label.toLowerCase().split(",")[0]) == 2){
					System.out.println("Jug1 is now filled with 2 Units");
					System.out.println("Trace Path Node number ");
					while(!theStack.isEmpty()){
						System.out.print("-" + theStack.pop() + "-");
					}
					return ;
				}
			}
		}  // end while

		// stack is empty, so we're done
		for(int j=0; j<nVerts; j++)          // reset flags
			vertexList[j].wasVisited = false;

	}
	public void ids() {
		// TODO Auto-generated method stub
		int i=0;

		while(solutionfoundids==false){
			dfs(i);
			i++;
		}
	}
	private void dfs(int i) {
		vertexList[0].wasVisited = true;  // mark it
		System.out.println( "Trace " + i + " : ");
		displayVertex(0);                 // display it
		theStack.push(0);                 // push it

		while( !theStack.isEmpty() )      // until stack empty,
		{
			// get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1 || theStack.numberOfElements()>(i+1)){                    // if no such vertex,

				//if in IDS depth is greater than i , dont do anything.
				theStack.pop();

				//theStack.pop();
			}
			else                           // if it exists,
			{
				if(theStack.numberOfElements()>(i+1)){
					//if in IDS depth is greater than i , dont do anything.
					theStack.pop();
				}else{
					vertexList[v].wasVisited = true;  // mark it
					displayVertex(v);                 // display it
					theStack.push(v);                 // push it   
				}


				if(Integer.parseInt(vertexList[v].label.toLowerCase().split(",")[0]) == 2){
					System.out.println("Jug1 is now filled with 2 Units");
					System.out.println("Trace Path Node number ");
					solutionfoundids=true;
					while(!theStack.isEmpty()){
						System.out.print("-" + theStack.pop() + "-");
					}
					return ;
				}
			}

		}  // end while

		// stack is empty, so we're done
		for(int j=0; j<nVerts; j++)          // reset flags
			vertexList[j].wasVisited = false;

	}
	public void unmarkAllVert() {
		for(int j=0; j<nVerts; j++)          // reset flags
			vertexList[j].wasVisited = false;
	}
	public void addEdgeC(int start, int end) {

		adjMat[start][end] = 1;
		for(int k=0;k<nVerts;k++){
			if(adjMat[end][k] == 1){
				adjMat[start][k]=1;
			}
		}
		for(int k=0;k<nVerts;k++){
			if(adjMat[k][start] == 1){
				adjMat[k][end]=1;
			}
		}

	}
	public int dfscount() {
		int count=0;

		vertexList[0].wasVisited = true;  // mark it
		count++;
		displayVertex(0);                 // display it
		theStack.push(0);                 // push it

		int round=0;
		while( !theStack.isEmpty() )      // until stack empty,
		{
			System.out.println(theStack.peek());
			// get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1){
				theStack.pop(); // if no such vertex,
				round=count;
				for(int i=0;i<nVerts;i++){
					if(vertexList[i].wasVisited!=true){
						theStack.push(i);
						break;
					}
				}
			}

			else                           // if it exists,
			{
				if(vertexList[v].wasVisited!=true){

					vertexList[v].wasVisited = true;  // mark it
					displayVertex(v);                 // display it
					theStack.push(v);                 // push it
					count++;
				}
			}

		}  


		for(int j=0; j<nVerts; j++)         
			vertexList[j].wasVisited = false;

		System.out.println("c= " +count);
		return count;
	}
	public void simpledfs() {
		vertexList[0].wasVisited = true;  // mark it
		displayVertex(0);                 // display it
		theStack.push(0);                 // push it

		while( !theStack.isEmpty() )      // until stack empty,
		{
			// get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex( theStack.peek() );
			if(v == -1)                    // if no such vertex,
				theStack.pop();
			else                           // if it exists,
			{
				vertexList[v].wasVisited = true;  // mark it
				displayVertex(v);                 // display it
				theStack.push(v);                 // push it

			}
		}  // end while

		// stack is empty, so we're done
		for(int j=0; j<nVerts; j++)          // reset flags
			vertexList[j].wasVisited = false;


	}
	public void chktriangle() {
		Vertex v = vertexList[0];
		v.wasVisited=true;
		v.level=1;
		theStack.push(0);
		displayVertex(0);
		while(!theStack.isEmpty()){
			int ver = getAdjUnvisitedVertex(theStack.peek());
			if(ver==-1){
				theStack.pop();
				//take care of isolated vertices
				int i=0;
				//System.out.println("l1");
				while(vertexList[i].wasVisited==true && i<nVerts){
					i++;
					if(i>=nVerts){
						break;
					}

				}
				//System.out.println("l2");
				if(i>=nVerts){
					
				}else{
					vertexList[i].wasVisited=true;
					displayVertex(i);
					theStack.push(i);

				}
				

			}else{
				vertexList[ver].wasVisited=true;
				vertexList[ver].level =vertexList[theStack.peek()].level+1;
				//if(vertexList[ver].level - vertexList[theStack.peek()].level ==2)
				if(visited(ver)){
					System.out.println("Triangle exists");
				}
				displayVertex(ver);
				theStack.push(ver);

			}

		}


	}
	private boolean visited(int ver) {
		// TODO Auto-generated method stub
		for(int j=0;j<nVerts;j++){
			if(adjMat[ver][j]==1 && vertexList[j].wasVisited==true){
				if(vertexList[ver].level-vertexList[j].level == 2){
					return true;
				}
			}
		}
		return false;
	}

}  // end class Graph