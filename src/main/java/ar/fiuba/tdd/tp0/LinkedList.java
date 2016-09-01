package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.node.HeaderNode;
import ar.fiuba.tdd.tp0.node.SingleNode;
import ar.fiuba.tdd.tp0.node.TailNode;

class LinkedList<T> implements Queue<T> {
    private HeaderNode<T> header = new HeaderNode<>();
    private TailNode<T> tail;

    LinkedList() {
        tail = new TailNode<>(header);
    }

    @Override
    public boolean isEmpty() {
        return header.isEmpty();
    }

    @Override
    public int size() {
        return header.count();
    }

    @Override
    public void add(T item) {
        tail.add(new SingleNode<>(item));
    }

    @Override
    public void remove() {
        header.remove();
    }

    @Override
    public T top() {
        return header.getElement();
    }
}
