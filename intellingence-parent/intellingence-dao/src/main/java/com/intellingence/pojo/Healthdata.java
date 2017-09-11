package com.intellingence.pojo;

import java.io.Serializable;
import java.util.Date;

public class Healthdata implements Serializable {
    private Integer id;

    private Integer userid;

    /**
     * 疲劳指数(Fatigue index)
     */
    private Integer fi;

    /**
     * 情绪状态(emotional state)
     */
    private Integer es;

    /**
     * 压力指数(Pressure index)
     */
    private Integer pi;

    /**
     * 抗压能力(Compressive capacity)
     */
    private Integer cc;

    /**
     * hrv分析结果(hrv result)
     */
    private String hrvr;

    /**
     * 平均心率(average heart rate)
     */
    private Integer ahr;

    /**
     * 最大心率(maximal heart rate)
     */
    private Integer maxhr;

    /**
     * 最小心率(Minimum heart rate)
     */
    private Integer minhr;

    /**
     * 心率分析结果(heart rater result)
     */
    private String hrr;

    /**
     * 心电分析结果(electrocardioresult)(1正常心电，2异常心电，3漏博，4早博)
     */
    private Integer ecr;

    /**
     * 心率恢能力
     */
    private Integer ra;

    /**
     * 数据库更新时间
     */
    private Date updatetime;

    /**
     * 数据的时间戳
     */
    private Long timestamp;

    /**
     * 数据的日期戳
     */
    private Date datatime;

    /**
     * 年度
     */
    private Integer year;

    /**
     * 季度
     */
    private Integer quarter;

    /**
     * 月度
     */
    private Integer month;

    /**
     * 一年中的第几周
     */
    private Integer week;

    private Integer date;

    /**
     * 距离
     */
    private Float distance;

    /**
     * 时间
     */
    private Float time;

    /**
     * 运动状态
     */
    private Integer state;

    /**
     * 心率总和
     */
    private Integer hrsum;

    /**
     * 心率次数
     */
    private Integer hrtimes;

    /**
     * 早博次数
     */
    private Integer zaobo;

    /**
     * 漏博次数
     */
    private Integer loubo;

    private Integer aliveness;

    private Integer inuse;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFi() {
        return fi;
    }

    public void setFi(Integer fi) {
        this.fi = fi;
    }

    public Integer getEs() {
        return es;
    }

    public void setEs(Integer es) {
        this.es = es;
    }

    public Integer getPi() {
        return pi;
    }

    public void setPi(Integer pi) {
        this.pi = pi;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getHrvr() {
        return hrvr;
    }

    public void setHrvr(String hrvr) {
        this.hrvr = hrvr == null ? null : hrvr.trim();
    }

    public Integer getAhr() {
        return ahr;
    }

    public void setAhr(Integer ahr) {
        this.ahr = ahr;
    }

    public Integer getMaxhr() {
        return maxhr;
    }

    public void setMaxhr(Integer maxhr) {
        this.maxhr = maxhr;
    }

    public Integer getMinhr() {
        return minhr;
    }

    public void setMinhr(Integer minhr) {
        this.minhr = minhr;
    }

    public String getHrr() {
        return hrr;
    }

    public void setHrr(String hrr) {
        this.hrr = hrr == null ? null : hrr.trim();
    }

    public Integer getEcr() {
        return ecr;
    }

    public void setEcr(Integer ecr) {
        this.ecr = ecr;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getTime() {
        return time;
    }

    public void setTime(Float time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getHrsum() {
        return hrsum;
    }

    public void setHrsum(Integer hrsum) {
        this.hrsum = hrsum;
    }

    public Integer getHrtimes() {
        return hrtimes;
    }

    public void setHrtimes(Integer hrtimes) {
        this.hrtimes = hrtimes;
    }

    public Integer getZaobo() {
        return zaobo;
    }

    public void setZaobo(Integer zaobo) {
        this.zaobo = zaobo;
    }

    public Integer getLoubo() {
        return loubo;
    }

    public void setLoubo(Integer loubo) {
        this.loubo = loubo;
    }

    public Integer getAliveness() {
        return aliveness;
    }

    public void setAliveness(Integer aliveness) {
        this.aliveness = aliveness;
    }

    public Integer getInuse() {
        return inuse;
    }

    public void setInuse(Integer inuse) {
        this.inuse = inuse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", fi=").append(fi);
        sb.append(", es=").append(es);
        sb.append(", pi=").append(pi);
        sb.append(", cc=").append(cc);
        sb.append(", hrvr=").append(hrvr);
        sb.append(", ahr=").append(ahr);
        sb.append(", maxhr=").append(maxhr);
        sb.append(", minhr=").append(minhr);
        sb.append(", hrr=").append(hrr);
        sb.append(", ecr=").append(ecr);
        sb.append(", ra=").append(ra);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", datatime=").append(datatime);
        sb.append(", year=").append(year);
        sb.append(", quarter=").append(quarter);
        sb.append(", month=").append(month);
        sb.append(", week=").append(week);
        sb.append(", date=").append(date);
        sb.append(", distance=").append(distance);
        sb.append(", time=").append(time);
        sb.append(", state=").append(state);
        sb.append(", hrsum=").append(hrsum);
        sb.append(", hrtimes=").append(hrtimes);
        sb.append(", zaobo=").append(zaobo);
        sb.append(", loubo=").append(loubo);
        sb.append(", aliveness=").append(aliveness);
        sb.append(", inuse=").append(inuse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}