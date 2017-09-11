package com.intellingence.pojo;

import java.io.Serializable;

public class HealthdataWithBLOBs extends Healthdata implements Serializable {
    /**
     * hrv健康建议(hrv suggest)
     */
    private String hrvs;

    /**
     * 心率健康建议(heart rater suggest)
     */
    private String hrs;

    /**
     * 心电数据(electrocardio)
     */
    private String ec;

    /**
     * 心电健康建议(electrocardio suggest)
     */
    private String ecs;

    /**
     * 心率
     */
    private String hr;

    /**
     * 有氧无氧
     */
    private String ae;

    /**
     * 步频
     */
    private String cadence;

    /**
     * 经纬度
     */
    private String latitudeLongitude;

    /**
     * 卡路里
     */
    private String calorie;

    private static final long serialVersionUID = 1L;

    public String getHrvs() {
        return hrvs;
    }

    public void setHrvs(String hrvs) {
        this.hrvs = hrvs == null ? null : hrvs.trim();
    }

    public String getHrs() {
        return hrs;
    }

    public void setHrs(String hrs) {
        this.hrs = hrs == null ? null : hrs.trim();
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec == null ? null : ec.trim();
    }

    public String getEcs() {
        return ecs;
    }

    public void setEcs(String ecs) {
        this.ecs = ecs == null ? null : ecs.trim();
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr == null ? null : hr.trim();
    }

    public String getAe() {
        return ae;
    }

    public void setAe(String ae) {
        this.ae = ae == null ? null : ae.trim();
    }

    public String getCadence() {
        return cadence;
    }

    public void setCadence(String cadence) {
        this.cadence = cadence == null ? null : cadence.trim();
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude == null ? null : latitudeLongitude.trim();
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie == null ? null : calorie.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hrvs=").append(hrvs);
        sb.append(", hrs=").append(hrs);
        sb.append(", ec=").append(ec);
        sb.append(", ecs=").append(ecs);
        sb.append(", hr=").append(hr);
        sb.append(", ae=").append(ae);
        sb.append(", cadence=").append(cadence);
        sb.append(", latitudeLongitude=").append(latitudeLongitude);
        sb.append(", calorie=").append(calorie);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}