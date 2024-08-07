package com.mananluvtocode.weatherAPI.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SuperLocation implements Serializable {
    private Location location;

    private Map<String, Object> additionalProperties = new HashMap<>();
    private static long serialVersionUID = 270727596527329690L;

    public SuperLocation() {

    }

    public SuperLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "SuperLocation{" +
                "location=" + location +
                '}';
    }
}
