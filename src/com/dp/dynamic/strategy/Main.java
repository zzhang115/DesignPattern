package com.dp.dynamic.strategy;

public class Main {
    public static void main(String[] args) {
//        Moveable tank3 = new TankTimeProxy();
//        tank3.move();

        Moveable tank = new Tank();

        Moveable dynLogTank = new DynamicLogTank(tank);
//        dynLogTank.move();

        Moveable dynTimeTank = new DynamicTimeTank(dynLogTank);
        dynTimeTank.move();
    }
}
