package com.dp.CreationalDesignPatterns.AbstractFactory;

public interface Instance {
    enum Capacity {micro, small, large}
    void start();
    void stop();
    void attachStorage(Storage storage);
}
