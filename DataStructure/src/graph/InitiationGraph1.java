package graph;

public class InitiationGraph1 {
	public boolean adjMatrix[][];
	public int numVertices;
	
	public InitiationGraph1(int numVertices) {
		super();
		this.numVertices = numVertices;
		 adjMatrix = new boolean[numVertices][numVertices];
	}
		public void addEdge(int i, int j) {
				
		//		InitiationGraph[][] ig=new InitiationGraph[i][j];
				 adjMatrix[i][j] = true;
				 adjMatrix[j][i] = true;
		}
		
		// Remove edges
			public void removeEdge(int i, int j) {
				 adjMatrix[i][j] = false;
				 adjMatrix[j][i] = false;
		}
		
		// Print the matrix
			public String toString() {
				 StringBuilder s = new StringBuilder();
				 for (int i = 0; i < numVertices; i++) {
				   s.append( " ");
				   for (boolean j : adjMatrix[i]) {
				     s.append((j ? 1 : 0) + " ");
				   }
				   s.append("\n");
				 }
				 return s.toString();
}

	
}
