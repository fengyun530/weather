package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    /**
     * cityName : 厦门
     * cityCode : 101230201
     * id : 1
     * provinceId : 18
     */
    private String cityName;
    private int cityCode;
    private int id;
    private int provinceId;

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getId() {
        return id;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
