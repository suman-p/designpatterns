package com.dp.StructuralDesignPatterns.BridgePattern;

// This is the implementor, As implementor is defining has its own hierarchy which is not related to abstraction
// hierarchy
public interface LinkedList<T> {
    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
}
