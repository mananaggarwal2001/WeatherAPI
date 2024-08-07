package com.mananluvtocode.weatherAPI.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SuperCurrent implements Serializable {
    private Current current;
    private static long serialVersionUID = 270727596527329690L;
    private Map<String, Object> additionalProperties = new HashMap<>();
    public SuperCurrent() {

    }
    public SuperCurrent(Current current) {
        this.current = current;
    }
    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "SuperCurrent{" +
                "current=" + current +
                '}';
    }
}
