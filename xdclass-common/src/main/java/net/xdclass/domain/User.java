package net.xdclass.domain;

import java.util.Date;
import java.util.Objects;

/**
 * @authordell
 * @date2024/12/1021:28
 * @param${PARAM}
 */

public class User {

    private Integer id;
    private String name;
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;
    private String wechat;

    public User() {
    }

    public User(Integer id, String name, String pwd, String headImg, String phone, Date createTime, String wechat) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.headImg = headImg;
        this.phone = phone;
        this.createTime = createTime;
        this.wechat = wechat;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public String getPhone() {
        return phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getWechat() {
        return wechat;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(pwd, user.pwd) &&
                Objects.equals(headImg, user.headImg) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(createTime, user.createTime) &&
                Objects.equals(wechat, user.wechat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd, headImg, phone, createTime, wechat);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", wechat='" + wechat + '\'' +
                '}';
    }
}
