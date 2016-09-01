package ar.fiuba.tdd.tp0.node;

public class TailNode<T> extends EmptyNode<T> {
    private Node<T> previous;

    public TailNode(Node<T> node) {
        previous = node;
    }

    @Override
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public void add(Node<T> node) {
        previous.setNext(node).setNext(this).setPrevious(node);
    }
}
