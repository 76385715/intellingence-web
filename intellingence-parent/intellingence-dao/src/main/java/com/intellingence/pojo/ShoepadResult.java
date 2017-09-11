package com.intellingence.pojo;

import java.io.Serializable;

public class ShoepadResult implements Serializable {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 用户帐号
     */
    private String userid;

    /**
     * 建议
     */
    private String comment;

    /**
     * 描述
     */
    private String description;

    /**
     * 测试类型，walking步行，running跑步
     */
    private String type;

    /**
     * 报告的uuid
     */
    private String uuid;

    /**
     * 算法版本
     */
    private String version;

    /**
     * 数据质量，反映本次测试是否有效，good好，qualified合格、unqualified不合格
     */
    private String dataquality;

    /**
     * 测量时长
     */
    private Double duration;

    /**
     * 步数
     */
    private Integer stepcount;

    /**
     * 步频
     */
    private Double steprate;

    /**
     * 步长
     */
    private Double stridelength;

    /**
     * 对称性
     */
    private Double symmetry;

    /**
     * 稳定性
     */
    private Double variability;

    /**
     * 是否外翻
     */
    private Integer eversionLeft;

    /**
     * 是否内翻
     */
    private Integer inversionLeft;

    /**
     * 着地位置(此处为拼接两个  frontal = outside;// 内外方向，outside外侧，inside内侧 sagital = heel;// 前后方向，heel足跟，flatfoot足中，toe足尖)
     */
    private String landingpositionLeft;

    /**
     * 触地时长
     */
    private Double stancedurationmeanLeft;

    /**
     * 步高
     */
    private Double stepheightmeanLeft;

    /**
     * 支撑稳定性
     */
    private Double supportstabilitymeanLeft;

    /**
     * 摆宽
     */
    private Double swingwidthmeanLeft;

    /**
     * 是否外翻
     */
    private Integer eversionRight;

    /**
     * 是否内翻
     */
    private Integer inversionRight;

    /**
     * 着地位置(此处为拼接两个  frontal = outside;// 内外方向，outside外侧，inside内侧 sagital = heel;// 前后方向，heel足跟，flatfoot足中，toe足尖)
     */
    private String landingpositionRight;

    /**
     * 触地时长
     */
    private Double stancedurationmeanRight;

    /**
     * 步高
     */
    private Double stepheightmeanRight;

    /**
     * 支撑稳定性
     */
    private Double supportstabilitymeanRight;

    /**
     * 摆宽
     */
    private Double swingwidthmeanRight;

    /**
     * 创建日期
     */
    private String creationtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDataquality() {
        return dataquality;
    }

