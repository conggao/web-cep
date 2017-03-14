package com.cep.entity.user;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pc on 2017/2/28.
 */


public class ViewUserFamilyInfo {
    private long userId;
    private long familyId;
    private int familyRoleTypeId;
    private String familyRoleTypeName;

    
    
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    
    
    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    
    
    public int getFamilyRoleTypeId() {
        return familyRoleTypeId;
    }

    public void setFamilyRoleTypeId(int familyRoleTypeId) {
        this.familyRoleTypeId = familyRoleTypeId;
    }

    
    
    public String getFamilyRoleTypeName() {
        return familyRoleTypeName;
    }

    public void setFamilyRoleTypeName(String familyRoleTypeName) {
        this.familyRoleTypeName = familyRoleTypeName;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewUserFamilyInfo that = (ViewUserFamilyInfo) o;

        if (userId != that.userId) return false;
        if (familyId != that.familyId) return false;
        if (familyRoleTypeId != that.familyRoleTypeId) return false;
        if (familyRoleTypeName != null ? !familyRoleTypeName.equals(that.familyRoleTypeName) : that.familyRoleTypeName != null)
            return false;

        return true;
    }

    
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (familyId ^ (familyId >>> 32));
        result = 31 * result + familyRoleTypeId;
        result = 31 * result + (familyRoleTypeName != null ? familyRoleTypeName.hashCode() : 0);
        return result;
    }
}
