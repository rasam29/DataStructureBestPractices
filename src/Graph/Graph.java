package Graph;

/**
 * Created by Rasam on 6/1/2018.
 */
public interface Graph {
    void addNode(String name);
    void addEdge(String source,String target,int weght);
    void deleteEdge(String src,String target,int weight);
    void DeleteNode(String node);
}
