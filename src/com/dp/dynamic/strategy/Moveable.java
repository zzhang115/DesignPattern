package com.dp.dynamic.strategy;

import java.lang.reflect.InvocationTargetException;

public interface Moveable {
    void move() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException;
}
