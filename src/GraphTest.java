import Graph.Graph;

/**
 * Created by Rasam on 6/10/2018.
 */
public class GraphTest implements Graph {
    Vertex startOfGraph;

    @Override
    public void addNode(String name) {
        Vertex p = new Vertex();
        p.name = name;
        p = startOfGraph.nextVertx;
        startOfGraph = p;
    }

    @Override
    public void addEdge(String source, String target, int weight) {
        Vertex sourceVrtx = null, targetVertx = null;
        Vertex t = startOfGraph;

        while (t != null && !(sourceVrtx != null && targetVertx != null)) {
            if (t.nextVertx.name.equals(source)) {
                sourceVrtx = t;
            }
            if (t.nextVertx.name.equals(target)) {
                targetVertx = t;
            }

            t = t.nextVertx;
        }


        if (sourceVrtx == null || targetVertx == null) return;

        Edge p = new Edge();
        p.weight = weight;
        p.target = targetVertx;

        p.next = sourceVrtx.startOfEdges;
        sourceVrtx.startOfEdges = p;


    }

    @Override
    public void deleteEdge(String src, String target, int weight) {
        Vertex sourceVertx = null, targetVertx = null;
        Vertex tg = startOfGraph;
        while (tg != null) {
            if (tg.name.equals(src)) {
                sourceVertx = tg;
            }
            tg = tg.nextVertx;
        }

        if (sourceVertx == null) return;
        Edge t = sourceVertx.startOfEdges, s = null;

        while (sourceVertx.startOfEdges != null && t.target.name.equals(target)) {
            s = t;
            t = t.next;

        }
        if (t == null) return;

        if (s == null) {
            sourceVertx.startOfEdges = t.next;
            return;
        }

        s.next = t.next;


    }

    @Override
    public void DeleteNode(String node) {
        Vertex t = startOfGraph;
        Vertex sourceNode = null;
        Vertex s = null;
        while (t != null) {
            if (t.name.equals(node)) {
                sourceNode = t;
                break;
            }
            s = t;
            t = t.nextVertx;
        }

        if (t == null) return;


        if (s == null) {
            startOfGraph = t.nextVertx;

        } else
            s.nextVertx = t.nextVertx;

        Vertex vertex = startOfGraph;
        while (vertex != null) {
            Edge edges = vertex.startOfEdges,edgeSave = null;

            while (edges != null){
                edgeSave = edges;
                edges = edges.next;
            }
            if (edges == null){
                break;
            }

            if (edgeSave == null){
                vertex.startOfEdges = t.startOfEdges.next;
            }else{
                edgeSave.next = edges.next;
            }






        }
        vertex = vertex.nextVertx;


    }

    class Vertex {
        Vertex nextVertx;
        Edge startOfEdges;
        String name;

    }

    class Edge {
        Vertex target;
        Edge next;
        int weight;

    }
}
