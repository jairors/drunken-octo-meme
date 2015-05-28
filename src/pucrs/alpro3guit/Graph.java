package pucrs.alpro3guit;

import java.util.ArrayList;

public interface Graph {
	
	void addVertice(String vertice);
	void addEdge(String strOrig, String strDest);
	int getDegree(String vertice);
	ArrayList<String> getAllAdjacents(String vertice);

}
