package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "teacher_school_role_info", schema = "cep_master", catalog = "cep_master")
public class TeacherSchoolRoleInfo {
    private long id;
    private long userId;
    private int schoolId;
    private int roleId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
    @Column(name = "roleId")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherSchoolRoleInfo that = (TeacherSchoolRoleInfo) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (schoolId != that.schoolId) return false;
        if (roleId != that.roleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + schoolId;
        result = 31 * result + roleId;
        return result;
    }
}
