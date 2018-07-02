package com.dp.factory.series.abstractfactory;

public class OneFactory extends GeneralFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food createFood() {
        return new Orange();
    }
}
