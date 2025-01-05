import java.util.ArrayList;

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
    
}
