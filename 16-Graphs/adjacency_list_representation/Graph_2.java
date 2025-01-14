import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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
            System.out.print(graphNode_2.name +": ");
            for (GraphNode_2 neighbourNode : graphNode_2.neighbours) {
                System.out.print(neighbourNode.name+ " ");
            }
            System.out.println();
        }
    }
    
    // Breadth first search
    private void bfsVisit(GraphNode_2 node) {
        LinkedList<GraphNode_2> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            GraphNode_2 currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
                        
            for (GraphNode_2 neighbour : currentNode.neighbours) {
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
        
    }
    
    // Depth first Search
    private void dfsVisit(GraphNode_2 node) {
        Stack<GraphNode_2> stack = new Stack<>();
        stack.push(node);
        
        while(!stack.isEmpty()) {
            GraphNode_2 currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            
            for (GraphNode_2 neighbour : currentNode.neighbours) {
                if(!neighbour.isVisited) {
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }
    
    public void bfs() {
        for (GraphNode_2 node : nodeList) {
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
    
    public void dfs() {
        for (GraphNode_2 node: nodeList) {
            if (!node.isVisited) {
                dfsVisit(node);
            }
        }
    }
}
