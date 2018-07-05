package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeProxyInvocation implements InvocationHandler {
    private Object target;

    public TimeProxyInvocation(Object t) {
        this.target = t;
    }

    @Override
    public void invoke(Method m) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Dyn time proxy start running");
        long start = System.currentTimeMillis();
        m.invoke(target);
        long end = System.currentTimeMillis();
        System.out.println("Total running time:" + (end - start));
        System.out.println("Dyn time proxy end running");
    }
}
