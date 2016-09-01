package ar.fiuba.tdd.tp0;

interface Queue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    void remove();

    T top();
}
