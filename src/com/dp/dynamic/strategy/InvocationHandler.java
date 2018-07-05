package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface InvocationHandler {
    void invoke(Method m) throws InvocationTargetException, IllegalAccessException;
}
