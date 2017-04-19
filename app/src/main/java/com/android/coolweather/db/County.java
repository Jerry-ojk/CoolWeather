package com.android.coolweather.db;

import org.litepal.crud.DataSupport;



public class County extends DataSupport {
    private int id;
    private String cityName;
    private String weatherId;
    private int cityId;
    public int getId(){
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

    public String getweatherId() {
        return weatherId;
    }

    public void setweatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getcityId() {
        return cityId;
    }

    public void setcityId(int cityId) {
        this.cityId = cityId;
    }
}
