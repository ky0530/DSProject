package BruceForce;

public class MinPathLink {

	public static void main(String[] args) {
		//add each vector in arrayList
		Node kl = new Node("Kuala Lumpur");
		Node nl = new Node("Nilai");
		Node tp = new Node("Tampin");
		Node srb = new Node("Seremban");
		Node rb = new Node("Rembau");
		Node sg = new Node("Segamat");
		Node bm = new Node("Batang Melaka");
		Node mr = new Node("Muar");
		Node kg = new Node("Kluang");
		Node bp = new Node("Batu Pahat");
		Node ku = new Node("Kulai");
		Node jbs = new Node("JB Sentral");
		Node nj = new Node("Nusa Jaya");
		Node je = new Node("Jurong East, Singapore");
		Node wl = new Node("Woodland, Singapore");
		
		Graph graph = new Graph(kl);
		//insert the name, distance and the price to the destination station
		kl.addNode(nl, 55, 17);
		kl.addNode(srb, 74, 50);
		nl.addNode(srb, 21, 23);
		srb.addNode(rb, 27, 16);
		srb.addNode(sg, 93, 62);
		rb.addNode(tp, 25, 5);
		tp.addNode(bm, 32, 14);
		bm.addNode(sg, 45, 67);
		sg.addNode(kg, 77, 16);
		bm.addNode(mr, 51, 70);
		mr.addNode(bp, 42, 42);
		bp.addNode(nj, 87, 61);
		bp.addNode(ku, 78, 65);
		kg.addNode(ku, 52, 17);
		nj.addNode(je, 30, 10);
		ku.addNode(jbs, 31, 13);
		jbs.addNode(wl, 19, 20);
		wl.addNode(je, 16, 9);
		
		long startTime = System.nanoTime();
		
		graph.head.findPath(graph.head,"",0,0);
		
        long elapsedTime = System.nanoTime() - startTime; // to display the execution time
        System.out.println("Time Execution:" + Float.valueOf(elapsedTime)/1000000000 + "sec" );
	
        System.out.println("Distance(Km) \tPrice(RM) \tPath");
        System.out.println("-------------------------------------------------------------");
        
		for(int i=0 ; i<graph.head.path.size() ; i++) {
				System.out.println( graph.head.total.get(i) + "\t\t" + graph.head.price.get(i) + "\t\t" + graph.head.path.get(i) );
		}
		
		int a = graph.minDistance(graph.head);
		System.out.println("\n\nThe minimun path is :" + graph.head.path.get(a));
		System.out.println("Distance:" + graph.head.total.get(a)+ "km");
		System.out.printf("Price : RM %.2f", graph.head.price.get(a));
	}
}