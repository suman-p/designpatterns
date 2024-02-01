package com.dp.CreationalDesignPatterns.Singleton;

public class EagerIntialization {
    private EagerIntialization(){

    }

    private static final EagerIntialization INSTANCE = new EagerIntialization();

    public static EagerIntialization getInstance(){
        return INSTANCE;
    }
}
