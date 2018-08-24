package com.rafalglowacki;

public class Planet extends HeavenlyBody {


    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public void addSatellite(HeavenlyBody satellite) {
        if (satellite.getKey().getBodyType() == BodyTypes.MOON) {
            super.addSatellite(satellite);
        }
    }
}
