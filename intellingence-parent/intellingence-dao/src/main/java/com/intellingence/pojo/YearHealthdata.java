package com.intellingence.pojo;

import java.io.Serializable;

public class YearHealthdata implements Serializable {
    private Integer id;

    private Integer userid;

    private Integer year;

    /**
     * 正常心电
     */
    private Integer normalec;

    /**
     * 异常心电
     */
    private Integer abnormalec;

    /**
     * 漏博
     */
    private Integer missedbeat;

    /**
     * 早博
     */
    private Integer prematurebeat;

    /**
     * 升降序排序：1.升序2.降序
     */
    private Integer pn;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNormalec() {
        return normalec;
    }

    public void setNormalec(Integer normalec) {
        this.normalec = normalec;
    }

    public Integer getAbnormalec() {
        return abnormalec;
    }

    public void setAbnormalec(Integer abnormalec) {
        this.abnormalec = abnormalec;
    }

    public Integer getMissedbeat() {
        return missedbeat;
    }

    public void setMissedbeat(Integer missedbeat) {
        this.missedbeat = missedbeat;
    }

    public Integer getPrematurebeat() {
        return prematurebeat;
    }

    public void setPrematurebeat(Integer prematurebeat) {
        this.prematurebeat = prematurebeat;
    }

    public Integer getPn() {
        return pn;
    }

    public void setPn(Integer pn) {
        this.pn = pn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", year=").append(year);
        sb.append(", normalec=").append(normalec);
        sb.append(", abnormalec=").append(abnormalec);
        sb.append(", missedbeat=").append(missedbeat);
        sb.append(", prematurebeat=").append(prematurebeat);
        sb.append(", pn=").append(pn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}