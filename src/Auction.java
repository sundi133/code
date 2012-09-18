import java.util.Scanner;

class aVertex {
	int cost;
	int weight;
	int index;
	
	public aVertex(int i,int j,int k){
		cost=i;
		weight=j;
		index=k; 
	}
	
	public int getindex(){
		return index;
	}
	
	public int getcost(){
		return cost;
	}
	
	public int getweight(){
		return weight;
	}
	
	
	public int compare(aVertex a){
		if(weight <= a.weight && cost<=a.cost)
			return -1;
		else
			return 1;
				
	}
}

class aTopSort {
	  private final int MAX_VERTS = 20;

	  private aVertex vertexList[]; // list of vertices

	  private int matrix[][]; // adjacency matrix

	  private int numVerts; // current number of vertices

	  private char sortedArray[];

	  public aTopSort() {
	    vertexList = new aVertex[MAX_VERTS];
	    matrix = new int[MAX_VERTS][MAX_VERTS];
	    numVerts = 0;
	    for (int i = 0; i < MAX_VERTS; i++)
	      for (int k = 0; k < MAX_VERTS; k++)
	        matrix[i][k] = 0;
	    sortedArray = new char[MAX_VERTS]; // sorted vert labels
	  }

	  public void addVertex(int lab) {
	    //vertexList[numVerts++] = new aVertex(lab);
	  }

	  public void addEdge(int start, int end) {
	    matrix[start][end] = 1;
	  }

	  public void displayVertex(int v) {
	    System.out.print(vertexList[v].label);
	  }

	  public void topo() // toplogical sort
	  {
	    int orig_nVerts = numVerts; 

	    while (numVerts > 0) // while vertices remain,
	    {
	      // get a vertex with no successors, or -1
	      int currentVertex = noSuccessors();
	      if (currentVertex == -1) // must be a cycle
	      {
	        System.out.println("ERROR: Graph has cycles");
	        return;
	      }
	      // insert vertex label in sorted array (start at end)
	      sortedArray[numVerts - 1] = vertexList[currentVertex].label;

	      deleteVertex(currentVertex); // delete vertex
	    }

	    // vertices all gone; display sortedArray
	    System.out.print("Topologically sorted order: ");
	    for (int j = 0; j < orig_nVerts; j++)
	      System.out.print(sortedArray[j]);
	    System.out.println("");
	  }

	  public int noSuccessors() // returns vert with no successors (or -1 if no such verts)
	  { 
	    boolean isEdge; // edge from row to column in adjMat

	    for (int row = 0; row < numVerts; row++) {
	      isEdge = false; // check edges
	      for (int col = 0; col < numVerts; col++) {
	        if (matrix[row][col] > 0) // if edge to another,
	        {
	          isEdge = true;
	          break; // this vertex has a successor try another
	        }
	      }
	      if (!isEdge) // if no edges, has no successors
	        return row;
	    }
	    return -1; // no
	  }

	  public void deleteVertex(int delVert) {
	    if (delVert != numVerts - 1) // if not last vertex, delete from vertexList
	    {
	      for (int j = delVert; j < numVerts - 1; j++)
	        vertexList[j] = vertexList[j + 1];

	      for (int row = delVert; row < numVerts - 1; row++)
	        moveRowUp(row, numVerts);

	      for (int col = delVert; col < numVerts - 1; col++)
	        moveColLeft(col, numVerts - 1);
	    }
	    numVerts--; // one less vertex
	  }

	  private void moveRowUp(int row, int length) {
	    for (int col = 0; col < length; col++)
	      matrix[row][col] = matrix[row + 1][col];
	  }

	  private void moveColLeft(int col, int length) {
	    for (int row = 0; row < length; row++)
	      matrix[row][col] = matrix[row][col + 1];
	  }

}



public class Auction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int i=0;
		
		while(i<num){
			int n=in.nextInt();
			int[] p = new int[n];
			int[] w = new int[n];
			p[0]=in.nextInt();
			w[0]=in.nextInt();
			int m=in.nextInt();
			int k=in.nextInt();
			
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			int d=in.nextInt();
		
			aTopSort g = new aTopSort();
			for(int x=1;x<n;x++){
				p[x]=((a*p[x-1]-1 + b) % m) + 1; 
				w[x]=((c*w[x-1]-1 + d) % k) + 1;
				aVertex node= new aVertex(p[x],w[x],x);
				add(g,node);
				
				
			}
			i++;
			
		}

	}

	private static void add(aTopSort g, aVertex node) {
		
		for
		g.addEdge(start, end)
	}

}
