package Advance;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class MotherVertex {

	private int V;
	private LinkedList<Integer> adj[];

	public MotherVertex(int v) {
		V = v;
		adj = new LinkedList[v];

		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public void DFSUntil(int v, boolean[] vistied) {

		vistied[v] = true;
		System.out.println(v + ":" + vistied[v]);

		Iterator<Integer> findInterator = adj[v].iterator();

		// Recur for all the vertices adjacent to this vertex

		while (findInterator.hasNext()) {
			int value = findInterator.next();
			if (!vistied[value])
				DFSUntil(value, vistied);
		}
	}

	public int findMother() {
		boolean[] visited = new boolean[V];

		for (int i = 0; i < V; i++)
			visited[i] = false;

		int lastFinishedVertex = 0;
		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				DFSUntil(i, visited);
				lastFinishedVertex = i;
			}
		}

		for (int i = 0; i < V; i++)
			visited[i] = false;

		System.out.println(lastFinishedVertex);

		DFSUntil(lastFinishedVertex, visited);

		for (int i = 0; i < V; i++) {
			if (visited[i] == false) {
				return -1;
			}
		}
		return lastFinishedVertex;
	}

	boolean isReachable(int s, int d) {
		boolean[] visited = new boolean[V];

		for (int i = 0; i < V; i++)
			visited[i] = false;

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			s = queue.poll();

			Iterator<Integer> findInterator = adj[s].iterator();
			while (findInterator.hasNext()) {
				int value = findInterator.next();
				if(value == d)
					return true;
				if (!visited[value])
				{
					queue.push(value);
					visited[value] =true;
				}
				
				
			}
		}
		return false;
	}

	public static void main(String[] args) {

		MotherVertex g = new MotherVertex(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(4, 1);
		g.addEdge(6, 4);
		g.addEdge(5, 6);
		g.addEdge(5, 2);
		g.addEdge(6, 0);


		System.out.println("Mother Vertex: " + g.findMother());

		
		 // Create a graph given in the above diagram
		MotherVertex g1 = new MotherVertex(4);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 0);
        g1.addEdge(2, 3);
        g1.addEdge(3, 3);
 
        int u = 1;
        int v = 3;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
 
        u = 3;
        v = 1;
        if (g.isReachable(u, v))
            System.out.println("There is a path from " + u +" to " + v);
        else
            System.out.println("There is no path from " + u +" to " + v);;
	}

}
