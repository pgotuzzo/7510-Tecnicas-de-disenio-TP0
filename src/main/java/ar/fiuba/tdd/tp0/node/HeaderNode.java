package ar.fiuba.tdd.tp0.node;

public class HeaderNode<T> implements Node<T> {
    private Node<T> firstNode = new EmptyNode<>();

    @Override
    public T getElement() {
        return firstNode.getElement();
    }

    @Override
    public Node<T> getNext() {
        return firstNode.getNext();
    }

    @Override
    public int count() {
        return firstNode.count();
    }

    @Override
    public boolean isEmpty() {
        return firstNode.isEmpty();
    }

    @Override
    public Node<T> setNext(Node<T> node) {
        return firstNode = node;
    }

    public void remove() {
        firstNode = firstNode.getNext();
    }

}
