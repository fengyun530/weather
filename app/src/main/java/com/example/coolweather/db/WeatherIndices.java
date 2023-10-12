package com.example.coolweather.db;

import java.util.List;

public class WeatherIndices {

    /**
     * fxLink : https://www.qweather.com/indices/xiamen-101230201.html
     * code : 200
     * refer : {"license":["CC BY-SA 4.0"],"sources":["QWeather"]}
     * daily : [{"date":"2023-10-12","level":"2","name":"运动指数","text":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。","type":"1","category":"较适宜"},{"date":"2023-10-12","level":"3","name":"洗车指数","text":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","type":"2","category":"较不宜"},{"date":"2023-10-12","level":"5","name":"穿衣指数","text":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。","type":"3","category":"舒适"},{"date":"2023-10-12","level":"2","name":"钓鱼指数","text":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","type":"4","category":"较适宜"},{"date":"2023-10-12","level":"3","name":"紫外线指数","text":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。","type":"5","category":"中等"},{"date":"2023-10-12","level":"1","name":"旅游指数","text":"天气较好，温度适宜，但风稍微有点大。这样的天气适宜旅游，您可以尽情地享受大自然的无限风光。","type":"6","category":"适宜"},{"date":"2023-10-12","level":"2","name":"过敏指数","text":"天气条件不易诱发过敏，风力较大，除特殊体质外，无需担心过敏问题，外出注意防风。","type":"7","category":"不易发"},{"date":"2023-10-12","level":"1","name":"舒适度指数","text":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。","type":"8","category":"舒适"},{"date":"2023-10-12","level":"2","name":"感冒指数","text":"虽然温度适宜但风力较大，仍较易发生感冒，体质较弱的朋友请注意适当防护。","type":"9","category":"较易发"},{"date":"2023-10-12","level":"2","name":"空气污染扩散条件指数","text":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。","type":"10","category":"良"},{"date":"2023-10-12","level":"3","name":"空调开启指数","text":"您将感到很舒适，一般不需要开启空调。","type":"11","category":"较少开启"},{"date":"2023-10-12","level":"3","name":"太阳镜指数","text":"白天太阳辐射较强，建议佩戴透射比1级且标注UV380-UV400的浅色太阳镜","type":"12","category":"必要"},{"date":"2023-10-12","level":"5","name":"化妆指数","text":"天气较热，建议用露质面霜打底，水质无油粉底霜，透明粉饼，粉质胭脂。","type":"13","category":"去油"},{"date":"2023-10-12","level":"2","name":"晾晒指数","text":"天气不错，较适宜晾晒,赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","type":"14","category":"适宜"},{"date":"2023-10-12","level":"1","name":"交通指数","text":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","type":"15","category":"良好"},{"date":"2023-10-12","level":"2","name":"防晒指数","text":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","type":"16","category":"较弱"}]
     * updateTime : 2023-10-12T13:36+08:00
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
         * date : 2023-10-12
         * level : 2
         * name : 运动指数
         * text : 天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。
         * type : 1
         * category : 较适宜
         */
        private String date;
        private String level;
        private String name;
        private String text;
        private String type;
        private String category;

        public void setDate(String date) {
            this.date = date;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDate() {
            return date;
        }

        public String getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public String getText() {
            return text;
        }

        public String getType() {
            return type;
        }

        public String getCategory() {
            return category;
        }
    }
}
