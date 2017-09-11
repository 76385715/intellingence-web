package com.intellingence.pojo;

import java.io.Serializable;

public class ShoepadDataWithBLOBs extends ShoepadData implements Serializable {
    /**
     * 左脚数据文件的存储路径
     */
    private String leftfile;

    /**
     * 右脚数据文件的存储路径
     */
    private String rightfile;

    /**
     * 分析结果
     */
    private String analysisresult;

    /**
     * 轨迹数组
     */
    private String trajectory;

    private static final long serialVersionUID = 1L;

    public String getLeftfile() {
        return leftfile;
    }

    public void setLeftfile(String leftfile) {
        this.leftfile = leftfile == null ? null : leftfile.trim();
    }

    public String getRightfile() {
        return rightfile;
    }

    public void setRightfile(String rightfile) {
        this.rightfile = rightfile == null ? null : rightfile.trim();
    }

    public String getAnalysisresult() {
        return analysisresult;
    }

    public void setAnalysisresult(String analysisresult) {
        this.analysisresult = analysisresult == null ? null : analysisresult.trim();
    }

    public String getTrajectory() {
        return trajectory;
    }

    public void setTrajectory(String trajectory) {
        this.trajectory = trajectory == null ? null : trajectory.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", leftfile=").append(leftfile);
        sb.append(", rightfile=").append(rightfile);
        sb.append(", analysisresult=").append(analysisresult);
        sb.append(", trajectory=").append(trajectory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}