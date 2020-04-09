package com.thirdwavelist.barista.model;

public class Cafe {
    private String id;
    private String name;
    private Location location;
    private String thumbnailUrl;
    private SocialInfo social;
    private BrewMethod[] brewMethods;
    private GearInfo gear;
    private BeanInfo bean;
    private Menu prices;

    public Cafe(String id, String name, Location location, String thumbnailUrl, SocialInfo social, BrewMethod[] brewMethods, GearInfo gear, BeanInfo bean, Menu prices) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.thumbnailUrl = thumbnailUrl;
        this.social = social;
        this.brewMethods = brewMethods;
        this.gear = gear;
        this.bean = bean;
        this.prices = prices;
    }

    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public void setSocial(SocialInfo social) {
        this.social = social;
    }

    public void setBrewMethods(BrewMethod[] brewMethods) {
        this.brewMethods = brewMethods;
    }

    public void setGear(GearInfo gear) {
        this.gear = gear;
    }

    public void setBean(BeanInfo bean) {
        this.bean = bean;
    }

    public void setPrices(Menu prices) {
        this.prices = prices;
    }
}