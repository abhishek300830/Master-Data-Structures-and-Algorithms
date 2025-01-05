import java.util.ArrayList;

public class Graph_2 {
    ArrayList<GraphNode_2> nodeList = new ArrayList<>();
    
    Graph_2(ArrayList<GraphNode_2> nodeList){
        this.nodeList = nodeList;
    }
    
    public void addUnidirectionalEdge(int i, int j){
        GraphNode_2 first = this.nodeList.get(i);
        GraphNode_2 second = this.nodeList.get(j);
        first.neighbours.add(second);
        second.neighbours.add(first);
    }
    
    public void print_adj_list(){
        for (GraphNode_2 graphNode_2 : nodeList) {
            System.out.print(graphNode_2.name +" ");
            for (GraphNode_2 neighbourNode : graphNode_2.neighbours) {
                System.out.print(neighbourNode.name);
            }
            System.out.println();
        }
    }
}
