package com.cep.entity.master;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2016/12/26.
 */
@Entity
@Table(name = "user_base_info", schema = "cep_master", catalog = "cep_master")
public class UserBaseInfo {
    private long userId;
    private String userName;
    private String mobilePhone;
    private String email;
    private Boolean sex;
    private int role;
    private String nickName;
    private String realName;
    private Long headPicId;
    private Integer birthday;
    private boolean regFlag;
    private Timestamp regTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "userId", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "mobilePhone", nullable = false, length = 12)
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "role", nullable = false)
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Basic
    @Column(name = "nickName", nullable = true, length = 30)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Basic
    @Column(name = "realName", nullable = true, length = 50)
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "headPicId", nullable = true)
    public Long getHeadPicId() {
        return headPicId;
    }

    public void setHeadPicId(Long headPicId) {
        this.headPicId = headPicId;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "regFlag", nullable = false)
    public boolean isRegFlag() {
        return regFlag;
    }

    public void setRegFlag(boolean regFlag) {
        this.regFlag = regFlag;
    }

    @Basic
    @Column(name = "regTime", nullable = false)
    public Timestamp getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    @Basic
    @Column(name = "updateTime", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBaseInfo that = (UserBaseInfo) o;

        if (userId != that.userId) return false;
        if (role != that.role) return false;
        if (regFlag != that.regFlag) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (mobilePhone != null ? !mobilePhone.equals(that.mobilePhone) : that.mobilePhone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (headPicId != null ? !headPicId.equals(that.headPicId) : that.headPicId != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (regTime != null ? !regTime.equals(that.regTime) : that.regTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (mobilePhone != null ? mobilePhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + role;
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (headPicId != null ? headPicId.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (regFlag ? 1 : 0);
        result = 31 * result + (regTime != null ? regTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
