package ar.fiuba.tdd.tp0;

import ar.fiuba.tdd.tp0.node.EmptyNode;
import ar.fiuba.tdd.tp0.node.HeaderNode;
import ar.fiuba.tdd.tp0.node.SingleNode;
import ar.fiuba.tdd.tp0.node.TailNode;

class LinkedList<T> implements Queue<T> {
    private HeaderNode<T> header = new HeaderNode<>(new EmptyNode<>());
    private TailNode<T> tail = new TailNode<>(header);

    LinkedList() {
        header.setNext(tail);
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
        header.removeFirst();
    }

    @Override
    public T top() {
        return header.getElement();
    }
}
