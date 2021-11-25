package graph.coloring.order;

import graph.Graph;
import graph.Node;

public class RandomOrder implements OrderMethod{
	
	@Override
	public Order generateOrder(Graph graph) {
		Order order = new Order(graph.getNodes());
		
		for (int i = 0; i < graph.getNodes(); i++) {
				order.setNode(i, new Node(i,0,0));				
		}
		
		order.shuffle();
		return order;
	}
}
