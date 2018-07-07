package com.dp.strategy.bridge;

public class Boy {
    private String name;

    public Boy(String name) {
        this.name = name;
    }

    public boolean pursue(Girl girl) {
        // more aggregation, less extend
        // bridge applied to two dimensions of a class(Gift),
        // use aggregation to connect them.
        giveGift(girl, new BirthdayGift(new Flower()));
        return true;
    }

    public void giveGift(Girl girl, Gift gift) {

    }
}
