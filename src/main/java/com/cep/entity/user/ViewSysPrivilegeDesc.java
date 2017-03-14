package com.cep.entity.user;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by pc on 2017/2/28.
 */


public class ViewSysPrivilegeDesc {
    private int id;
    private int sysId;
    private String sysName;
    private String privilegeDesc;

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    
    
    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    
    
    public String getPrivilegeDesc() {
        return privilegeDesc;
    }

    public void setPrivilegeDesc(String privilegeDesc) {
        this.privilegeDesc = privilegeDesc;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewSysPrivilegeDesc that = (ViewSysPrivilegeDesc) o;

        if (id != that.id) return false;
        if (sysId != that.sysId) return false;
        if (sysName != null ? !sysName.equals(that.sysName) : that.sysName != null) return false;
        if (privilegeDesc != null ? !privilegeDesc.equals(that.privilegeDesc) : that.privilegeDesc != null)
            return false;

        return true;
    }

    
    public int hashCode() {
        int result = id;
        result = 31 * result + sysId;
        result = 31 * result + (sysName != null ? sysName.hashCode() : 0);
        result = 31 * result + (privilegeDesc != null ? privilegeDesc.hashCode() : 0);
        return result;
    }
}
