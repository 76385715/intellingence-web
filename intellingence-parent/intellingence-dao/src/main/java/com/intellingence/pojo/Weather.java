package com.intellingence.pojo;

import java.io.Serializable;

public class Weather implements Serializable {
    /**
     * 上传时的时间戳
     */
    private Integer updatetimestamp;

    /**
     * 温度（c）
     */
    private Integer temperature;

    /**
     * 湿度(%)
     */
    private Integer humidity;

    /**
     * 紫外线强度（W/㎡）
     */
    private Integer uv;

    /**
     * 地址
     */
    private String address;

    /**
     * 经度
     */
    private Integer longitude;

    /**
     * 纬度
     */
    private Integer latitude;

    /**
     * 该点与赤道平行向左2000米的经度
     */
    private Integer longitude0left;

    /**
     * 该点与赤道平行向右2000米的经度
     */
    private Integer longitude0right;

    /**
     * 该点向垂直向上2000米的纬度
     */
    private Integer latitude0up;

    /**
     * 该点向垂直向下2000米的纬度
     */
    private Integer latitude0down;

    private static final long serialVersionUID = 1L;

    public Integer getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(Integer updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude0left() {
        return longitude0left;
    }

    public void setLongitude0left(Integer longitude0left) {
        this.longitude0left = longitude0left;
    }

    public Integer getLongitude0right() {
        return longitude0right;
    }

    public void setLongitude0right(Integer longitude0right) {
        this.longitude0right = longitude0right;
    }

    public Integer getLatitude0up() {
        return latitude0up;
    }

    public void setLatitude0up(Integer latitude0up) {
        this.latitude0up = latitude0up;
    }

    public Integer getLatitude0down() {
        return latitude0down;
    }

    public void setLatitude0down(Integer latitude0down) {
        this.latitude0down = latitude0down;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", updatetimestamp=").append(updatetimestamp);
        sb.append(", temperature=").append(temperature);
        sb.append(", humidity=").append(humidity);
        sb.append(", uv=").append(uv);
        sb.append(", address=").append(address);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude0left=").append(longitude0left);
        sb.append(", longitude0right=").append(longitude0right);
        sb.append(", latitude0up=").append(latitude0up);
        sb.append(", latitude0down=").append(latitude0down);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}