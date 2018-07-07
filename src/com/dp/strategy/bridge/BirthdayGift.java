package com.dp.strategy.bridge;

public class BirthdayGift extends Gift {
    public BirthdayGift(GiftImplementation giftImple) {
        this.giftImple = giftImple;
    }
}
