package com.cep.entity.file;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2017/1/11.
 */
@Entity
@Table(name = "upload_file_info", schema = "cep_file", catalog = "cep_file")
public class UploadFileInfo {
    private long id;
    private String name;
    private String path;
    private long size;
    private String ext;
    private boolean isdel;

    private Timestamp time;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "path", nullable = false, length = -1)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "size", nullable = false)
    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Basic
    @Column(name = "ext", nullable = true, length = 255)
    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Basic
    @Column(name = "isdel", nullable = false)
    public boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(boolean isdel) {
        this.isdel = isdel;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UploadFileInfo that = (UploadFileInfo) o;

        if (id != that.id) return false;
        if (size != that.size) return false;
        if (isdel != that.isdel) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (ext != null ? !ext.equals(that.ext) : that.ext != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (int) (size ^ (size >>> 32));
        result = 31 * result + (ext != null ? ext.hashCode() : 0);
        result = 31 * result + (isdel ? 1 : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
