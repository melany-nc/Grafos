package graph;

import java.util.Iterator;

public class Node {

	public int to;
	public int from;
	public double cost;
	

	public Node(int from, int to,  double cost) {
		this.to = to;
		this.from = from;
		this.cost = cost;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Node [ from= " + from + ", to= " + to + ", cost= " + cost + "]";
	}

}