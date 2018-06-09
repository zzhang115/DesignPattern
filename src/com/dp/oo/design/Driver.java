package com.dp.oo.design;

/**
 * Created by BLUEGHOST1 on 2018/6/8.
 */
public class Driver {
    public Vehicle veh;
    public String name;

    public void drive(Place dest) {
        if (veh != null) {
            this.veh.go(dest);
        }
    }

    public Vehicle getVeh() {
        return veh;
    }

    public void setVeh(Vehicle veh) {
        this.veh = veh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
