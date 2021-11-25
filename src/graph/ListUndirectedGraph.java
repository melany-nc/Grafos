package graph;
public class ListUndirectedGraph extends ListGraph {

	public ListUndirectedGraph(int size) {
		super(size);
	}

	@Override
	public void setEdge(int from, int to, double cost) {
		graph[to].add(new Node(to, from, cost));
		graph[from].add(new Node(from, to, cost));
	}

	@Override
	public Double getEdge(int from, int to) {
		if (graph[from].size() < graph[to].size()) {
			return getEdge(from, to);
		}
		return getEdge(to, from);
	}

	@Override
	public String toString() {
		String s = "";

		for (int i = 0; i < graph.length; i++) {
			s += "Nodo " + i + "\n";
			for (int j = 0; j < graph[i].size(); j++) {
				s += graph[i].get(j).from + " " + graph[i].get(j).to + "\n";
			}
		}

		return s;
	}

}