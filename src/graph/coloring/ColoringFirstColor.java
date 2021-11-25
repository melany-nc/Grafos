package graph.coloring;

import java.util.Iterator;

import graph.Graph;
import graph.Node;
import graph.coloring.order.Order;

public class ColoringFirstColor implements ColoringMethod {

	@Override
	public Coloring paint(Graph g, Order o) {
		Coloring coloring = new Coloring();
		int color = 1;
		int cantColores = 0;
		boolean todosColoreados = false;
		boolean coloreable = false;
		
		int[] nodosColores = new int[g.getNodes()];
		
		for (int i = 0; i < g.getNodes(); i++) {
			nodosColores[i] = 0;
		}	
		
		while (todosColoreados == false) {
			
			for (int i = 0; i < g.getNodes(); i++) {
				
				int actual = o.getNode(i);
				coloreable = true;
				
				// si no est� coloreado
				if (nodosColores[actual] == 0) {
					// recorre todos los nodos adyacentes al actual
					Iterator<Node> adj= g.getAdjacentsIterator(actual);
					
					while(adj.hasNext()) {
						Node e = adj.next();
						if(nodosColores[e.getTo()] == color) {
							coloreable = false;
							break;	
						}
					}

					if (coloreable) {
						nodosColores[actual] = color; 
					}
				}
			}
			
			color++;
			cantColores++;
			
			todosColoreados = true;
			for (int i = 0; i < nodosColores.length; i++) {
				if (nodosColores[i] == 0) {
					todosColoreados = false;
				}
			}
		}
		
		coloring.setColorAssignment(nodosColores);
		coloring.setColors(cantColores);
		
		return coloring;
	}


}