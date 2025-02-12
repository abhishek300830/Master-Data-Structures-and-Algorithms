import java.util.ArrayList;

public class Main_adj_matrix {
    public static void main(String[] args) {
        // ArrayList<GraphNode> nodeList = new ArrayList<>();
        // nodeList.add(new GraphNode("A", 0));
        // nodeList.add(new GraphNode("B", 1));
        // nodeList.add(new GraphNode("C", 2));
        // nodeList.add(new GraphNode("D", 3));
        // nodeList.add(new GraphNode("E", 4));
        
        // Graph graph = new Graph(nodeList);
        // // connecting A <-> B , A <-> C , A <-> D and vice versa.
        // graph.addUnidirectionalEdge(0, 1);
        // graph.addUnidirectionalEdge(0, 2);
        // graph.addUnidirectionalEdge(0, 3);
        // // B <-> E
        // graph.addUnidirectionalEdge(1, 4);
        // // C <-> D
        // graph.addUnidirectionalEdge(2, 3);
        // // D <-> E
        // graph.addUnidirectionalEdge(3, 4);
        
        // graph.printAdjacencyMatrix();
        
        // graph.bfs();
        // graph.dfs();
        
        // TOPOLOGICAL SORT
        ArrayList<GraphNode> topoNodeList1 = new ArrayList<>();
        topoNodeList1.add(new GraphNode("A", 0));
        topoNodeList1.add(new GraphNode("B", 1));
        topoNodeList1.add(new GraphNode("C", 2));
        topoNodeList1.add(new GraphNode("D", 3));
        topoNodeList1.add(new GraphNode("E", 4));
        topoNodeList1.add(new GraphNode("F", 5));
        topoNodeList1.add(new GraphNode("G", 6));
        topoNodeList1.add(new GraphNode("H", 7));
        
        Graph topoGraph1 = new Graph(topoNodeList1);
        
        topoGraph1.addDirectedEdge(0, 2);
        topoGraph1.addDirectedEdge(2, 4);
        topoGraph1.addDirectedEdge(4, 7);
        topoGraph1.addDirectedEdge(4, 5);
        topoGraph1.addDirectedEdge(5, 6);
        topoGraph1.addDirectedEdge(1, 2);
        topoGraph1.addDirectedEdge(1, 3);
        topoGraph1.addDirectedEdge(3, 5);
        
        topoGraph1.printAdjacencyMatrix();
        topoGraph1.topologincalSort();
        
    }
}
