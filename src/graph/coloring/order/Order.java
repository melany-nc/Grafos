package graph.coloring.order;

import java.util.Random;

import graph.Node;

public class Order {
	private Node[] order;

	public Order(int size) {
		order = new Node[size];
	}

	public Node[] getOrder() {
		return order;
	}
	
	public int getNode(int position) {
		return order[position].from;
	}

	public void setOrder(Node[] order) {
		this.order = order;
	}
	
	public void setNode(int pos, Node node) {
		order[pos] = node;
	}

	public void shuffle() {
		Random ranm = new Random();
		
		for(int i = order.length - 1 ; i > 0; i--) {
			int idx = ranm.nextInt(i + 1);
			
			Node aux = order[idx];
			order[idx] = order[i];
			order[i] = aux;
		}
		
	}
	
}
