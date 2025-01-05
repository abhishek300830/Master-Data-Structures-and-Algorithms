import java.util.ArrayList;

public class Main_adj_matrix {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        
        Graph_2 graph = new Graph_2(nodeList);
        // connecting A <-> B , A <-> C , A <-> D and vice versa.
        graph.addUnidirectionalEdge(0, 1);
        graph.addUnidirectionalEdge(0, 2);
        graph.addUnidirectionalEdge(0, 3);
        // B <-> E
        graph.addUnidirectionalEdge(1, 4);
        // C <-> D
        graph.addUnidirectionalEdge(2, 3);
        // D <-> E
        graph.addUnidirectionalEdge(3, 4);
        
        graph.printAdjacencyMatrix();
        
    }
}
