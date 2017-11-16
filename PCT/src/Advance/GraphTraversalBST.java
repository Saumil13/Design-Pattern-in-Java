package Advance;

import java.util.*;

public class GraphTraversalBST {

	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists

	public GraphTraversalBST(int v) {
		// TODO Auto-generated constructor stub
		V = v;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public void BFS(int value) {
		// set as false)
		boolean visited[] = new boolean[V];
		 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[value]=true;
        queue.add(value);
		
		while (queue.size() != 0) {
			
			value = queue.poll();
			System.out.println(value);
			
			Iterator<Integer> i = adj[value].listIterator();
			while (i.hasNext()) {
				int ite = i.next();
				if (!visited[ite]) {
					
					visited[ite] = true;
					queue.add(ite);
				}
			}
		}
		
	}
	
	
	public void DFS(int s){
		boolean visited[] = new boolean[V];
		DFSUntill(s,visited);
	}
	
	void DFSUntill(int s, boolean[] visited){
		visited[s] =true;
		System.out.println(s);
		
		Iterator<Integer> value= adj[s].listIterator();
		
		while(value.hasNext()){
			int temp = value.next();
			if(!visited[temp])
				DFSUntill(temp, visited);
		}
		
	}

	public static void main(String args[]) {
		GraphTraversalBST g = new GraphTraversalBST(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS(2);
		

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		
		g.DFS(2);
	}
}
