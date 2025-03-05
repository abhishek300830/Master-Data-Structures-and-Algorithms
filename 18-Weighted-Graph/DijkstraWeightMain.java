import java.util.ArrayList;

public class DijkstraWeightMain {
    public static void main(String[] args) {
        ArrayList<WeightNode> nodeList = new ArrayList<>();
        
        nodeList.add(new WeightNode("A", 0));
        nodeList.add(new WeightNode("B", 1));
        nodeList.add(new WeightNode("C", 2));
        nodeList.add(new WeightNode("D", 3));
        nodeList.add(new WeightNode("E", 4));
        nodeList.add(new WeightNode("F", 5));
        nodeList.add(new WeightNode("G", 6));
        
        WeightGraph wGraph = new WeightGraph(nodeList);
        
        wGraph.addWeightedEdge(0, 1, 2);
        wGraph.addWeightedEdge(0, 2, 2);
        wGraph.addWeightedEdge(1, 2, 6);
        wGraph.addWeightedEdge(1, 3, 1);
        wGraph.addWeightedEdge(1, 4, 3);
        wGraph.addWeightedEdge(2, 5, 8);
        wGraph.addWeightedEdge(2, 4, 4);
        wGraph.addWeightedEdge(4, 6, 9);
        wGraph.addWeightedEdge(5, 6, 7);
        
        wGraph.dijkstra(nodeList.get(0));
        
    }
}
