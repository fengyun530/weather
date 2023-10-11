package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    /**
     * weatherId : CN101230201
     * id : 1
     * cityId : 18
     * countyName : 厦门
     */
    private String weatherId;
    private int id;
    private int cityId;
    private String countyName;

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }
}
