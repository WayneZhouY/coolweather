package com.coolweather.android.gson;

/**
 * Created by Wayne Zhou on 2017/2/8.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
