package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "user_child_info", schema = "cep_master", catalog = "cep_master")
public class UserChildInfo {
    private long id;
    private long userId;
    private long studentId;
    private boolean isDel;

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
    @Column(name = "studentId")
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "isDel")
    public boolean isDel() {
        return isDel;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserChildInfo that = (UserChildInfo) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (studentId != that.studentId) return false;
        if (isDel != that.isDel) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (studentId ^ (studentId >>> 32));
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
