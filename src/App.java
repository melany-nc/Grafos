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
		
		System.out.println(p1.getEdge(1,2));
	
		double[] result = p1.Dijkstra(1);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

	}

}
