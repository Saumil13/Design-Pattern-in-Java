package Advance;


import java.util.Iterator;
import java.util.LinkedList;

public class GraphIsTree {

	private int V; // No. of vertices
	private LinkedList<Integer> adj[];

	GraphIsTree(int v) {
		this.V = v;
		adj = new LinkedList[V];

		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}
	}

	void findRechableNode(int v) {
		boolean[] visited = new boolean[V];

		findRechableNode(v, visited);
	}

	void findRechableNode(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		int next;

		Iterator<Integer> iterator = adj[v].iterator();

		while (iterator.hasNext()) {
			next = iterator.next();

			if (!visited[next])
				findRechableNode(next, visited);
		}

	
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	boolean isCycle(int v, Boolean[] visited, int parent) {
		boolean isCycle = false;

		visited[v] = true;
		int next;
		Iterator<Integer> iterator = adj[v].iterator();

		while (iterator.hasNext()) {
			next = iterator.next();

			if (!visited[next]) {
				if (isCycle(next, visited, v)) {
					return true;
				}
			} else if (next != parent) {
				return false;
			}
		}

		return isCycle;
	}

	boolean isTree() {

		Boolean visited[] = new Boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		if (isCycle(0, visited, -1))
			return false;

		for (int u = 0; u < V; u++)
			if (!visited[u])
				return false;

		return true;
	}

	public static void main(String[] args) {
		// Create a graph given in the above diagram
		GraphIsTree g1 = new GraphIsTree(5);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		if (g1.isTree())
			System.out.println("Graph is Tree");
		else
			System.out.println("Graph is not Tree");

		GraphIsTree g2 = new GraphIsTree(5);
		g2.addEdge(1, 0);
		g2.addEdge(0, 2);
		g2.addEdge(2, 1);
		g2.addEdge(0, 3);
		g2.addEdge(3, 4);

		if (g2.isTree())
			System.out.println("Graph is Tree");
		else
			System.out.println("Graph is not Tree");

		System.out.println("Find Reachable...");

			// find all reachable nodes from query[i]
		int arr[] = { 2, 3};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + ": ");
			g2.findRechableNode(arr[i]);
			System.out.println();
		}

	}
}
