package com.cep.entity.file;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2016/12/28.
 */
@Entity
@Table(name = "dir_info", schema = "cep_file", catalog = "cep_file")
public class DirInfo {
    private long id;
    private Long parentId;
    private String name;
    private long createUserId;
    private Timestamp createTime;
    private boolean share;
    private boolean isDel;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parentId", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "createUserId", nullable = false)
    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "createTime", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "share", nullable = false)
    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    @Basic
    @Column(name = "isDel", nullable = false)
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

        DirInfo dirInfo = (DirInfo) o;

        if (id != dirInfo.id) return false;
        if (createUserId != dirInfo.createUserId) return false;
        if (share != dirInfo.share) return false;
        if (isDel != dirInfo.isDel) return false;
        if (parentId != null ? !parentId.equals(dirInfo.parentId) : dirInfo.parentId != null) return false;
        if (name != null ? !name.equals(dirInfo.name) : dirInfo.name != null) return false;
        if (createTime != null ? !createTime.equals(dirInfo.createTime) : dirInfo.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (share ? 1 : 0);
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