    public void setDataquality(String dataquality) {
        this.dataquality = dataquality == null ? null : dataquality.trim();
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Integer getStepcount() {
        return stepcount;
    }

    public void setStepcount(Integer stepcount) {
        this.stepcount = stepcount;
    }

    public Double getSteprate() {
        return steprate;
    }

    public void setSteprate(Double steprate) {
        this.steprate = steprate;
    }

    public Double getStridelength() {
        return stridelength;
    }

    public void setStridelength(Double stridelength) {
        this.stridelength = stridelength;
    }

    public Double getSymmetry() {
        return symmetry;
    }

    public void setSymmetry(Double symmetry) {
        this.symmetry = symmetry;
    }

    public Double getVariability() {
        return variability;
    }

    public void setVariability(Double variability) {
        this.variability = variability;
    }

    public Integer getEversionLeft() {
        return eversionLeft;
    }

    public void setEversionLeft(Integer eversionLeft) {
        this.eversionLeft = eversionLeft;
    }

    public Integer getInversionLeft() {
        return inversionLeft;
    }

    public void setInversionLeft(Integer inversionLeft) {
        this.inversionLeft = inversionLeft;
    }

    public String getLandingpositionLeft() {
        return landingpositionLeft;
    }

    public void setLandingpositionLeft(String landingpositionLeft) {
        this.landingpositionLeft = landingpositionLeft == null ? null : landingpositionLeft.trim();
    }

    public Double getStancedurationmeanLeft() {
        return stancedurationmeanLeft;
    }

    public void setStancedurationmeanLeft(Double stancedurationmeanLeft) {
        this.stancedurationmeanLeft = stancedurationmeanLeft;
    }

    public Double getStepheightmeanLeft() {
        return stepheightmeanLeft;
    }

    public void setStepheightmeanLeft(Double stepheightmeanLeft) {
        this.stepheightmeanLeft = stepheightmeanLeft;
    }

    public Double getSupportstabilitymeanLeft() {
        return supportstabilitymeanLeft;
    }

    public void setSupportstabilitymeanLeft(Double supportstabilitymeanLeft) {
        this.supportstabilitymeanLeft = supportstabilitymeanLeft;
    }

    public Double getSwingwidthmeanLeft() {
        return swingwidthmeanLeft;
    }

    public void setSwingwidthmeanLeft(Double swingwidthmeanLeft) {
        this.swingwidthmeanLeft = swingwidthmeanLeft;
    }

    public Integer getEversionRight() {
        return eversionRight;
    }

    public void setEversionRight(Integer eversionRight) {
        this.eversionRight = eversionRight;
    }

    public Integer getInversionRight() {
        return inversionRight;
    }

    public void setInversionRight(Integer inversionRight) {
        this.inversionRight = inversionRight;
    }

    public String getLandingpositionRight() {
        return landingpositionRight;
    }

    public void setLandingpositionRight(String landingpositionRight) {
        this.landingpositionRight = landingpositionRight == null ? null : landingpositionRight.trim();
    }

    public Double getStancedurationmeanRight() {
        return stancedurationmeanRight;
    }

    public void setStancedurationmeanRight(Double stancedurationmeanRight) {
        this.stancedurationmeanRight = stancedurationmeanRight;
    }

    public Double getStepheightmeanRight() {
        return stepheightmeanRight;
    }

    public void setStepheightmeanRight(Double stepheightmeanRight) {
        this.stepheightmeanRight = stepheightmeanRight;
    }

    public Double getSupportstabilitymeanRight() {
        return supportstabilitymeanRight;
    }

    public void setSupportstabilitymeanRight(Double supportstabilitymeanRight) {
        this.supportstabilitymeanRight = supportstabilitymeanRight;
    }

    public Double getSwingwidthmeanRight() {
        return swingwidthmeanRight;
    }

    public void setSwingwidthmeanRight(Double swingwidthmeanRight) {
        this.swingwidthmeanRight = swingwidthmeanRight;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", comment=").append(comment);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
        sb.append(", uuid=").append(uuid);
        sb.append(", version=").append(version);
        sb.append(", dataquality=").append(dataquality);
        sb.append(", duration=").append(duration);
        sb.append(", stepcount=").append(stepcount);
        sb.append(", steprate=").append(steprate);
        sb.append(", stridelength=").append(stridelength);
        sb.append(", symmetry=").append(symmetry);
        sb.append(", variability=").append(variability);
        sb.append(", eversionLeft=").append(eversionLeft);
        sb.append(", inversionLeft=").append(inversionLeft);
        sb.append(", landingpositionLeft=").append(landingpositionLeft);
        sb.append(", stancedurationmeanLeft=").append(stancedurationmeanLeft);
        sb.append(", stepheightmeanLeft=").append(stepheightmeanLeft);
        sb.append(", supportstabilitymeanLeft=").append(supportstabilitymeanLeft);
        sb.append(", swingwidthmeanLeft=").append(swingwidthmeanLeft);
        sb.append(", eversionRight=").append(eversionRight);
        sb.append(", inversionRight=").append(inversionRight);
        sb.append(", landingpositionRight=").append(landingpositionRight);
        sb.append(", stancedurationmeanRight=").append(stancedurationmeanRight);
        sb.append(", stepheightmeanRight=").append(stepheightmeanRight);
        sb.append(", supportstabilitymeanRight=").append(supportstabilitymeanRight);
        sb.append(", swingwidthmeanRight=").append(swingwidthmeanRight);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}