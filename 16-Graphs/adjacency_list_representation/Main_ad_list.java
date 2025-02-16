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
        
        // graph.print_adj_list();
        
        // Uncomment the one which need to test
        // graph.bfs();
        // graph.dfs();
        
        
        // TOPOLOGICAL SORT
        ArrayList<GraphNode_2> topoNodeList = new ArrayList<>();
        topoNodeList.add(new GraphNode_2("A", 0));
        topoNodeList.add(new GraphNode_2("B", 1));
        topoNodeList.add(new GraphNode_2("C", 2));
        topoNodeList.add(new GraphNode_2("D", 3));
        topoNodeList.add(new GraphNode_2("E", 4));
        topoNodeList.add(new GraphNode_2("F", 5));
        topoNodeList.add(new GraphNode_2("G", 6));
        topoNodeList.add(new GraphNode_2("H", 7));
        
        Graph_2 topoGraph = new Graph_2(topoNodeList);
        
        topoGraph.addDirectionalEdge(0, 2);
        topoGraph.addDirectionalEdge(2, 4);
        topoGraph.addDirectionalEdge(4, 7);
        topoGraph.addDirectionalEdge(4, 5);
        topoGraph.addDirectionalEdge(5, 6);
        topoGraph.addDirectionalEdge(1, 2);
        topoGraph.addDirectionalEdge(1, 3);
        topoGraph.addDirectionalEdge(3, 5);
        
        topoGraph.print_adj_list();
        topoGraph.topologicalSort();
        
        
        // Single Source Shortest Path Problem
        System.out.println("SSSPP...");
        ArrayList<GraphNode_2> SSSPPNodeList = new ArrayList<>();
        SSSPPNodeList.add(new GraphNode_2("A", 0));
        SSSPPNodeList.add(new GraphNode_2("B", 1));
        SSSPPNodeList.add(new GraphNode_2("C", 2));
        SSSPPNodeList.add(new GraphNode_2("D", 3));
        SSSPPNodeList.add(new GraphNode_2("E", 4));
        SSSPPNodeList.add(new GraphNode_2("F", 5));
        SSSPPNodeList.add(new GraphNode_2("G", 6));
        
        Graph_2 SSSPPGraph = new Graph_2(SSSPPNodeList);
        
        SSSPPGraph.addUnidirectionalEdge(0, 1);
        SSSPPGraph.addUnidirectionalEdge(0, 2);
        SSSPPGraph.addUnidirectionalEdge(1, 3);
        SSSPPGraph.addUnidirectionalEdge(1, 6);
        SSSPPGraph.addUnidirectionalEdge(2, 3);
        SSSPPGraph.addUnidirectionalEdge(2, 4);
        SSSPPGraph.addUnidirectionalEdge(3, 5);
        SSSPPGraph.addUnidirectionalEdge(4, 5);
        SSSPPGraph.addUnidirectionalEdge(5, 6);
        
        SSSPPGraph.BFSforSSSPP(SSSPPNodeList.get(0));
    }
}
