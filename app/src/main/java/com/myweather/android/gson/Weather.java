package com.myweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by X_LM on 2017/11/24.
 * 总的实例类，引用五个之前创建的实体类
 */

public class Weather {
    public String status;//请求状态

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
