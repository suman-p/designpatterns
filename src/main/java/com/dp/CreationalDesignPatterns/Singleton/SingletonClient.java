package com.dp.CreationalDesignPatterns.Singleton;

public class SingletonClient {
    public static void main(String[] args) {

        EagerIntialization eagerIntialization = EagerIntialization.getInstance();
        EagerIntialization eagerIntialization1 = EagerIntialization.getInstance();
        System.out.println(eagerIntialization1 == eagerIntialization);

        LazyInitialization lazyInitialization=LazyInitialization.getInstance();
        LazyInitialization lazyInitialization1=LazyInitialization.getInstance();
        System.out.println(lazyInitialization1 == lazyInitialization);

        LazyInitializationWithHolder lazyInitializationWithHolder=LazyInitializationWithHolder.getInstance();
        LazyInitializationWithHolder lazyInitializationWithHolder1=LazyInitializationWithHolder.getInstance();
        System.out.println(lazyInitializationWithHolder1 == lazyInitializationWithHolder);

    }
}
