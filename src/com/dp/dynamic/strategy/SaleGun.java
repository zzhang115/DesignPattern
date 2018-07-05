package com.dp.dynamic.strategy;

public class SaleGun implements Sale {

    @Override
    public void sale() {
        System.out.println("Sale this Glock, who want this gun?");
    }
}
