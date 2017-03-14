package com.cep.entity.user;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "school_info", schema = "cep_master", catalog = "cep_master")
public class SchoolInfo {
    private int id;
    private String name;
    private int addrProvinceId;
    private Integer addrCityId;
    private Integer addrCountyId;
    private String addrDetail;
    private int inviteCode;
    private long manageUserId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Long updateUserId;
    private boolean isDel;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "addrProvinceId")
    public int getAddrProvinceId() {
        return addrProvinceId;
    }

    public void setAddrProvinceId(int addrProvinceId) {
        this.addrProvinceId = addrProvinceId;
    }

    @Basic
    @Column(name = "addrCityId")
    public Integer getAddrCityId() {
        return addrCityId;
    }

    public void setAddrCityId(Integer addrCityId) {
        this.addrCityId = addrCityId;
    }

    @Basic
    @Column(name = "addrCountyId")
    public Integer getAddrCountyId() {
        return addrCountyId;
    }

    public void setAddrCountyId(Integer addrCountyId) {
        this.addrCountyId = addrCountyId;
    }

    @Basic
    @Column(name = "addrDetail")
    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    @Basic
    @Column(name = "inviteCode")
    public int getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(int inviteCode) {
        this.inviteCode = inviteCode;
    }

    @Basic
    @Column(name = "manageUserId")
    public long getManageUserId() {
        return manageUserId;
    }

    public void setManageUserId(long manageUserId) {
        this.manageUserId = manageUserId;
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
    @Column(name = "updateTime")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "updateUserId")
    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
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

        SchoolInfo that = (SchoolInfo) o;

        if (id != that.id) return false;
        if (addrProvinceId != that.addrProvinceId) return false;
        if (inviteCode != that.inviteCode) return false;
        if (manageUserId != that.manageUserId) return false;
        if (isDel != that.isDel) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (addrCityId != null ? !addrCityId.equals(that.addrCityId) : that.addrCityId != null) return false;
        if (addrCountyId != null ? !addrCountyId.equals(that.addrCountyId) : that.addrCountyId != null) return false;
        if (addrDetail != null ? !addrDetail.equals(that.addrDetail) : that.addrDetail != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + addrProvinceId;
        result = 31 * result + (addrCityId != null ? addrCityId.hashCode() : 0);
        result = 31 * result + (addrCountyId != null ? addrCountyId.hashCode() : 0);
        result = 31 * result + (addrDetail != null ? addrDetail.hashCode() : 0);
        result = 31 * result + inviteCode;
        result = 31 * result + (int) (manageUserId ^ (manageUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
