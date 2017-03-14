package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "user_im_info", schema = "cep_master", catalog = "cep_master")
public class UserImInfo {
    private long userId;
    private String imAccount;
    private String imPassword;

    @Id
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "imAccount")
    public String getImAccount() {
        return imAccount;
    }

    public void setImAccount(String imAccount) {
        this.imAccount = imAccount;
    }

    @Basic
    @Column(name = "imPassword")
    public String getImPassword() {
        return imPassword;
    }

    public void setImPassword(String imPassword) {
        this.imPassword = imPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserImInfo that = (UserImInfo) o;

        if (userId != that.userId) return false;
        if (imAccount != null ? !imAccount.equals(that.imAccount) : that.imAccount != null) return false;
        if (imPassword != null ? !imPassword.equals(that.imPassword) : that.imPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (imAccount != null ? imAccount.hashCode() : 0);
        result = 31 * result + (imPassword != null ? imPassword.hashCode() : 0);
        return result;
    }
}
