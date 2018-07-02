package com.dp.dynamic.strategy;

// aggregation
public class TankTimeProxy implements Moveable {
    Tank t;

    public TankTimeProxy() {
        t = new Tank();
    }

    @Override
    public void move() {
        System.out.println("Time proxy start");
        long start = System.currentTimeMillis();
        t.move();
        long end = System.currentTimeMillis();
        System.out.println("Total running time:" + (end - start));
        System.out.println("Time proxy end");
    }
}
