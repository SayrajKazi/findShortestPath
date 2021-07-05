
/*Sayraj Kazi*/
package Graphs;


import algs4.Graph;
import algs4.StdIn;
import algs4.StdOut;
import algs4.BreadthFirstPaths;

public class ShortestPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdIn.fromFile("data/VertexNumbers.txt");
		int nVertices= 0;
		while(StdIn.readLine()!= null) {
			nVertices++;
			
		}
		Graph G= new Graph(nVertices);
		StdIn.fromFile("data/Edges.txt");
		while(!StdIn.isEmpty()){
			String line= StdIn.readLine();
			String[] places = line.split("\\s+");
			int vert1= Integer.parseInt(places[0]);
			int vert2= Integer.parseInt(places[1]);
			G.addEdge(vert1,vert2);
		}
		StdIn.fromFile("data/PathQuery.txt");
		while(!StdIn.isEmpty()) {
			String line= StdIn.readLine();
			String[] places= line.split("\\s+");
			int vert1 = Integer.parseInt(places[0]);
			int vert2 = Integer.parseInt(places[1]);
			BreadthFirstPaths a = new BreadthFirstPaths(G, vert1);
			if(a.hasPathTo(vert2)) {
				StdOut.println(vert1 + "connected to"+ vert2 + " ?" + "Yes,by the path" + a.pathTo(vert2));
			}
			else {
				StdOut.println(vert1+ " connected to" + vert2 +"? No");
			}
		}
		
	}
}


