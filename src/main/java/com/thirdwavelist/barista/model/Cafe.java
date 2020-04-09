package com.thirdwavelist.barista.model;

import java.util.UUID;

public class Cafe {
    private UUID guid;
    private String name;
    private Location location;
    private String thumbnailUrl;
    private SocialInfo social;
    private BrewMethod[] brewMethods;
    private GearInfo gear;
    private BeanInfo bean;
    private Menu prices;

    public Cafe(UUID guid, String name, Location location, String thumbnailUrl, SocialInfo social, BrewMethod[] brewMethods, GearInfo gear, BeanInfo bean, Menu prices) {
        this.guid = guid;
        this.name = name;
        this.location = location;
        this.thumbnailUrl = thumbnailUrl;
        this.social = social;
        this.brewMethods = brewMethods;
        this.gear = gear;
        this.bean = bean;
        this.prices = prices;
    }

    Cafe(String name, Location location, String thumbnailUrl, SocialInfo social, BrewMethod[] brewMethods, GearInfo gear, BeanInfo bean, Menu prices) {
        new Cafe(UUID.randomUUID(), name, location, thumbnailUrl, social, brewMethods, gear, bean, prices);
    }

    public UUID getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public SocialInfo getSocial() {
        return social;
    }

    public BrewMethod[] getBrewMethods() {
        return brewMethods;
    }

    public GearInfo getGear() {
        return gear;
    }

    public BeanInfo getBean() {
        return bean;
    }

    public Menu getPrices() {
        return prices;
    }
}