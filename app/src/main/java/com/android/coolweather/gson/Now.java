package com.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 1583605494 on 2017/4/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
