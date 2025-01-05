import java.util.ArrayList;

public class Main_ad_list {
    public static void main(String[] args) {
        ArrayList<GraphNode_2> nodeList = new ArrayList<>();
        nodeList.add(new GraphNode_2("A", 0));
        nodeList.add(new GraphNode_2("B", 1));
        nodeList.add(new GraphNode_2("C", 2));
        nodeList.add(new GraphNode_2("D", 3));
        nodeList.add(new GraphNode_2("E", 4));
        
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
        
        graph.print_adj_list();
    }
}
