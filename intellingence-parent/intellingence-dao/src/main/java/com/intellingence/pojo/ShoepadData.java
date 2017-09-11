package com.intellingence.pojo;

import java.io.Serializable;

public class ShoepadData implements Serializable {
    private Integer id;

    /**
     * 所属用户
     */
    private String userid;

    /**
     * 传感步态返回的数据的id
     */
    private Integer resultid;

    /**
     * 步态算法接口返回的此数据的唯一标识
     */
    private String uuid;

    /**
     * 此数据测量的时间,毫秒为单位
     */
    private String creationtime;

    /**
     * 此次测量的类型
     */
    private String type;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 female 表示女， male 表示男
     */
    private String gender;

    /**
     * 年龄
     */
    private String age;

    /**
     * 身高
     */
    private String height;

    /**
     * 体重
     */
    private String weight;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 测量目的
     */
    private String tag;

    /**
     * 左脚数据文件SHA-256 校验码（小写形式）
     */
    private String leftchecksum;

    /**
     * 右脚数据文件SHA-256 校验码（小写形式）
     */
    private String rightchecksum;

    /**
     * 测量的总距离
     */
    private String distance;

    /**
     * 测量时间长度
     */
    private String duration;

    /**
     * 最大速度
     */
    private String maxspeed;

    /**
     * 平均速度
     */
    private String averagespeed;

    /**
     * 配速数组
     */
    private String speedallocationarray;

    /**
     * 卡路里
     */
    private String calorie;

    /**
     * 步幅数组
     */
    private String stridelengtharray;

    /**
     * 步频数组
     */
    private String stepratearray;

    /**
     * 离地高度
     */
    private String stepheigh;

    /**
     * 摆动宽度
     */
    private String swingwidth;

    /**
     * 触地时长
     */
    private String stanceduration;

    /**
     * 着地冲击
     */
    private String landingcrash;

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

    public Integer getResultid() {
        return resultid;
    }

    public void setResultid(Integer resultid) {
        this.resultid = resultid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getLeftchecksum() {
        return leftchecksum;
    }

    public void setLeftchecksum(String leftchecksum) {
        this.leftchecksum = leftchecksum == null ? null : leftchecksum.trim();
    }

    public String getRightchecksum() {
        return rightchecksum;
    }

    public void setRightchecksum(String rightchecksum) {
        this.rightchecksum = rightchecksum == null ? null : rightchecksum.trim();
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance == null ? null : distance.trim();
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed == null ? null : maxspeed.trim();
    }

    public String getAveragespeed() {
        return averagespeed;
    }

    public void setAveragespeed(String averagespeed) {
        this.averagespeed = averagespeed == null ? null : averagespeed.trim();
    }

    public String getSpeedallocationarray() {
        return speedallocationarray;
    }

    public void setSpeedallocationarray(String speedallocationarray) {
        this.speedallocationarray = speedallocationarray == null ? null : speedallocationarray.trim();
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie == null ? null : calorie.trim();
    }

    public String getStridelengtharray() {
        return stridelengtharray;
    }

    public void setStridelengtharray(String stridelengtharray) {
        this.stridelengtharray = stridelengtharray == null ? null : stridelengtharray.trim();
    }

    public String getStepratearray() {
        return stepratearray;
    }

    public void setStepratearray(String stepratearray) {
        this.stepratearray = stepratearray == null ? null : stepratearray.trim();
    }

    public String getStepheigh() {
        return stepheigh;
    }

    public void setStepheigh(String stepheigh) {
        this.stepheigh = stepheigh == null ? null : stepheigh.trim();
    }

    public String getSwingwidth() {
        return swingwidth;
    }

    public void setSwingwidth(String swingwidth) {
        this.swingwidth = swingwidth == null ? null : swingwidth.trim();
    }

    public String getStanceduration() {
        return stanceduration;
    }

    public void setStanceduration(String stanceduration) {
        this.stanceduration = stanceduration == null ? null : stanceduration.trim();
    }

    public String getLandingcrash() {
        return landingcrash;
    }

    public void setLandingcrash(String landingcrash) {
        this.landingcrash = landingcrash == null ? null : landingcrash.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", resultid=").append(resultid);
        sb.append(", uuid=").append(uuid);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", phone=").append(phone);
        sb.append(", tag=").append(tag);
        sb.append(", leftchecksum=").append(leftchecksum);
        sb.append(", rightchecksum=").append(rightchecksum);
        sb.append(", distance=").append(distance);
        sb.append(", duration=").append(duration);
        sb.append(", maxspeed=").append(maxspeed);
        sb.append(", averagespeed=").append(averagespeed);
        sb.append(", speedallocationarray=").append(speedallocationarray);
        sb.append(", calorie=").append(calorie);
        sb.append(", stridelengtharray=").append(stridelengtharray);
        sb.append(", stepratearray=").append(stepratearray);
        sb.append(", stepheigh=").append(stepheigh);
        sb.append(", swingwidth=").append(swingwidth);
        sb.append(", stanceduration=").append(stanceduration);
        sb.append(", landingcrash=").append(landingcrash);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}