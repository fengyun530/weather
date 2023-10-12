package com.example.coolweather;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.coolweather.db.WeatherForecast;
import com.example.coolweather.db.WeatherIndices;
import com.example.coolweather.db.WeatherNow;
import com.example.coolweather.util.HttpUtil;
import com.example.coolweather.util.Utility;

import org.w3c.dom.Text;

import java.io.IOException;
import java.util.Date;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class WeatherActivity extends AppCompatActivity {
    private ScrollView  weatherLayout;
    private TextView titleCity;
    private TextView titleUpdateTime;
    private LinearLayout  forecastLayout;
    private LinearLayout indicesLayout;
    private TextView degreeeText;
    private TextView weatherInfoText;
    private TextView sportText;
    private TextView comfortText;
    private TextView windDirText;
    private TextView windScaleText;
    private TextView windSpeedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        //设置顶部状态栏为透明
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        titleCity = (TextView)findViewById(R.id.title_city);
        titleUpdateTime = (TextView)findViewById(R.id.title_update_time);
        degreeeText = (TextView)findViewById(R.id.degree_text);
        weatherInfoText = (TextView)findViewById(R.id.weather_info_text);
        windDirText = (TextView)findViewById(R.id.wind_dir_text);
        windScaleText = (TextView)findViewById(R.id.wind_scale_text);
        windSpeedText = (TextView)findViewById(R.id.wind_speed_text);
//        comfortText = (TextView) findViewById(R.id.comfort_text);
//        sportText = (TextView) findViewById(R.id.sport_text);
        weatherLayout =(ScrollView)findViewById(R.id.weather_layout);
        forecastLayout = (LinearLayout)findViewById(R.id.forecast_layout);
        indicesLayout  = (LinearLayout)findViewById(R.id.indices_layout);
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
//        String weatherString = prefs.getString("weather",null);
        String cityName  = getIntent().getStringExtra("city_name");
        String weatherId  = getIntent().getStringExtra("weather_id");
        titleCity.setText(cityName);
        weatherLayout.setVisibility(View.INVISIBLE);
        requestWeather(weatherId,"now");
        requestWeather(weatherId,"forecast");
        requestWeather(weatherId,"indices");
        weatherLayout.setVisibility(View.VISIBLE);
    }

    private void requestWeather(final String weatherId, final String type){
             String weatherUrl = "";
            if("now".equals(type)) {
                weatherUrl = "https://devapi.qweather.com/v7/weather/now?location=" + weatherId + "&key=57cd15c8e9e349089743a64780101a81";
            }else if("forecast".equals(type)) {
                weatherUrl = "https://devapi.qweather.com/v7/weather/7d?location=" + weatherId + "&key=57cd15c8e9e349089743a64780101a81";
            }else if("indices".equals(type)) {
                weatherUrl = "https://devapi.qweather.com/v7/indices/1d?type=0&location=" + weatherId + "&key=57cd15c8e9e349089743a64780101a81";
            }
            HttpUtil.sendOkHttpRequest(weatherUrl, new Callback() {
                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    final String responseText = response.body().string();
                    if("now".equals(type)) {
                         WeatherNow weatherNow = Utility.handleWeatherNowResponse(responseText);
                         showWeatherNowInfo(weatherNow);
                    }else if("forecast".equals(type)){
                        WeatherForecast weatherForecast = Utility.handleWeatherForecastResponse(responseText);
                        showWeatherFroecastInfo(weatherForecast);
                    }else if("indices".equals(type)){
                        WeatherIndices weatherIndices = Utility.handleWeatherIndicesResponse(responseText);
                        showWeatherIndicesInfo(weatherIndices);
                    }
                }

                @Override
                public void onFailure(Call call, final IOException e) {
                    e.printStackTrace();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(WeatherActivity.this,"获取天气失败:"+e.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    });
                }
            });
        }


    private void showWeatherNowInfo(final WeatherNow weatherNow){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(weatherNow!=null&&"200".equals(weatherNow.getCode())){
                    String[] first = String.valueOf(weatherNow.getUpdateTime()).split("[+]");
                    String[] second =first[0].split("T");
                    titleUpdateTime.setText(second[1]);
                    degreeeText.setText(weatherNow.getNow().getTemp()+"℃");
                    weatherInfoText.setText(weatherNow.getNow().getText());
                    windDirText.setText(weatherNow.getNow().getWindDir());
                    windScaleText.setText(weatherNow.getNow().getWindScale());
                    windSpeedText.setText(weatherNow.getNow().getWindSpeed()+"公里/小时");
                }
            }
        });
    }

    private void showWeatherFroecastInfo(final WeatherForecast weatherForecast){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(weatherForecast!=null&&"200".equals(weatherForecast.getCode())){
                    //forecastLayout.removeAllViews();
                    for(WeatherForecast.DailyEntity forecast:weatherForecast.getDaily()){
                        View view =LayoutInflater.from(WeatherActivity.this).inflate(R.layout.forecast_item,forecastLayout,false);
                        TextView dateText =  (TextView) view.findViewById(R.id.date_text);
                        TextView infoText = (TextView) view.findViewById(R.id.info_text);
                        TextView maxText = (TextView) view.findViewById(R.id.max_text);
                        TextView minText = (TextView)view.findViewById(R.id.min_text);
                        dateText.setText(forecast.getFxDate());
                        infoText.setText(forecast.getTextDay());
                        maxText.setText(forecast.getTempMax());
                        minText.setText(forecast.getTempMin());
                        forecastLayout.addView(view);
                    }
                }
            }
        });
    }

    private void showWeatherIndicesInfo(final WeatherIndices weatherIndices) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (weatherIndices != null && "200".equals(weatherIndices.getCode())) {
                       indicesLayout.removeAllViews();
                    for (WeatherIndices.DailyEntity indices : weatherIndices.getDaily()) {
                        View view = LayoutInflater.from(WeatherActivity.this).inflate(R.layout.suggestion_item, indicesLayout, false);
                        TextView indicesName = (TextView) view.findViewById(R.id.indices_name);
                        TextView indicesText = (TextView) view.findViewById(R.id.indices_text);
                        indicesName.setText(indices.getName());
                        indicesText.setText(indices.getText());
                        indicesLayout.addView(view);
                    }
                }
            }
        });
    }
}
