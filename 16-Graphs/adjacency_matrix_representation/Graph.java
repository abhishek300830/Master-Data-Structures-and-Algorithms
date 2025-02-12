import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int adjacencyMatrix[][];
    
    Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }
    
    public void addUnidirectionalEdge(int i, int j) {
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }
    
    public void printAdjacencyMatrix(){
        System.out.print("#  ");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(nodeList.get(i).name+" ");
        }
        System.out.println();
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            System.out.print(nodeList.get(i).name+": ");
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    // get neighbours
    public ArrayList<GraphNode> get_neighbours(GraphNode node) {
        ArrayList<GraphNode> neighboursList = new ArrayList<>();
        
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            if(adjacencyMatrix[node.index][i]==1){
                neighboursList.add(nodeList.get(i));
            }
        }
        
        return neighboursList;
    }
    
    // breadth first search 
    private void bfsVisit(GraphNode node) {
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbours = get_neighbours(currentNode);
            for (GraphNode neighbour : neighbours) {
                if(!neighbour.isVisited){
                    neighbour.isVisited = true;
                    queue.add(neighbour);
                    
                }
            }
        }
    }
    
    // Depth first Search
    private void dfsVisit(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        
        while(!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            
            ArrayList<GraphNode> neighbours = get_neighbours(currentNode);
            for (GraphNode neighbour : neighbours) {
                if(!neighbour.isVisited) {
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }
    

    
    public void bfs() {
        for (GraphNode node : nodeList) {
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
    
    public void dfs() {
        for (GraphNode node : nodeList) {
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
    
    // TOPOLOGICAL SORT
    
    public void addDirectedEdge(int x, int y) {
        adjacencyMatrix[x][y] = 1;
    }
    
    private void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode graphNode : get_neighbours(node)) {
            if(!graphNode.isVisited) {
                topologicalVisit(graphNode, stack);
            }
        }
        node.isVisited = true;
        stack.push(node);
    }
    
    public void topologincalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : nodeList) {
            if (!node.isVisited) {
                topologicalVisit(node, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().name+" ");
        }
    }
    
    
}
