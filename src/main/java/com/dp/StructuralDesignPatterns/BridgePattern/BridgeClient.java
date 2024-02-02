package com.dp.StructuralDesignPatterns.BridgePattern;

public class BridgeClient {
    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SingleLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(80);
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
    }
}
