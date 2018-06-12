package Graph;

/**
 * Created by Rasam on 6/1/2018.
 */
public class GraphLinkList implements Graph {

    private Node first;


    @Override
    public void addNode(String name) {
        Node p;

        if (first == null) {
            first = new Node(name);
            return;
        }
        try {
            p = new Node(name);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        p.next = first;
        first = p;


    }

    @Override
    public void addEdge(String src, String target, int weight) {
        Edge arcEdge;
        Node t = first;
        Node source = null, targetNode = null;


        while (t != null && (source == null || targetNode == null)) {
            if (t.name.equals(src))
                source = t;
            if (t.name.equals(target))
                targetNode = t;
            t = t.next;
        }

        if (source == null || targetNode == null)
            return;

        arcEdge = new Edge();
        arcEdge.weight = weight;
        arcEdge.target = targetNode;
        arcEdge.next = source.startOfEdge;
        source.startOfEdge = arcEdge;


    }

    @Override
    public void deleteEdge(String src, String trgt, int weight) {
        Node t = first;
        Node source = null;
        while (t != null) {
            if (t.name.equals(src)) {
                source = t;
                break;
            }
            t = t.next;
        }
        if (t == null) return;
        Edge tEdge = source.startOfEdge, s = null;
        while (tEdge != null && (tEdge.target.name.equals(trgt)) && tEdge.weight != weight) {
            s = tEdge;
            tEdge = tEdge.next;
        }


        if (tEdge == null) return;
        if (s == null) {
            source.startOfEdge = source.next.startOfEdge;
        }
        s.next = tEdge.next;


    }

    @Override
    public void DeleteNode(String node) {
        Node t = first, s = null;
        Node sourceNode = null;
        while (t != null) {
            if (t.name.equals(node)) {
                sourceNode = t;
                break;
            }
            s = t;
            t = t.next;
        }
        if (t == null) return;

        if (s == null) {
            first = t.next;

        } else s.next = t.next;

        Node travers = first;

        while (first != null) {
            Edge eachNode = first.startOfEdge, edgeSave = null;

            while (eachNode != null) {

                while (eachNode != null && eachNode.target.name.equals(node)) {
                    edgeSave = eachNode;
                    eachNode = eachNode.next;
                }
                if (eachNode == null) return;
                if (edgeSave == null) travers.startOfEdge = eachNode.next;
                eachNode = eachNode.next;
            }
            travers = travers.next;
        }


    }


    class Node {
        String name;
        Node next;
        Edge startOfEdge;

        public Node(String name) {
            this.name = name;
        }
    }

    class Edge {
        Node target;
        Edge next;
        int weight;


    }
}
