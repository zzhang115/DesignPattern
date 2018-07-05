package com.dp.dynamic.strategy;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class NewTankTimeProxy implements com.dp.dynamic.strategy.Moveable {
    com.dp.dynamic.strategy.InvocationHandler t;
    public NewTankTimeProxy(com.dp.dynamic.strategy.InvocationHandler h) {
        super();
        this.t = h;
    }
    @Override
    public void move() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method md = com.dp.dynamic.strategy.Moveable.class.getMethod("move");
        t.invoke(md);
    }

}
