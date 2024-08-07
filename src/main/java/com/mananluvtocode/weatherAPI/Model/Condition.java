package com.mananluvtocode.weatherAPI.Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Condition implements Serializable {
    private String text;
    private String icon;
    private String code;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private static final long serialVersionUID = 270727596527329666L;

    public Condition(String text, String icon, String code) {
        this.text = text;
        this.icon = icon;
        this.code = code;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public String getIcon() {
        return icon;
    }

    public String getCode() {
        return code;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}