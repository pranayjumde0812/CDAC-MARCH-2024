package com.app.enums;

public enum ServicePlan {
    SILVER(1000),
    GOLD(2000),
    DIAMOND(5000),
    PLATINUM(10000);

    private double charges;

    ServicePlan(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return name() + " : " + charges;
    }

    public double getCharges() {
        return charges;
    }
}
