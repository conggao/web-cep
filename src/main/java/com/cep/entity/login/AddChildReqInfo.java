package com.cep.entity.login;

public class AddChildReqInfo implements java.io.Serializable
{
    private Long            parentId;
    private Long            familyId;
    private String          mobilePhone;
    private RegChildrenInfo regChildrenInfo;

    public Long getParentId()
    {
        return parentId;
    }

    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public Long getFamilyId()
    {
        return familyId;
    }

    public void setFamilyId(Long familyId)
    {
        this.familyId = familyId;
    }

    public String getMobilePhone()
    {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
    }

    public RegChildrenInfo getRegChildrenInfo()
    {
        return regChildrenInfo;
    }

    public void setRegChildrenInfo(RegChildrenInfo regChildrenInfo)
    {
        this.regChildrenInfo = regChildrenInfo;
    }
}
