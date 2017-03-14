package com.cep.entity.master;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2017/3/3.
 */
@Entity
@Table(name = "io_base_info", schema = "cep_io", catalog = "cep_io")
public class IoBaseInfo {
    private long id;
    private long studentId;
    private Timestamp ioTime;
    private Timestamp createTime;
    private boolean type;
    private Timestamp showDate;
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
    @Column(name = "studentId")
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "ioTime")
    public Timestamp getIoTime() {
        return ioTime;
    }

    public void setIoTime(Timestamp ioTime) {
        this.ioTime = ioTime;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "type")
    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Basic
    @Column(name = "showDate")
    public Timestamp getShowDate() {
        return showDate;
    }

    public void setShowDate(Timestamp showDate) {
        this.showDate = showDate;
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

        IoBaseInfo that = (IoBaseInfo) o;

        if (id != that.id) return false;
        if (studentId != that.studentId) return false;
        if (type != that.type) return false;
        if (isDel != that.isDel) return false;
        if (ioTime != null ? !ioTime.equals(that.ioTime) : that.ioTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (showDate != null ? !showDate.equals(that.showDate) : that.showDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (studentId ^ (studentId >>> 32));
        result = 31 * result + (ioTime != null ? ioTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (type ? 1 : 0);
        result = 31 * result + (showDate != null ? showDate.hashCode() : 0);
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
