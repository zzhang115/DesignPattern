package com.dp.factory.series.abstractfactory;

public class Main {
    public static void main(String[] args) {
        GeneralFactory oneFactory = new TwoFactory();
        Weapon w = oneFactory.createWeapon();
        Vehicle v = oneFactory.createVehicle();
        Food f = oneFactory.createFood();

        w.shoot();
        v.run();
        f.eat();
    }
}
