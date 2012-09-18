import java.awt.Point;
import java.util.ArrayList;


public class Robu {


final static int ROWS = 3;
	final static int COLS = 3;
	static int[][] maze = new int[ROWS][COLS];
	
	static ArrayList<Point> path = new ArrayList<Point>();
	
	
	
	public static void findDest(int i , int j){
		if(i < 0 || j < 0 || i >= ROWS || j >= COLS){
			return ;
		}else{
			if(i == ROWS - 1 && j == COLS - 1 ){
				maze[i][j] = 1;
				if(validatePath()){
					path.add(new Point(i,j));
					System.out.println("\n--------- Correct Path--------------------");


printPath();
					path.remove(path.size()-1);
				}
				maze[i][j] = 0;
			}else{
				//System.out.println("\n-----------------------------");
				//System.out.println("For i :: " + i + " j :: " + j);
				//printPath();
				if(maze[i][j] == 0){
					maze[i][j] = 1;
					path.add(new Point(i,j));
					findDest(i - 1, j);
					findDest(i + 1, j);
					findDest(i , j - 1);
					findDest(i , j + 1);
					path.remove(path.size()-1);
					maze[i][j] = 0;
				}else{
					return;
				}
			}
		}
		
	}
	
	public static boolean validatePath(){
		for(int i =0 ; i < ROWS;i++){
			for(int j =0 ; j < COLS;j++){
				if(maze[i][j]==0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void printPath(){
		System.out.println("\nnext path : ");
		for(Point i : path){
			System.out.print("(" + i.x + "," + i.y +")");
		}
	}
	
	public static void main(String[] args){
		for(int i =0 ; i < ROWS;i++){
			for(int j =0 ; j < COLS;j++){
				maze[i][j]=0;
			}
		}
		//maze[1][1] = 1;
		findDest(0, 0);
	}
}

