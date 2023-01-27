package shortestPathGraph;

import java.util.ArrayList;
import java.util.List;

public class runMain {
	public static void main(String[] args) {
		// create a graph that consists all the distance between two stations
		int graph[][] = new int [][]{{ 0, 0, 55, 74, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //Kuala Lumpur to other station
									 { 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 0, 0, 0, 0, 0},//Tampin
									 { 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Nilai
									 { 0, 0, 0, 0, 27, 93, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Seremban
									 { 0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Rembau
									 { 0, 0, 0, 0, 0, 0, 0, 77, 0, 0, 0, 0, 0, 0, 0},//Segamat
									 { 0, 0, 0, 0, 0, 45, 0, 0, 51, 0, 0, 0, 0, 0, 0},//Batang Melaka
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 52, 0, 0, 0, 0},//Kluang
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0}, // Muar
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 78, 0, 87, 0, 0},//Batu Pahat
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 31, 0, 0, 0},//Kulai
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19, 0},//JB Sentral
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30},//Nusa Jaya
									 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16}, //Woolands,Singapore
						 			 {0,  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //Jurong East, Singapore
									};
		
		String stations[] = {"Kuala Lumpur", "Tampin", "Nilai", "Seremban", "Rembau", "Segamat", "Batang Melaka", "Kluang", "Muar", "Batu Pahat",
								"Kulai", "JB Sentral", "Nusa Jaya", "Woolands, Singapore", "Jurong East, Singapore"};
										// price from the station to other station
		double price[][] = new double [][]{{ 0, 0, 17, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, //Kuala Lumpur to other station
										  { 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 0, 0, 0},//Tampin
										  { 0, 0, 0, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Nilai
										  { 0, 0, 0, 0, 16, 62, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Seremban
										  { 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Rembau
										  { 0, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0},//Segamat
										  { 0, 0, 0, 0, 0, 67, 0, 0, 70, 0, 0, 0, 0, 0, 0},//Batang Melaka
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, 0, 0, 0, 0},//Kluang
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0}, //Muar
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65, 0, 61, 0, 0},//Batu Pahat
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0},//Kulai
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0},//JB Sentral
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10},//Nusa Jaya
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9}, //Woolands,Singapore
										  { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} //Jurong East, Singapore
									 };
										  
		// create a 2d AraryList to store the min path
		ArrayList<List<String>> path = new ArrayList<List<String>>(stations.length);
		
		// create ArrayList for each element in the 2d ArrayList
		for(int i = 0; i <  stations.length; i++) {
			path.add(new ArrayList<String>());
		}
		// Add reference station for each ArrayList
		for(int i = 0; i < stations.length; i++) {
			path.get(i).add(stations[i]);
		}
		Dijkstra g = new Dijkstra();
		g.dijkstraAlgorithm(graph, path, 0, price);
	}


}
