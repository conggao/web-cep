package com.cep.entity.user;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pc on 2017/2/28.
 */


public class ViewSchoolInfo {
    private int id;
    private String name;
    private Integer addrCountyId;
    private String addrDetail;
    private String countyName;
    private String cityName;
    private String provinceName;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public Integer getAddrCountyId() {
        return addrCountyId;
    }

    public void setAddrCountyId(Integer addrCountyId) {
        this.addrCountyId = addrCountyId;
    }

    
    
    public String getAddrDetail() {
        return addrDetail;
    }

    public void setAddrDetail(String addrDetail) {
        this.addrDetail = addrDetail;
    }

    
    
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
    
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewSchoolInfo that = (ViewSchoolInfo) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (addrCountyId != null ? !addrCountyId.equals(that.addrCountyId) : that.addrCountyId != null) return false;
        if (addrDetail != null ? !addrDetail.equals(that.addrDetail) : that.addrDetail != null) return false;
        if (countyName != null ? !countyName.equals(that.countyName) : that.countyName != null) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;

        return true;
    }

    
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (addrCountyId != null ? addrCountyId.hashCode() : 0);
        result = 31 * result + (addrDetail != null ? addrDetail.hashCode() : 0);
        result = 31 * result + (countyName != null ? countyName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        return result;
    }
}
