package com.dbsduwls103.ex14_viewpagerweather.Utils;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    static final String BASEURL = "https://api.openweathermap.org/data/2.5/";
    static final String ICONBASE = "http://motive.co.kr/images/weather/";
    static final String APPID = "b6c43c45171a007ce07fdfb1c378ff5a";
    static final String UNIT = "metric";

    @GET("weather")
    Call<JsonObject> getDailyWeather(
            @Query("appid") String appid,
            @Query("lat") double lat,
            @Query("lon") double lon,
            @Query("units") String units
    );

    @GET("forecast")
    Call<JsonObject> getWeeklyWeather(
            @Query("appid") String appid,
            @Query("lat") double lat,
            @Query("lon") double lon,
            @Query("units") String units
    );
}
