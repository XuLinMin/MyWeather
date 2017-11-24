package com.myweather.android.gson;

/**
 * Created by X_LM on 2017/11/24.
 * 代表空气质量实体类
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
