package Advance;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;

public class TransitiveClosure {

	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists
	int sol[][];

	TransitiveClosure(int v) {
		this.V = v;
		adj = new LinkedList[V];
		sol = new int[V][V];

		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList();
		}

		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				sol[i][j] = 0;
			}
		}

	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	void DFS(int i) {

		// Mark all the vertices as not visited(By default
		// set as false)
		// boolean visited[] = new boolean[V];

		for (int index = 0; index < V; index++) {
			DFS(index, index);
		}
	}

	void DFS(int i, int j) {

		sol[i][j] = 1;

		Iterator<Integer> next = adj[i].listIterator();

		while (next.hasNext()) {
			int value = next.next();
			if (sol[i][value] == 0) {
				DFS(i, value);
			}
		}

	}

	void printSolution() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(sol[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		TransitiveClosure g = new TransitiveClosure(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

		g.printSolution();

		System.out.println();

		g.DFS(2);

		System.out.println();

		g.printSolution();

	}

}
