package com.dp.factory.series.abstractfactory;

public class TwoFactory extends GeneralFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }

    @Override
    public Weapon createWeapon() {
        return new Glock19();
    }

    @Override
    public Food createFood() {
        return new Burger();
    }
}
