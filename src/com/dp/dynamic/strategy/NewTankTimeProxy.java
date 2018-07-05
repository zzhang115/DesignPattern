package com.dp.dynamic.strategy;

import java.lang.reflect.Method;
public class NewTankTimeProxy implements com.dp.dynamic.strategy.Sale {
    com.dp.dynamic.strategy.InvocationHandler t;
    public NewTankTimeProxy(com.dp.dynamic.strategy.InvocationHandler h) {
        super();
        this.t = h;
    }
    @Override
    public void sale() throws Exception {
        Method md = com.dp.dynamic.strategy.Sale.class.getMethod("sale");
        t.invoke(md);
    }

}
