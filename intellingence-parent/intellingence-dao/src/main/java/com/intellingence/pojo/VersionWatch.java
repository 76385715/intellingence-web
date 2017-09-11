package com.intellingence.pojo;

import java.io.Serializable;
import java.util.Date;

public class VersionWatch implements Serializable {
    private Integer id;

    /**
     * 用来判断版本
     */
    private Integer versioncode;

    /**
     * 版本号,具体V1.0什么的
     */
    private String versionname;

    /**
     * 版本发布时间
     */
    private Date versiondatetime;

    private Date updatdate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersioncode() {
        return versioncode;
    }

    public void setVersioncode(Integer versioncode) {
        this.versioncode = versioncode;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname == null ? null : versionname.trim();
    }

    public Date getVersiondatetime() {
        return versiondatetime;
    }

    public void setVersiondatetime(Date versiondatetime) {
        this.versiondatetime = versiondatetime;
    }

    public Date getUpdatdate() {
        return updatdate;
    }

    public void setUpdatdate(Date updatdate) {
        this.updatdate = updatdate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", versioncode=").append(versioncode);
        sb.append(", versionname=").append(versionname);
        sb.append(", versiondatetime=").append(versiondatetime);
        sb.append(", updatdate=").append(updatdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}