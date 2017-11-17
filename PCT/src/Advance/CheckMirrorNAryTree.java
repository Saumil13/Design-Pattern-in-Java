package Advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public class CheckMirrorNAryTree {

	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		
		while(testcase-- >0) {
		    int v = scanner.nextInt();
		    int e = scanner.nextInt();
		    
		    Map<Integer, List<Integer>> adj1 = new HashMap<>();
		    for (int i=0; i<e; i++) {
		        int from = scanner.nextInt();
		        int to = scanner.nextInt();
		        
		        adj1.putIfAbsent(from, new ArrayList<>());
		        adj1.get(from).add(to);
		    }
		    
		    Map<Integer, List<Integer>> adj2 = new HashMap<>();
		    for (int i=0; i<e; i++) {
		        int from = scanner.nextInt();
		        int to = scanner.nextInt();
		        
		        adj2.putIfAbsent(from, new ArrayList<>());
		        adj2.get(from).add(to);
		    }
		    
		    boolean res = checkMirror(adj1, adj2);
		    
		    System.out.println(res ? 1 : 0);
		}
	}
	
	private static boolean checkMirror(Map<Integer, List<Integer>> adj1, Map<Integer, List<Integer>> adj2) {
	    Stack<Integer> stack = new Stack<>();
	    Queue<Integer> queue = new LinkedList<>();

	    for (int key: adj1.keySet()) {
	        for (int to: adj1.get(key)) {
	            stack.push(to);
	        }
	        
	        if (adj2.get(key)==null) {
	            return false;
	        }
	        for (int to: adj2.get(key)) {
	            queue.add(to);
	        }
	        
	        if (stack.size() != queue.size()) {
	            return false;
	        }
	    
	        while(!stack.isEmpty() && !queue.isEmpty()) {
	            if (stack.pop() != queue.poll()) {
	                return false;
	            }
	        }
	    }
	    
	    return true;
	}

}
