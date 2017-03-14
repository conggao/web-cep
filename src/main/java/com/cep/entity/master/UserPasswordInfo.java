package com.cep.entity.master;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2016/12/26.
 */
@Entity
@Table(name = "user_password_info", schema = "cep_master", catalog = "cep_master")
public class UserPasswordInfo {
    private long userId;
    private String password;
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
    @Column(name = "password", nullable = true, length = 33)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

        UserPasswordInfo that = (UserPasswordInfo) o;

        if (userId != that.userId) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
