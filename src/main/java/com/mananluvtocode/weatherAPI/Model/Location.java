package com.mananluvtocode.weatherAPI.Model;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Location implements Serializable {
    private String name;
    private String country;
    private String region;

    private String lat;
    private String lon;

    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = 270727596527329664L;

    public Location(String name, String country, String region) {
        this.name = name;
        this.country = country;
        this.region = region;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                '}';
    }
}