package com.thirdwavelist.barista.model;

public class SocialInfo {
    private String url;
    private String facebookUrl;
    private String instagramUrl;
    private String googlePlaceId;
    private String instagramLocationId;

    public SocialInfo(String url, String facebookUrl, String instagramUrl, String googlePlaceId, String instagramLocationId) {
        this.url = url;
        this.facebookUrl = facebookUrl;
        this.instagramUrl = instagramUrl;
        this.googlePlaceId = googlePlaceId;
        this.instagramLocationId = instagramLocationId;
    }

    public String getUrl() {
        return url;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    public String getInstagramLocationId() {
        return instagramLocationId;
    }
}
