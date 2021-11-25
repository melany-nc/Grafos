package graph.coloring.order;

import java.util.Arrays;
import java.util.Comparator;

import graph.Graph;
import graph.Node;

public class WelshPowell implements OrderMethod{
	
	@Override
	public Order generateOrder(Graph graph) {
		Order order = new Order(graph.getNodes());
		
		for (int i = 0; i < graph.getNodes(); i++) {
				order.setNode(i, new Node(i,0,graph.getDegree(i)));				
		}
		
		order.shuffle();
		
		Arrays.sort(order.getOrder(), new Comparator<Node>() {
			public int compare(Node n1, Node n2) {
				return (int) (n2.cost - n1.cost);
			}
		});
		
		return order;
	}
}