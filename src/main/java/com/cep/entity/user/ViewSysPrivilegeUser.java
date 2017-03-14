package com.cep.entity.user;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pc on 2017/2/28.
 */


public class ViewSysPrivilegeUser {
    private int id;
    private int privilegeId;
    private int schoolId;
    private long userId;
    private String realName;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    
    
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    
    
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    
    
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewSysPrivilegeUser that = (ViewSysPrivilegeUser) o;

        if (id != that.id) return false;
        if (privilegeId != that.privilegeId) return false;
        if (schoolId != that.schoolId) return false;
        if (userId != that.userId) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;

        return true;
    }

    
    public int hashCode() {
        int result = id;
        result = 31 * result + privilegeId;
        result = 31 * result + schoolId;
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        return result;
    }
}
