import java.util.* ;

public class GraphNode {
	int label;
	ArrayList<GraphNode> adjList;
	boolean visited;
	int preorder;
	int postorder;
	
	public GraphNode(int l) {
		label = l;
		adjList = new ArrayList<GraphNode>();
	}
	
	public void print() {
		for(int j=0 ; j<adjList.size() ; j++)
			System.out.print(adjList.get(j).label + "->");
	}
	
	public int dfs(int visitCount) {
		System.out.print(label+" ");
		visited = true;
		preorder = visitCount;
		
		for(int j=0; j<adjList.size(); j++)
			if(!adjList.get(j).visited)
				visitCount = adjList.get(j).dfs(++visitCount);
		
		postorder=++visitCount;
		return postorder;
	}
}
