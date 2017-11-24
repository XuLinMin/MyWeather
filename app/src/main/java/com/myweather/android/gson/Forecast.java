package com.myweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by X_LM on 2017/11/24.
 * 未来天气，单日实体类
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }
    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
