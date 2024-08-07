package com.mananluvtocode.weatherAPI.Model;

import java.util.HashMap;
import java.util.Map;

public class Current {
    private Condition condition;
    private String temp_c;
    private String temp_f;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = 270727596527329670L;
    public Current() {

    }
    public Current(Condition condition) {
        this.condition = condition;
    }

    public void setCondition(Condition condition, String temp_c, String temp_f) {
        this.condition = condition;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public Condition getCondition() {
        return condition;
    }

    public String getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(String temp_c) {
        this.temp_c = temp_c;
    }

    public String getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(String temp_f) {
        this.temp_f = temp_f;
    }

    @Override
    public String toString() {
        return "Current{" +
                "condition=" + condition +
                ", temp_c='" + temp_c + '\'' +
                ", temp_f='" + temp_f + '\'' +
                '}';
    }
}
