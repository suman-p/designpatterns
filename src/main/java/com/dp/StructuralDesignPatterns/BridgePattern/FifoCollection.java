package com.dp.StructuralDesignPatterns.BridgePattern;

// This is an abstraction for FIFO collection
public interface FifoCollection<T> {
    // Adds element to collection
    void offer(T element);

    // Removes & returns first element from collection
    T poll();
}
