package com.cep.entity.user;

import javax.persistence.*;

/**
 * Created by pc on 2017/2/28.
 */
@Entity
@Table(name = "sys_privilege_desc", schema = "cep_master", catalog = "cep_master")
public class SysPrivilegeDesc {
    private int id;
    private int sysId;
    private String privilegeDesc;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sysId")
    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    @Basic
    @Column(name = "privilegeDesc")
    public String getPrivilegeDesc() {
        return privilegeDesc;
    }

    public void setPrivilegeDesc(String privilegeDesc) {
        this.privilegeDesc = privilegeDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysPrivilegeDesc that = (SysPrivilegeDesc) o;

        if (id != that.id) return false;
        if (sysId != that.sysId) return false;
        if (privilegeDesc != null ? !privilegeDesc.equals(that.privilegeDesc) : that.privilegeDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + sysId;
        result = 31 * result + (privilegeDesc != null ? privilegeDesc.hashCode() : 0);
        return result;
    }
}
