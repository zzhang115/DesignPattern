package com.dp.dynamic.strategy;

import java.util.Random;

public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("Tank is running...");
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Total running time:" + (end - start));
    }
}
