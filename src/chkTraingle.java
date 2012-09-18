
public class chkTraingle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Graph g = new Graph();
		
		g.addVertex(1+"");
		g.addVertex(2+"");
		g.addVertex(3+"");
		g.addVertex(4+"");
		g.addVertex(5+"");
		g.addVertex(6+"");
		g.addVertex(7+"");
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(0, 3);
		//g.addEdge(0, 5);
		//g.simpledfs();
		g.chktriangle();

	}

}
