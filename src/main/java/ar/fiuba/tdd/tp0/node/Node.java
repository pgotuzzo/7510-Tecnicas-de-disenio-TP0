package ar.fiuba.tdd.tp0.node;

interface Node<T> {

    T getElement();

    Node<T> getNext();

    int count();

    boolean isEmpty();

    Node<T> setNext(Node<T> node);

    void remove(Node<T> previous);

    void setPrevious(Node<T> previous);

}
