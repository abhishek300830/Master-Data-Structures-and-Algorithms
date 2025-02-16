import java.util.ArrayList;

public class GraphNode_2 {
    public String name;
    public int index;
    public boolean isVisited;
    public GraphNode_2 parent; // added for shortest path problem solution
    
    public ArrayList<GraphNode_2> neighbours = new ArrayList<>();
    
    GraphNode_2(String name, int index){
        this.name = name;
        this.index = index;
    }
    
}
