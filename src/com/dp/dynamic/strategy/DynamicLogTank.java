package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;

public class DynamicLogTank implements Moveable {
    private Moveable m;

    public DynamicLogTank(Moveable m) {
        this.m = m;
    }

    @Override
    public void move() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println("Dyn log proxy tank start running");
        this.m.move();
        System.out.println("Dyn log proxy tank end running");
    }
}
