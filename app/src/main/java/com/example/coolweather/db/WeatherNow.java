package com.example.coolweather.db;

import java.util.List;

public class WeatherNow {

    /**
     * fxLink : https://www.qweather.com/weather/xiamen-101230201.html
     * code : 200
     * refer : {"license":["CC BY-SA 4.0"],"sources":["QWeather"]}
     * now : {"vis":"30","temp":"27","obsTime":"2023-10-12T13:58+08:00","icon":"100","wind360":"56","windDir":"东北风","pressure":"1001","feelsLike":"27","cloud":"10","precip":"0.0","dew":"19","humidity":"55","text":"晴","windSpeed":"18","windScale":"3"}
     * updateTime : 2023-10-12T14:02+08:00
     */
    private String fxLink;
    private String code;
    private ReferEntity refer;
    private NowEntity now;
    private String updateTime;

    public void setFxLink(String fxLink) {
        this.fxLink = fxLink;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRefer(ReferEntity refer) {
        this.refer = refer;
    }

    public void setNow(NowEntity now) {
        this.now = now;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getFxLink() {
        return fxLink;
    }

    public String getCode() {
        return code;
    }

    public ReferEntity getRefer() {
        return refer;
    }

    public NowEntity getNow() {
        return now;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public class ReferEntity {
        /**
         * license : ["CC BY-SA 4.0"]
         * sources : ["QWeather"]
         */
        private List<String> license;
        private List<String> sources;

        public void setLicense(List<String> license) {
            this.license = license;
        }

        public void setSources(List<String> sources) {
            this.sources = sources;
        }

        public List<String> getLicense() {
            return license;
        }

        public List<String> getSources() {
            return sources;
        }
    }

    public class NowEntity {
        /**
         * vis : 30
         * temp : 27
         * obsTime : 2023-10-12T13:58+08:00
         * icon : 100
         * wind360 : 56
         * windDir : 东北风
         * pressure : 1001
         * feelsLike : 27
         * cloud : 10
         * precip : 0.0
         * dew : 19
         * humidity : 55
         * text : 晴
         * windSpeed : 18
         * windScale : 3
         */
        private String vis;
        private String temp;
        private String obsTime;
        private String icon;
        private String wind360;
        private String windDir;
        private String pressure;
        private String feelsLike;
        private String cloud;
        private String precip;
        private String dew;
        private String humidity;
        private String text;
        private String windSpeed;
        private String windScale;

        public void setVis(String vis) {
            this.vis = vis;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public void setObsTime(String obsTime) {
            this.obsTime = obsTime;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setWind360(String wind360) {
            this.wind360 = wind360;
        }

        public void setWindDir(String windDir) {
            this.windDir = windDir;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public void setFeelsLike(String feelsLike) {
            this.feelsLike = feelsLike;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public void setPrecip(String precip) {
            this.precip = precip;
        }

        public void setDew(String dew) {
            this.dew = dew;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setWindSpeed(String windSpeed) {
            this.windSpeed = windSpeed;
        }

        public void setWindScale(String windScale) {
            this.windScale = windScale;
        }

        public String getVis() {
            return vis;
        }

        public String getTemp() {
            return temp;
        }

        public String getObsTime() {
            return obsTime;
        }

        public String getIcon() {
            return icon;
        }

        public String getWind360() {
            return wind360;
        }

        public String getWindDir() {
            return windDir;
        }

        public String getPressure() {
            return pressure;
        }

        public String getFeelsLike() {
            return feelsLike;
        }

        public String getCloud() {
            return cloud;
        }

        public String getPrecip() {
            return precip;
        }

        public String getDew() {
            return dew;
        }

        public String getHumidity() {
            return humidity;
        }

        public String getText() {
            return text;
        }

        public String getWindSpeed() {
            return windSpeed;
        }

        public String getWindScale() {
            return windScale;
        }
    }
}
