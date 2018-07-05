package com.dp.dynamic.strategy;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Tank tank = new Tank();
        DynamicProxy dpy = new DynamicProxy();

        dpy.gntProxyInstance(Moveable.class, new TimeProxyInvocation(tank));

    }
}
