package com.dp.dynamic.strategy;

import java.util.Random;

public class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("Tank is running...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
