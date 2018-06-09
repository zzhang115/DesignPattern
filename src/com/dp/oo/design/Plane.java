package com.dp.oo.design;

/**
 * Created by BLUEGHOST1 on 2018/6/8.
 */
public class Plane extends Vehicle {
    public void go(Place dest) {
        System.out.println("Drive plane to " + dest.getDest());
    }
}
