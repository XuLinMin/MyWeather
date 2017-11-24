package com.myweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by X_LM on 2017/11/24.
 * 当前天气信息实体类
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class  More{

        @SerializedName("txt")
        public String info;
    }
}
