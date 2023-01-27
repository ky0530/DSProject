package BruceForce;

import java.util.ArrayList;

class Node {
	String location;
	ArrayList<Node> next = new ArrayList<>();
	ArrayList<Double> distance = new ArrayList<>();
	ArrayList<String> path = new ArrayList<>();
	ArrayList<Double> total = new ArrayList<>();
	ArrayList<Double> price = new ArrayList<>();
	ArrayList<Double> ticket = new ArrayList<>();
	
	Node(String location) {
		this.location = location;
	}
	
	public void addNode(Node node, double distance, double ticket) {
		this.next.add(node);
		this.distance.add(distance);
		this.ticket.add(ticket);
	}
	
	public void findPath(Node head, String lastPath, double lastDistance, double lastticket) {
		Node temp = head;
		
		if(lastPath.equalsIgnoreCase("")) {
			lastPath += temp.location;
		}else {
			lastPath += " -> " + temp.location; //if have next location, then add new location
		}
		if(temp.next.size() == 0) {
			path.add(lastPath);
			total.add(lastDistance);
			price.add(lastticket);
			return;
		}else {
			for(int i=0 ; i<temp.next.size() ; i++) {
				lastDistance += temp.distance.get(i);
				lastticket += temp.ticket.get(i);
				
				if(i>= 1) {
					lastDistance -= temp.distance.get(i-1);
					lastticket -= temp.ticket.get(i-1);
				}
				findPath(temp.next.get(i), lastPath, lastDistance, lastticket);
				
			}
		}
	}
}

class Graph {
	Node head;
	Graph(Node node){
		this.head = node; 
	}	
	
	public int minDistance(Node head) {
		int min = 0;
		double minDis = head.total.get(0);
		for(int i=0 ; i<head.total.size() ; i++) {
			if(minDis > head.total.get(i)) {
				minDis = head.total.get(i);
				min = i;
			}
		}
		return min;
	}
}

