package com.thirdwavelist.barista.model;

public class BeanInfo {
    private Roaster roaster;
    private RoastLevel roastLevel;
    private OriginType originType;

    public BeanInfo(Roaster roaster, RoastLevel roastLevel, OriginType originType) {
        this.roaster = roaster;
        this.roastLevel = roastLevel;
        this.originType = originType;
    }

    public Roaster getRoaster() {
        return roaster;
    }

    public RoastLevel getRoastLevel() {
        return roastLevel;
    }

    public OriginType getOriginType() {
        return originType;
    }
}
