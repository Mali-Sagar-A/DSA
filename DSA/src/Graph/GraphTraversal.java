package Graph;

import java.util.Scanner;

public class GraphTraversal {

	public static void main(String[] args) {
		BFS_Traversal BF = new BFS_Traversal(9);
		DFS_Traversal DF = new DFS_Traversal(12);
		
		BF.create_graph();
		BF.BFS_Traversal(1);
		
		DF.insert_edge(0, 1);
		DF.insert_edge(0, 3);
		DF.insert_edge(1, 2);
		DF.insert_edge(1, 5);
		DF.insert_edge(1, 4);
		DF.insert_edge(2, 3);
		DF.insert_edge(2, 5);
		DF.insert_edge(3, 6);
		DF.insert_edge(4, 7);
		DF.insert_edge(5, 7);
		DF.insert_edge(5, 6);
		DF.insert_edge(5, 8);
		DF.insert_edge(6, 9);
		DF.insert_edge(8, 9);
		DF.insert_edge(7, 8);
		
		DF.DF_Traversal(0);
		System.out.println();
		
		DF.display();
		
		
		
}
}