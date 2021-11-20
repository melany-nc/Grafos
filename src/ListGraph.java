import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListGraph extends Graph {

	protected List<Node>[] graph;

	@SuppressWarnings("unchecked")
	public ListGraph(int size) {
		graph = new List[size];
		for (int i = 0; i < size; i++) {
			graph[i] = new LinkedList<Node>();
		}
	}

	@Override
	public int getNodes() {
		return graph.length;
	}

	@Override
	public void setEdge(int from, int to, double cost) {
		for (Node current : graph[from]) {
			if (current.to == to) {
				current.cost = cost;
				return;
			}
		}
		graph[from].add(new Node(to, from, cost));
	}

	@Override
	public Double getEdge(int from, int to) {
		for (Node current : graph[from]) {
			if (current.to == to)
				return current.cost;
		}
		return null;
	}
	
	
	@Override
	public Iterator<Node> getAdjacentsIterator(int node) {
		return graph[node].iterator();
	}

	@Override
	public String toString() {
		String s = "";
		
		for (int i = 0; i < graph.length; i++) {
			s += "Nodo " + (i+1) + "\n"; 
			for (int j = 0; j < graph[i].size() ; j++) {
				s += graph[i].get(j).from + " " + graph[i].get(j).to + " " + graph[i].get(j).cost +  "\n";
			}
		}
		
		return s;
	}

	
	
	
}