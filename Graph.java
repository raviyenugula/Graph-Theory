package GraphTheory;

public interface Graph<E> {

    void addVertex(E val);
    void connect(E val1, E val2, Integer... weight);
    Vertex getVertex(E val);
    Edge getEdge(E val1, E val2);

}
