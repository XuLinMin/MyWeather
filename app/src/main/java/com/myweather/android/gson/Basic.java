package com.myweather.android.gson;

import android.text.style.UpdateAppearance;

import com.google.gson.annotations.SerializedName;

/**
 * Created by X_LM on 2017/11/24.
 * 城市基本信息实体类
 */

public class Basic {
    @SerializedName("city")
    public String cityName;//城市名称

    @SerializedName("id")
    public String weatherId;//城市对应天气Id

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;//天气更新时间
    }
}
