package ar.fiuba.tdd.tp0.node;

public class HeaderNode<T> implements Node<T> {
    private Node<T> node;

    public HeaderNode(Node<T> header) {
        node = header;
    }

    @Override
    public T getElement() {
        return node.getElement();
    }

    @Override
    public Node<T> getNext() {
        return node.getNext();
    }

    @Override
    public int count() {
        return node.count();
    }

    @Override
    public boolean isEmpty() {
        return node.isEmpty();
    }

    @Override
    public Node<T> setNext(Node<T> node) {
        return this.node = node;
    }

    @Override
    public void remove(Node<T> previous) {
        throw new AssertionError();
    }

    @Override
    public void setPrevious(Node<T> previous) {
        throw new AssertionError();
    }

    public void removeFirst() {
        node.remove(this);
    }

}
