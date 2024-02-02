package com.dp.CreationalDesignPatterns.ObjectPool;

import java.awt.*;

public class ObjectPoolClient {
    public static final ObjectPool<Bitmap> objectPool = new ObjectPool<>(()->new Bitmap("Logo.jpg"), 5);

    public static void main(String[] args) {
        Bitmap b1 = objectPool.get();
        b1.setLocation(new Point(10, 20));
        Bitmap b2 = objectPool.get();
        b2.setLocation(new Point(30, 40));

        b1.draw();
        b2.draw();

        objectPool.release(b1);
        objectPool.release(b2);
    }
}
