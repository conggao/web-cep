package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "user_family_info", schema = "cep_master", catalog = "cep_master")
public class UserFamilyInfo {
    private long userId;
    private long familyId;
    private int familyRoleTypeId;

    @Id
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "familyId")
    public long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(long familyId) {
        this.familyId = familyId;
    }

    @Basic
    @Column(name = "familyRoleTypeId")
    public int getFamilyRoleTypeId() {
        return familyRoleTypeId;
    }

    public void setFamilyRoleTypeId(int familyRoleTypeId) {
        this.familyRoleTypeId = familyRoleTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFamilyInfo that = (UserFamilyInfo) o;

        if (userId != that.userId) return false;
        if (familyId != that.familyId) return false;
        if (familyRoleTypeId != that.familyRoleTypeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (familyId ^ (familyId >>> 32));
        result = 31 * result + familyRoleTypeId;
        return result;
    }
}
