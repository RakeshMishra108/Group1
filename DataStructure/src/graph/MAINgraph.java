package graph;

public class MAINgraph {

	public static void main(String[] args) {
		InitiationGraph1 g = new InitiationGraph1(4);
			
		 g.addEdge(0, 1);
		 g.addEdge(0, 2);
		 g.addEdge(1, 2);
		 g.addEdge(2, 0);
		 g.addEdge(2, 3);
		
		 System.out.print(g.toString());
	}

}
