package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "family_info", schema = "cep_master", catalog = "cep_master")
public class FamilyInfo {
    private long id;
    private String name;
    private Integer addrCountyId;
    private String addrDetail;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FamilyInfo that = (FamilyInfo) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (addrCountyId != null ? !addrCountyId.equals(that.addrCountyId) : that.addrCountyId != null) return false;
        if (addrDetail != null ? !addrDetail.equals(that.addrDetail) : that.addrDetail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (addrCountyId != null ? addrCountyId.hashCode() : 0);
        result = 31 * result + (addrDetail != null ? addrDetail.hashCode() : 0);
        return result;
    }
}
