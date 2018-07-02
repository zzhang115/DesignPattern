package com.dp.dynamic.strategy;

public class Tank2 extends Tank {
    // test tank's move method running time
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("Total running time:" + (end - start));
    }
}
