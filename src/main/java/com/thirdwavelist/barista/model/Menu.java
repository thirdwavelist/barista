package com.thirdwavelist.barista.model;

public class Menu {
    private float doppio;
    private Currency currency;

    public Menu(float doppio, Currency currency) {
        this.doppio = doppio;
        this.currency = currency;
    }

    public float getDoppio() {
        return doppio;
    }

    public Currency getCurrency() {
        return currency;
    }
}
