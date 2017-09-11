package com.intellingence.pojo;

import java.io.Serializable;
import java.util.Date;

public class Devicebinging implements Serializable {
    /**
     * 用户ID（对应用户信息表里的ID）
     */
    private Integer userid;

    /**
     * 设备辨识码
     */
    private String devicemac;

    /**
     * 更新时间
     */
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDevicemac() {
        return devicemac;
    }

    public void setDevicemac(String devicemac) {
        this.devicemac = devicemac == null ? null : devicemac.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", devicemac=").append(devicemac);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}