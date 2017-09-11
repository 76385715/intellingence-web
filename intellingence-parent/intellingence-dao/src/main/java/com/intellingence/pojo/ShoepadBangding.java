package com.intellingence.pojo;

import java.io.Serializable;
import java.util.Date;

public class ShoepadBangding implements Serializable {
    private Integer id;

    /**
     * 用户ID（对应用户信息表里的ID）
     */
    private Integer userid;

    /**
     * 设备辨识码,左脚
     */
    private String leftdevicemac;

    /**
     * 设备辨识码,右脚脚
     */
    private String rightdevicemac;

    /**
     * 更新时间
     */
    private Date updatetime;

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

    public String getLeftdevicemac() {
        return leftdevicemac;
    }

    public void setLeftdevicemac(String leftdevicemac) {
        this.leftdevicemac = leftdevicemac == null ? null : leftdevicemac.trim();
    }

    public String getRightdevicemac() {
        return rightdevicemac;
    }

    public void setRightdevicemac(String rightdevicemac) {
        this.rightdevicemac = rightdevicemac == null ? null : rightdevicemac.trim();
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
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", leftdevicemac=").append(leftdevicemac);
        sb.append(", rightdevicemac=").append(rightdevicemac);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}