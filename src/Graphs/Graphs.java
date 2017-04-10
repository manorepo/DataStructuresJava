package Graphs;

import java.util.*;

class Graph {
	private HashMap<Integer, Node> nodes;

	public Graph() {
		nodes = new HashMap<Integer, Node>();
	}

	public void addVertex(int nodeid) {
		nodes.put(nodeid, new Node(nodeid));
	}

	public void addEdge(int src, int dest, int weight) {
		LinkedList<Edge> source = (LinkedList<Edge>) (nodes.get(src).adjacent);
		source.add(new Edge(dest, weight));

	}

	public void printGraph() {
		System.out.println("Graph Adjacency List");
		Set<Map.Entry<Integer, Node>> dataSet = nodes.entrySet();
		Iterator it = dataSet.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Node> entry = (Map.Entry<Integer, Node>) it.next();
			Node nodeDetails = entry.getValue();
			System.out.print("\n" + nodeDetails.nodeId);
			Iterator adj = nodeDetails.adjacent.iterator();
			while (adj.hasNext()) {
				Edge currEdge = (Edge) adj.next();
				System.out.print("->" + currEdge.nodeId);
			}

		}

	}

	public void DFS(int nodeid) {
		Node root = nodes.get(nodeid);
		if (root.visited == false) {
			root.visited = true;
			System.out.println(root.nodeId);
			Iterator it = root.adjacent.iterator();
			while (it.hasNext()) {
				Edge e = (Edge) it.next();
				if (nodes.get(e.nodeId).visited == false) {
					DFS(e.nodeId);
				}
			}
		}
	}

	public void BFS(int nodeid) {
		System.out.println("\nBFS:");
		Queue q = new LinkedList();
		q.add(nodeid);
		while (q.isEmpty() == false) {
			int id = (int) q.remove();
			if (nodes.get(id).visited == false) {
				nodes.get(id).visited = true;
				Node node = nodes.get(id);
				System.out.println(id);
				Iterator it = node.adjacent.iterator();
				while (it.hasNext()) {
					Edge e = (Edge) it.next();
					if (nodes.get(e.nodeId).visited == false)
						q.add(e.nodeId);
				}
			}
		}
	}

	public void setVisited(boolean b) {
		Iterator it = nodes.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Node> entry = (Map.Entry<Integer, Node>) it.next();
			Node n = (Node) entry.getValue();
			n.visited = false;
			entry.setValue(n);
		}
	}
}

class Node {
	public int nodeId;
	public boolean visited;
	public LinkedList<Edge> adjacent;

	public Node(int nodeId) {
		this.nodeId = nodeId;
		visited = false;
		adjacent = new LinkedList<Edge>();
	}
}

class Edge {
	public int nodeId;
	public int weight;

	public Edge(int nodeid, int weight) {
		this.nodeId = nodeid;
		this.weight = weight;
	}
}

class Graphs {
	public static void main(String a[]) {
		Graph g = new Graph();
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addVertex(5);
		g.addVertex(6);
		g.addEdge(1, 2, 0);
		g.addEdge(1, 4, 0);
		g.addEdge(1, 3, 0);
		g.addEdge(2, 3, 0);
		g.addEdge(2, 5, 0);
		g.addEdge(4, 5, 0);
		g.addEdge(4, 6, 0);
		g.addEdge(3, 6, 0);
		g.printGraph();
		g.DFS(1);
		// g.setVisited(false);
		g.BFS(1);

	}
}