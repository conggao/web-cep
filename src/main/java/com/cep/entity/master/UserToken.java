package com.cep.entity.master;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2017/1/22.
 */
@Entity
@Table(name = "user_token", schema = "cep_master", catalog = "cep_master")
public class UserToken {
    private long userId;
    private String token;
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
    @Column(name = "token", nullable = false, length = 32)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "updateTime", nullable = true)
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

        UserToken userToken = (UserToken) o;

        if (userId != userToken.userId) return false;
        if (token != null ? !token.equals(userToken.token) : userToken.token != null) return false;
        if (updateTime != null ? !updateTime.equals(userToken.updateTime) : userToken.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
