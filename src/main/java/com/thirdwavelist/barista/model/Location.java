package com.thirdwavelist.barista.model;

public class Location {
    private String address;
    private String city;
    private int zipCode;
    private String country;
    private float lat;
    private float lng;

    public Location(String address, String city, int zipCode, String country, float lat, float lng) {
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
        this.lat = lat;
        this.lng = lng;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }
}
