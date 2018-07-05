package com.dp.dynamic.strategy;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws Exception {
        DynamicProxy dpy = new DynamicProxy();
//        Tank tank = new Tank();
//        InvocationHandler timeInvocHandler = new TimeProxyInvocation(tank);
//        Moveable m = (Moveable) dpy.gntProxyInstance(Moveable.class, timeInvocHandler);
//        m.move();

        SaleGun saleGun = new SaleGun();
        InvocationHandler nameRecInvocHandler = new NameRecordInvocation(saleGun);
        Sale s = (Sale) dpy.gntProxyInstance(Sale.class, nameRecInvocHandler);
        s.sale();
    }
}
