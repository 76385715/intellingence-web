package com.intellingence.pojo;

import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable {
    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 用户帐号
     */
    private String userid;

    /**
     * 用户密码
     */
    private String userpwd;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 0表示帐号密码登录,1表示Q登录,2表示微信,3表示手机
     */
    private Integer type;

    private Integer sex;

    /**
     * 生日 格式  1980-06-06 00:00:00
     */
    private Date birthday;

    private Float weight;

    private Float height;

    private String address;

    private String phone;

    private String email;

    private String icon;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    /**
     * 最后登录时间
     */
    private Date lastlogintime;

    private String lastloginversion;

    /**
     * 0表示正常,1表示删除
     */
    private Boolean state;

    private String mainaccount;

    /**
     * 紧急联系人消息
     */
    private String message;

    /**
     * 紧急联系人电话
     */
    private Integer contactsphone;

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

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginversion() {
        return lastloginversion;
    }

    public void setLastloginversion(String lastloginversion) {
        this.lastloginversion = lastloginversion == null ? null : lastloginversion.trim();
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getMainaccount() {
        return mainaccount;
    }

    public void setMainaccount(String mainaccount) {
        this.mainaccount = mainaccount == null ? null : mainaccount.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getContactsphone() {
        return contactsphone;
    }

    public void setContactsphone(Integer contactsphone) {
        this.contactsphone = contactsphone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", username=").append(username);
        sb.append(", type=").append(type);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", icon=").append(icon);
        sb.append(", signature=").append(signature);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", lastlogintime=").append(lastlogintime);
        sb.append(", lastloginversion=").append(lastloginversion);
        sb.append(", state=").append(state);
        sb.append(", mainaccount=").append(mainaccount);
        sb.append(", message=").append(message);
        sb.append(", contactsphone=").append(contactsphone);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}