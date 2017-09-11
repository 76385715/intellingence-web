package com.intellingence.pojo;

import java.io.Serializable;

public class MonthHealthdataWithBLOBs extends MonthHealthdata implements Serializable {
    private String hrrep;

    private String ecrep;

    private String hrrrep;

    private String hrvrep;

    private static final long serialVersionUID = 1L;

    public String getHrrep() {
        return hrrep;
    }

    public void setHrrep(String hrrep) {
        this.hrrep = hrrep == null ? null : hrrep.trim();
    }

    public String getEcrep() {
        return ecrep;
    }

    public void setEcrep(String ecrep) {
        this.ecrep = ecrep == null ? null : ecrep.trim();
    }

    public String getHrrrep() {
        return hrrrep;
    }

    public void setHrrrep(String hrrrep) {
        this.hrrrep = hrrrep == null ? null : hrrrep.trim();
    }

    public String getHrvrep() {
        return hrvrep;
    }

    public void setHrvrep(String hrvrep) {
        this.hrvrep = hrvrep == null ? null : hrvrep.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hrrep=").append(hrrep);
        sb.append(", ecrep=").append(ecrep);
        sb.append(", hrrrep=").append(hrrrep);
        sb.append(", hrvrep=").append(hrvrep);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}