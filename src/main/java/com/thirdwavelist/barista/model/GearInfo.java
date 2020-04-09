package com.thirdwavelist.barista.model;

public class GearInfo {
    private Machine[] espresso;
    private Machine[] grinder;
    private Machine[] immersive;
    private Machine[] pourover;

    public GearInfo(Machine[] espresso, Machine[] grinder, Machine[] immersive, Machine[] pourover) {
        this.espresso = espresso;
        this.grinder = grinder;
        this.immersive = immersive;
        this.pourover = pourover;
    }

    public Machine[] getEspresso() {
        return espresso;
    }

    public Machine[] getGrinder() {
        return grinder;
    }

    public Machine[] getImmersive() {
        return immersive;
    }

    public Machine[] getPourover() {
        return pourover;
    }
}
