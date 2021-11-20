import java.util.Arrays;
import java.util.Iterator;

public abstract class Graph {

	public abstract int getNodes();

	public abstract void setEdge(int from, int to, double cost);

	public abstract Double getEdge(int from, int to);

	public abstract Iterator<Node> getAdjacentsIterator(int node);
	
	public int[] predecesors;
	

	// ----------------------------------------------------
	// Algorithm's implementations

	@Override
	public String toString() {
		return "Graph [predecesors=" + Arrays.toString(predecesors) + "]";
	}

	public int[] bfs(int source) {
		int[] hoops = new int[getNodes()];
		hoops[source] = 0;

		// TODO: Implement me!

		return hoops;
	}

	public void dfs(int source) {

		// TODO: Implement me!

	}

	public double[] Dijkstra(int source) {
		double[] distances = new double[getNodes()];
		predecesors = new int[getNodes()];
		boolean[] visited = new boolean[getNodes()];

		for (int i = 0; i < getNodes(); i++) {
			distances[i] = Integer.MAX_VALUE;
			predecesors[i] = -1;
			visited[i] = false;
		}

		distances[source] = 0;

		for (int count = 0; count < getNodes() - 1; count++) {

			int u = minDistance(distances, visited);

			visited[u] = true;

			for (int v = 0; v < getNodes(); v++) {
				if (!visited[v] && getEdge(u, v) != null && distances[u] != Integer.MAX_VALUE
						&& distances[u] + getEdge(u, v) < distances[v]) {
					distances[v] = distances[u] + getEdge(u, v);
					predecesors[v] = u;
				}
				
			}
		}
		
		return distances;
	}

	private int minDistance(double[] distances, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int min_index = 0;

		for (int v = 0; v < getNodes(); v++)
			if (visited[v] == false && distances[v] <= min) {
				min = (int) distances[v];
				min_index = v;
			}

		return min_index;
	}

}