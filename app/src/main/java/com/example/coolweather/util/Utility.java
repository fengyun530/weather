package com.example.coolweather.util;

import android.text.TextUtils;

import com.example.coolweather.db.City;
import com.example.coolweather.db.County;
import com.example.coolweather.db.Province;
import com.example.coolweather.db.WeatherForecast;
import com.example.coolweather.db.WeatherIndices;
import com.example.coolweather.db.WeatherNow;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    /**
     *  解析和处理服务器返回的省级数据
     * @param response
     * @return boolean
     */
    public static boolean handleProviceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i=0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
    /**
     *  解析和处理服务器返回的市级数据
     * @param response provinceId
     * @return boolean
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCity = new JSONArray(response);
                for(int i=0;i<allCity.length();i++) {
                    JSONObject cityObject = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                    e.printStackTrace();
                }
        }
        return false;
    }

    /**
     *  解析和处理服务器返回的县级数据
     * @param response cityId
     * @return boolean
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCounty = new JSONArray(response);
                for(int i=0;i<allCounty.length();i++) {
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     *  将返回的json数据解析成WeatherNow实体类
     */
    public static WeatherNow handleWeatherNowResponse(String response){
        try{
            return new Gson().fromJson(response.toString(),WeatherNow.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     *  将返回的json数据解析成WeatherForecast实体类
     */
    public static WeatherForecast handleWeatherForecastResponse(String response){
        try{
            return new Gson().fromJson(response.toString(),WeatherForecast.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     *  将返回的json数据解析成WeatherNow实体类
     */
    public static WeatherIndices handleWeatherIndicesResponse(String response){
        try{
            return new Gson().fromJson(response.toString(),WeatherIndices.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
