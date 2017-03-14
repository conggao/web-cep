package com.cep.entity.imgText.view;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pc on 2017/3/2.
 */


public class ViewImgTextReadUserInfo {
    private long studentId;

    
    
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewImgTextReadUserInfo that = (ViewImgTextReadUserInfo) o;

        if (studentId != that.studentId) return false;

        return true;
    }

    
    public int hashCode() {
        return (int) (studentId ^ (studentId >>> 32));
    }
}
