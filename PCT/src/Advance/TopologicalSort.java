package Advance;


import java.io.*;
import java.util.*;

public class TopologicalSort {

	private int V;
	private LinkedList<Integer> adj[];
	private Vector<Integer> adjustNodes = new Vector<Integer>();

	public TopologicalSort(int v) {
		this.V = v;
		adj = new LinkedList[v];

		for (int i = 0; i < v; i++)
			adj[i] = new LinkedList();

		for (int i = 0; i < v; i++)
			adjustNodes.add(0);

		// Print contents of stack
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
		adjustNodes.set(adjustNodes.get(w), 1);
	}

	void topologicalSort() {
		Stack stack = new Stack();

		// Mark all the vertices as not visited
		boolean visited[] = new boolean[V];

		for (int i = 0; i < V; i++)
			visited[i] = false;

		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				topologicalSortUtil(i, visited, stack);

		// Print contents of stack
		while (stack.empty() == false)
			System.out.print(stack.pop() + " ");

		Vector<Integer> res = new Vector<>();
		alltopologicalSort(res, visited);
	}

	void topologicalallSort() {

		boolean visited[] = new boolean[V];

		for (int i = 0; i < V; i++)
			visited[i] = false;

		Vector<Integer> res = new Vector<>();
		alltopologicalSort(res, visited);
	}

	void topologicalSortUtil(int i, boolean[] vistied, Stack stack) {

		vistied[i] = true;

		Iterator<Integer> iteratior = adj[i].iterator();

		while (iteratior.hasNext()) {
			int next = iteratior.next();
			if (!vistied[next]) {
				topologicalSortUtil(next, vistied, stack);
			}
		}

		stack.push(i);

	}

	void alltopologicalSort(Vector<Integer> vector, boolean[] vistied) {
		boolean flag = false;
		for (int i = 0; i < V; i++) {

			if (adjustNodes.get(i) == 0 && vistied[i] != true) {
				Iterator<Integer> iteratior = adj[i].iterator();

				while (iteratior.hasNext()) {
					int next = iteratior.next();
					adjustNodes.set(next, adjustNodes.get(next) - 1);
				}

				vector.addElement(i);
				vistied[i] = true;
				alltopologicalSort(vector, vistied);

				vistied[i] = false;
				vector.remove(vector.size() - 1);
				while (iteratior.hasNext()) {
					int next = iteratior.next();
					adjustNodes.set(adjustNodes.get(next), adjustNodes.get(next) - 1);
				}
				flag = true;
			}
		}

		if (!flag) {
			for (int i = 0; i < vector.size(); i++)
				System.out.print(vector.get(i));
			System.out.println();
		}

	}

	// Driver method
	public static void main(String args[]) {
		// Create a graph given in the above diagram
		
		TopologicalSort g = new TopologicalSort(6);
		    g.addEdge(5, 2);
		    g.addEdge(5, 0);
		    g.addEdge(4, 0);
		    g.addEdge(4, 1);
		    g.addEdge(2, 3);
		    g.addEdge(3, 1);

		System.out.println("Following is a Topological " + "sort of the given graph");

		g.topologicalallSort();
		
		System.out.println("Following is a Topological " + "sort of the given graph");
		
		g.topologicalSort();
	}
}
