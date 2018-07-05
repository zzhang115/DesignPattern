package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NameRecordInvocation implements InvocationHandler {
    private Object target;

    NameRecordInvocation(Object t) {
        this.target = t;
    }

    @Override
    public void invoke(Method m) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Boy A want to buy this gun.");
        m.invoke(target);
        System.out.println("Boy A finished the payment.");
    }
}
