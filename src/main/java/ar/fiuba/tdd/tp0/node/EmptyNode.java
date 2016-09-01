package ar.fiuba.tdd.tp0.node;

class EmptyNode<T> implements Node<T> {
    @Override
    public T getElement() {
        throw new AssertionError();
    }

    @Override
    public Node<T> getNext() {
        throw new AssertionError();
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Node<T> setNext(Node<T> node) {
        throw new AssertionError();
    }
}
