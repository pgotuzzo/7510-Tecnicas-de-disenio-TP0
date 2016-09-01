package ar.fiuba.tdd.tp0.node;

public class SingleNode<T> implements Node<T> {
    private T element;
    private Node<T> nextNode = new EmptyNode<>();

    public SingleNode(T element) {
        this.element = element;
    }

    @Override
    public T getElement() {
        return element;
    }

    @Override
    public Node<T> getNext() {
        return nextNode;
    }

    @Override
    public int count() {
        return 1 + getNext().count();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Node<T> setNext(Node<T> node) {
        return nextNode = node;
    }
}
