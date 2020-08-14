package com.demo.entity;

//import com.demo.model.WeatherSummary;

import com.demo.model.WeatherSummary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather")
public class Weather {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "time_zone")
    private String timeZone;

    public Weather() {
    }

    public Weather(WeatherSummary weatherSummary) {
        this.id = weatherSummary.getId();
        this.cityName = weatherSummary.getCityName();
        this.timeZone = weatherSummary.getTimeZone();
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
