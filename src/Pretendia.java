import java.util.Scanner;


public class Pretendia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Graph w = new Graph();
		
		int n=5;
		int con=6;
		for(int k=0;k<n;k++){
			w.addVertex(""+k);
		}
		Scanner in = new Scanner(System.in);
		
		for(int k=0;k<con;k++){
			String s= in.nextLine();
			int start= Integer.parseInt(s.split(" ")[0]);
			int end= Integer.parseInt(s.split(" ")[1]);
			w.addEdgeC(start, end);
		}
		w.dfs();
		//int count =w.dfscount();
		//System.out.println("c= " +count);

	}

}
