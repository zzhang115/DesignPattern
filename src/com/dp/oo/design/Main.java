package com.dp.oo.design;

/**
 * Created by BLUEGHOST1 on 2018/6/8.
 */
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Place dest = new Place("San Francisco");
        driver.setName("Tyler");
        driver.setVeh(new Car());
        driver.drive(dest);
    }
}
