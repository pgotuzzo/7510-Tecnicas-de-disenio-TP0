package ar.fiuba.tdd.tp0.node;

public class TailNode<T> extends EmptyNode<T> {
    private Node<T> previous;

    public TailNode(Node<T> node) {
        previous = node;
    }

    public void add(Node<T> node) {
        previous = previous.setNext(node);
    }
}
