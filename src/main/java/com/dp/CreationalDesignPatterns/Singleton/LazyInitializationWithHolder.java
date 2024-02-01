package com.dp.CreationalDesignPatterns.Singleton;

public class LazyInitializationWithHolder {
    private LazyInitializationWithHolder(){

    }

    private static class RegistryHolder{
        static LazyInitializationWithHolder INSTANCE = new LazyInitializationWithHolder();
    }

    public static LazyInitializationWithHolder getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
