package com.myweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by X_LM on 2017/11/24.
 */

public class County extends DataSupport {
    private int id;

    private String countyName;//县的名称

    private String weatherId;//县对应天气ID

    private  int cityId;//当前县所属城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
