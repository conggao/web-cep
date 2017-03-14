package com.cep.entity.user;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "user_push_info", schema = "cep_master", catalog = "cep_master")
public class UserPushInfo {
    private long userId;
    private String registrationId;
    private int osVersion;
    private Timestamp time;

    @Id
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "registrationId")
    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    @Basic
    @Column(name = "osVersion")
    public int getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(int osVersion) {
        this.osVersion = osVersion;
    }

    @Basic
    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPushInfo that = (UserPushInfo) o;

        if (userId != that.userId) return false;
        if (osVersion != that.osVersion) return false;
        if (registrationId != null ? !registrationId.equals(that.registrationId) : that.registrationId != null)
            return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (registrationId != null ? registrationId.hashCode() : 0);
        result = 31 * result + osVersion;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
