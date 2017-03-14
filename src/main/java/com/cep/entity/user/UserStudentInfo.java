package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "user_student_info", schema = "cep_master", catalog = "cep_master")
public class UserStudentInfo {
    private long userId;
    private long classId;

    @Id
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "classId")
    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserStudentInfo that = (UserStudentInfo) o;

        if (userId != that.userId) return false;
        if (classId != that.classId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (classId ^ (classId >>> 32));
        return result;
    }
}
