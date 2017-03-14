package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "sys_privilege_user", schema = "cep_master", catalog = "cep_master")
public class SysPrivilegeUser {
    private int id;
    private int privilegeId;
    private int schoolId;
    private long userId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "privilegeId")
    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Basic
    @Column(name = "schoolId")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysPrivilegeUser that = (SysPrivilegeUser) o;

        if (id != that.id) return false;
        if (privilegeId != that.privilegeId) return false;
        if (schoolId != that.schoolId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + privilegeId;
        result = 31 * result + schoolId;
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        return result;
    }
}
