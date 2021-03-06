package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;

public class DynamicTimeTank implements Moveable {
    private Moveable m;

    public DynamicTimeTank(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() throws Exception {
        System.out.println("Dyn time proxy start running");
        long start = System.currentTimeMillis();
        this.m.move();
        long end = System.currentTimeMillis();
        System.out.println("Total running time:" + (end - start));
        System.out.println("Dyn time proxy end running");
    }
}
