package graph;
import java.util.Iterator;

import graph.coloring.Coloring;
import graph.coloring.ColoringFirstColor;
import graph.coloring.ColoringMethod;
import graph.coloring.order.Order;
import graph.coloring.order.OrderMethod;
import graph.coloring.order.RandomOrder;

public class App {

	public static void main(String[] args) {
//		ListGraph p1 = new ListGraph(5);
//
//		p1.setEdge(1, 2, 10);
//		p1.setEdge(1, 0, 100);
//		p1.setEdge(1, 4, 30);
//		p1.setEdge(2, 3, 50);
//		p1.setEdge(3, 0, 10);
//		p1.setEdge(4, 0, 60);
//		p1.setEdge(4, 3, 20);
//
//		System.out.println(p1);
	
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
//
//		boolean[][] res = p1.warshall();
//		
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res[i].length; j++) {
//				System.out.print(res[i][j] + " ");
//			}
//			System.out.println();
//		}		

//		ListUndirectedGraph p2 = new ListUndirectedGraph(11);
//
//		p2.setEdge(0, 8, 1);
//		p2.setEdge(0, 1, 1);
//		p2.setEdge(1, 5, 1);
//		p2.setEdge(1, 2, 1);
//		p2.setEdge(2, 3, 1);
//		p2.setEdge(8, 4, 1);
//		p2.setEdge(8, 9, 1);
//		p2.setEdge(4, 5, 1);
//		p2.setEdge(5, 6, 1);
//		p2.setEdge(5, 9, 1);
//		p2.setEdge(6, 7, 1);
//		p2.setEdge(9, 10, 1);
//		
//
//		//p2.dfs(0);
//		//p2.bfs(0);

//		ListUndirectedGraph p3 = new ListUndirectedGraph(5);
//		
//		p3.setEdge(0, 1, 8);
//		p3.setEdge(0, 2, 5);
//		p3.setEdge(1, 2, 9);
//		p3.setEdge(1, 3, 11);
//		p3.setEdge(2, 3, 15);
//		p3.setEdge(2, 4, 10);
//		p3.setEdge(3, 4, 7);
//		
//		System.out.println(p3.prim());

		Graph p3 = new ListUndirectedGraph(6);

		p3.setEdge(0, 1, 6);
		p3.setEdge(0, 2, 1);
		p3.setEdge(0, 3, 5);
		p3.setEdge(1, 2, 6);
		p3.setEdge(1, 4, 3);
		p3.setEdge(2, 3, 4);
		p3.setEdge(2, 4, 6);
		p3.setEdge(2, 5, 6);
		p3.setEdge(3, 5, 2);
		p3.setEdge(4, 5, 6);
//
//		System.out.println(p3.prim());
		
		
		OrderMethod orderMethod = new RandomOrder();
		Order order = orderMethod.generateOrder(p3);
		ColoringMethod coloringMethod = new ColoringFirstColor();
		
		Coloring coloring = coloringMethod.paint(p3, order);
		
		System.out.println(coloring.getColors());
		
		for (int i = 0; i < coloring.getColorAssignment().length; i++) {
			System.out.println("Nodo " + i + " Color " + coloring.getColor(i));
		}
		

	}

	private static void mostrarPredecesors(ListGraph p1, int i) {

		if (p1.predecesors[i] != -1) {
			mostrarPredecesors(p1, p1.predecesors[i]);
		}
		System.out.print(i + " ");

	}

}
