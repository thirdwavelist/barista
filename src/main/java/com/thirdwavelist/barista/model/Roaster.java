package com.thirdwavelist.barista.model;

public class Roaster {
    private String name;
    private Location location;

    public Roaster(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
