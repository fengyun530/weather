package com.example.coolweather.db;

import java.util.List;

public class WeatherForecast {

    /**
     * fxLink : https://www.qweather.com/weather/xiamen-101230201.html
     * code : 200
     * refer : {"license":["CC BY-SA 4.0"],"sources":["QWeather"]}
     * daily : [{"moonset":"16:30","windSpeedDay":"24","sunrise":"06:04","moonPhaseIcon":"807","windScaleDay":"3-4","windScaleNight":"1-3","wind360Day":"66","iconDay":"101","wind360Night":"39","tempMax":"27","cloud":"0","textDay":"多云","precip":"0.0","textNight":"多云","humidity":"75","moonPhase":"残月","windDirDay":"东北风","windDirNight":"东北风","vis":"25","fxDate":"2023-10-12","moonrise":"03:40","pressure":"1014","iconNight":"151","sunset":"17:46","windSpeedNight":"16","uvIndex":"7","tempMin":"22"},{"moonset":"16:58","windSpeedDay":"19","sunrise":"06:04","moonPhaseIcon":"807","windScaleDay":"1-3","windScaleNight":"1-3","wind360Day":"65","iconDay":"101","wind360Night":"35","tempMax":"28","cloud":"0","textDay":"多云","precip":"0.0","textNight":"多云","humidity":"84","moonPhase":"残月","windDirDay":"东北风","windDirNight":"东北风","vis":"25","fxDate":"2023-10-13","moonrise":"04:30","pressure":"1011","iconNight":"151","sunset":"17:45","windSpeedNight":"13","uvIndex":"7","tempMin":"22"},{"moonset":"17:26","windSpeedDay":"11","sunrise":"06:04","moonPhaseIcon":"807","windScaleDay":"1-3","windScaleNight":"1-3","wind360Day":"76","iconDay":"101","wind360Night":"37","tempMax":"27","cloud":"100","textDay":"多云","precip":"0.6","textNight":"阴","humidity":"85","moonPhase":"残月","windDirDay":"东风","windDirNight":"东北风","vis":"22","fxDate":"2023-10-14","moonrise":"05:20","pressure":"1010","iconNight":"104","sunset":"17:44","windSpeedNight":"15","uvIndex":"7","tempMin":"23"}]
     * updateTime : 2023-10-12T13:35+08:00
     */
    private String fxLink;
    private String code;
    private ReferEntity refer;
    private List<DailyEntity> daily;
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

    public void setDaily(List<DailyEntity> daily) {
        this.daily = daily;
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

    public List<DailyEntity> getDaily() {
        return daily;
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

    public class DailyEntity {
        /**
         * moonset : 16:30
         * windSpeedDay : 24
         * sunrise : 06:04
         * moonPhaseIcon : 807
         * windScaleDay : 3-4
         * windScaleNight : 1-3
         * wind360Day : 66
         * iconDay : 101
         * wind360Night : 39
         * tempMax : 27
         * cloud : 0
         * textDay : 多云
         * precip : 0.0
         * textNight : 多云
         * humidity : 75
         * moonPhase : 残月
         * windDirDay : 东北风
         * windDirNight : 东北风
         * vis : 25
         * fxDate : 2023-10-12
         * moonrise : 03:40
         * pressure : 1014
         * iconNight : 151
         * sunset : 17:46
         * windSpeedNight : 16
         * uvIndex : 7
         * tempMin : 22
         */
        private String moonset;
        private String windSpeedDay;
        private String sunrise;
        private String moonPhaseIcon;
        private String windScaleDay;
        private String windScaleNight;
        private String wind360Day;
        private String iconDay;
        private String wind360Night;
        private String tempMax;
        private String cloud;
        private String textDay;
        private String precip;
        private String textNight;
        private String humidity;
        private String moonPhase;
        private String windDirDay;
        private String windDirNight;
        private String vis;
        private String fxDate;
        private String moonrise;
        private String pressure;
        private String iconNight;
        private String sunset;
        private String windSpeedNight;
        private String uvIndex;
        private String tempMin;

        public void setMoonset(String moonset) {
            this.moonset = moonset;
        }

        public void setWindSpeedDay(String windSpeedDay) {
            this.windSpeedDay = windSpeedDay;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public void setMoonPhaseIcon(String moonPhaseIcon) {
            this.moonPhaseIcon = moonPhaseIcon;
        }

        public void setWindScaleDay(String windScaleDay) {
            this.windScaleDay = windScaleDay;
        }

        public void setWindScaleNight(String windScaleNight) {
            this.windScaleNight = windScaleNight;
        }

        public void setWind360Day(String wind360Day) {
            this.wind360Day = wind360Day;
        }

        public void setIconDay(String iconDay) {
            this.iconDay = iconDay;
        }

        public void setWind360Night(String wind360Night) {
            this.wind360Night = wind360Night;
        }

        public void setTempMax(String tempMax) {
            this.tempMax = tempMax;
        }

        public void setCloud(String cloud) {
            this.cloud = cloud;
        }

        public void setTextDay(String textDay) {
            this.textDay = textDay;
        }

        public void setPrecip(String precip) {
            this.precip = precip;
        }

        public void setTextNight(String textNight) {
            this.textNight = textNight;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public void setMoonPhase(String moonPhase) {
            this.moonPhase = moonPhase;
        }

        public void setWindDirDay(String windDirDay) {
            this.windDirDay = windDirDay;
        }

        public void setWindDirNight(String windDirNight) {
            this.windDirNight = windDirNight;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public void setFxDate(String fxDate) {
            this.fxDate = fxDate;
        }

        public void setMoonrise(String moonrise) {
            this.moonrise = moonrise;
        }

        public void setPressure(String pressure) {
            this.pressure = pressure;
        }

        public void setIconNight(String iconNight) {
            this.iconNight = iconNight;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public void setWindSpeedNight(String windSpeedNight) {
            this.windSpeedNight = windSpeedNight;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public void setTempMin(String tempMin) {
            this.tempMin = tempMin;
        }

        public String getMoonset() {
            return moonset;
        }

        public String getWindSpeedDay() {
            return windSpeedDay;
        }

        public String getSunrise() {
            return sunrise;
        }

        public String getMoonPhaseIcon() {
            return moonPhaseIcon;
        }

        public String getWindScaleDay() {
            return windScaleDay;
        }

        public String getWindScaleNight() {
            return windScaleNight;
        }

        public String getWind360Day() {
            return wind360Day;
        }

        public String getIconDay() {
            return iconDay;
        }

        public String getWind360Night() {
            return wind360Night;
        }

        public String getTempMax() {
            return tempMax;
        }

        public String getCloud() {
            return cloud;
        }

        public String getTextDay() {
            return textDay;
        }

        public String getPrecip() {
            return precip;
        }

        public String getTextNight() {
            return textNight;
        }

        public String getHumidity() {
            return humidity;
        }

        public String getMoonPhase() {
            return moonPhase;
        }

        public String getWindDirDay() {
            return windDirDay;
        }

        public String getWindDirNight() {
            return windDirNight;
        }

        public String getVis() {
            return vis;
        }

        public String getFxDate() {
            return fxDate;
        }

        public String getMoonrise() {
            return moonrise;
        }

        public String getPressure() {
            return pressure;
        }

        public String getIconNight() {
            return iconNight;
        }

        public String getSunset() {
            return sunset;
        }

        public String getWindSpeedNight() {
            return windSpeedNight;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public String getTempMin() {
            return tempMin;
        }
    }
}
