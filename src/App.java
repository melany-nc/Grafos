import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		ListGraph p1 = new ListGraph(5);

		p1.setEdge(1, 2, 10);
		p1.setEdge(1, 0, 100);
		p1.setEdge(1, 4, 30);
		p1.setEdge(2, 3, 50);
		p1.setEdge(3, 0, 10);
		p1.setEdge(4, 0, 60);
		p1.setEdge(4, 3, 20);

//		System.out.println(p1);
//	
//		double[] result = p1.Dijkstra(1);
//		
//		System.out.println("El costo minimo del nodo 1 al 0 es: " + result[0]);
//		System.out.print("El recorrido es: " );
//		mostrarPredecesors(p1, 0);

//		double[][] result = p1.floyd();
//		
//		for (int i = 0; i < result.length; i++) {
//			for (int j = 0; j < result[i].length; j++) {
//				System.out.print(result[i][j] + " ");
//			}
//			System.out.println();
//		}

//		boolean[][] res = p1.warshall();
//		
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res[i].length; j++) {
//				System.out.print(res[i][j] + " ");
//			}
//			System.out.println();
//		}

		ListUndirectedGraph p2 = new ListUndirectedGraph(11);

		p2.setEdge(0, 8, 1);
		p2.setEdge(0, 1, 1);
		p2.setEdge(1, 5, 1);
		p2.setEdge(1, 2, 1);
		p2.setEdge(2, 3, 1);
		p2.setEdge(8, 4, 1);
		p2.setEdge(8, 9, 1);
		p2.setEdge(4, 5, 1);
		p2.setEdge(5, 6, 1);
		p2.setEdge(5, 9, 1);
		p2.setEdge(6, 7, 1);
		p2.setEdge(9, 10, 1);
		

		//p2.dfs(0);
		//p2.bfs(0);
	}

	private static void mostrarPredecesors(ListGraph p1, int i) {

		if (p1.predecesors[i] != -1) {
			mostrarPredecesors(p1, p1.predecesors[i]);
		}
		System.out.print(i + " ");

	}

}
