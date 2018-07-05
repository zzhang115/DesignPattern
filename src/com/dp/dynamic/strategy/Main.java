package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
//        Moveable tank3 = new TankTimeProxy();
//        tank3.move();

        Moveable tank = new Tank();
        // Aggregation
        Moveable dynLogTank = new DynamicLogTank(tank);
        Moveable dynTimeTank = new DynamicTimeTank(dynLogTank);
        Moveable dynTimeTimeTank = new DynamicTimeTank(dynTimeTank);
        dynTimeTimeTank.move();
    }
}
