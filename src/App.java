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
	
		
		System.out.println(p1);
	
		double[] result = p1.Dijkstra(1);
		
		System.out.println("El costo minimo del nodo 1 al 0 es: " + result[0]);
		System.out.print("El recorrido es: " );
		mostrarPredecesors(p1, 0);
		

	}

	private static void mostrarPredecesors(ListGraph p1, int i) {
		
		if( p1.predecesors[i] != -1 ) {
			mostrarPredecesors(p1, p1.predecesors[i]);			
		}
		System.out.print(i + " ");
		
	}

}