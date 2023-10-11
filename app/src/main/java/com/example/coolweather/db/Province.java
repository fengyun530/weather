package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    /**
     * provinceCode : 101230201
     * id : 1
     * provinceName : 北京
     */
    private int provinceCode;
    private int id;
    private String provinceName;

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
