package graph.coloring;

public class Coloring {
	private int colors;
	private int[] colorAssignment;
	
	
	public void setColors(int colors) {
		this.colors = colors;
	}

	public void setColorAssignment(int[] colorAssignment) {
		this.colorAssignment = colorAssignment;
	}

	public int getColors() {
		return colors;
	}
	
	public int[] getColorAssignment() {
		return colorAssignment;
	}
	
	public int getColor(int node) {
		return colorAssignment[node];
	}
}
