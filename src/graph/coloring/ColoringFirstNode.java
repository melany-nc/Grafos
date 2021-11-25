package graph.coloring;

import java.util.Iterator;
import java.util.Stack;

import graph.Graph;
import graph.Node;
import graph.coloring.order.Order;

public class ColoringFirstNode implements ColoringMethod {

	@Override
	public Coloring paint(Graph graph, Order order) {
		Coloring result = new Coloring();
//		int nColor = 0;
//		Stack<Integer> p = new Stack<Integer>();
//
//		p.add(order.getOrder()[0].getFrom());
//		result.setColorAssignment(p.peek(), nColor);
//
//		while (!p.isEmpty()) {
//			Integer current = p.pop();
//			System.out.println(current);
//			Iterator<Node> it = this.getAdjacentsIterator(current);
//
//			while (it.hasNext()) {
//				Node node = it.next();
//				if (result.getColor(node.to) == result.getColor(node.from)) {
//					result.setColorAssignment(node.to, nColor++);
//					
//				}
//			}
//		}
		
		return result;
	}
		
}
