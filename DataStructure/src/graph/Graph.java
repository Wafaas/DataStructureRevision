package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjacenctList = new HashMap<>();

    public void printAdjacencyList(){
        System.out.println(adjacenctList);
    }

    public boolean addVertex(String vertex) {
        if (adjacenctList.get(vertex) == null) {
            adjacenctList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if(vertex1 != null && vertex2 != null){
            adjacenctList.get(vertex1).remove(vertex2);
            adjacenctList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if(vertex1 != null && vertex2 != null){
            adjacenctList.get(vertex1).add(vertex2);
            adjacenctList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if(adjacenctList.get(vertex) != null){
            for (String otherVertex : adjacenctList.get(vertex)) {
                adjacenctList.get(otherVertex).remove(vertex);
            }
            adjacenctList.remove(vertex);
            return true;
        }
        return false;
    }
}
