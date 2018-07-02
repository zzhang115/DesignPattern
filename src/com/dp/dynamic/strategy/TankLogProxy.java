package com.dp.dynamic.strategy;

public class TankLogProxy implements Moveable {
    Tank t;

    public TankLogProxy() {
        t = new Tank();
    }

    @Override
    public void move() {
        System.out.println("Log tank1 start running");
        t.move();
        System.out.println("Log tank1 end running");
    }
}
