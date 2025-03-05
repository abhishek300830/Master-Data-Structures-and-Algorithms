import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightGraph {
    ArrayList<WeightNode> nodeList = new ArrayList<>();
    
    public WeightGraph(ArrayList<WeightNode> nodeList) {
        this.nodeList = nodeList;
    }
    
    public void pathPrint(WeightNode node) {
        if (node.parent != null) pathPrint(node.parent);
        System.out.print(node.name + " ");
    }
    
    public void dijkstra(WeightNode node) {
        PriorityQueue<WeightNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodeList);
        while (!queue.isEmpty()) {
            WeightNode currNode = queue.remove();
            
            for(WeightNode neighbour: currNode.neighbours) {
                if(queue.contains(neighbour)) {
                    if (neighbour.distance > currNode.distance + currNode.weightMap.get(neighbour)) {
                        neighbour.distance = currNode.distance + currNode.weightMap.get(neighbour);
                        neighbour.parent = currNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                } 
            }
        }
        
        for (WeightNode nodeToCheck: nodeList) {
            System.out.print("Node: "+nodeToCheck+" , Distance: "+nodeToCheck.distance+" , Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }   
    }
    
    public void addWeightedEdge(int indexFrom, int indexTo, int distance) {
        WeightNode first = nodeList.get(indexFrom);
        WeightNode second = nodeList.get(indexTo);
        first.neighbours.add(second);
        first.weightMap.put(second, distance);
    }
    
}
