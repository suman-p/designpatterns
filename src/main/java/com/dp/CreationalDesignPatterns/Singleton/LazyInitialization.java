package com.dp.CreationalDesignPatterns.Singleton;

// Lazy Initialization with Double Check Locking
public class LazyInitialization {
    private LazyInitialization(){

    }

    private static volatile LazyInitialization INSTANCE;

    public static LazyInitialization getInstance(){
        if(INSTANCE == null){
            synchronized (LazyInitialization.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyInitialization();
                }
            }
        }
        return INSTANCE;
    }
}
