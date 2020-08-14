package com.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherSummary {

    @JsonProperty
    private int id;

    @JsonProperty
    private String cityName;

    @JsonProperty
    private String timeZone;

    public WeatherSummary() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}
