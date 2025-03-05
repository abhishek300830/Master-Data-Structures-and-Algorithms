import java.util.ArrayList;
import java.util.HashMap;

public class WeightNode implements Comparable<WeightNode> {
    public String name;
    public boolean isVisisted = false;
    public WeightNode parent;
    public int distance;
    public int index;
    
    public ArrayList<WeightNode> neighbours = new ArrayList<>();
    public HashMap<WeightNode,Integer> weightMap = new HashMap<>();

    public WeightNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.distance = Integer.MAX_VALUE;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    @Override
    public int compareTo(WeightNode node) {
        return this.distance - node.distance; 
    }
    
}