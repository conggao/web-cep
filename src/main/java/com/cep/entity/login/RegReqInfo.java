package com.cep.entity.login;

import java.util.List;

public class RegReqInfo implements java.io.Serializable
{
    private String                   realName;
    private String                   mobilePhone;
    private String                   password;
    private String                   smsVerificationCode;
    private Integer                  role;
    private Boolean                  sex;
    private Integer                  addrCityId;
    private String                   inviteCode;
    private RegChildrenInfo          regChildrenInfo;
    private List<RegClassCourseInfo> listRegClassCourseInfo;

    public String getRealName()
    {
        return this.realName;
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    public String getMobilePhone()
    {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone)
    {
        this.mobilePhone = mobilePhone;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSmsVerificationCode()
    {
        return smsVerificationCode;
    }

    public void setSmsVerificationCode(String smsVerificationCode)
    {
        this.smsVerificationCode = smsVerificationCode;
    }

    public Integer getRole()
    {
        return role;
    }

    public void setRole(Integer role)
    {
        this.role = role;
    }

    public Boolean getSex()
    {
        return this.sex;
    }

    public void setSex(Boolean sex)
    {
        this.sex = sex;
    }

    public Integer getAddrCityId()
    {
        return addrCityId;
    }

    public void setAddrCityId(Integer addrCityId)
    {
        this.addrCityId = addrCityId;
    }

    public String getInviteCode()
    {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode)
    {
        this.inviteCode = inviteCode;
    }

    public RegChildrenInfo getRegChildrenInfo()
    {
        return regChildrenInfo;
    }

    public void setRegChildrenInfo(RegChildrenInfo regChildrenInfo)
    {
        this.regChildrenInfo = regChildrenInfo;
    }

    public List<RegClassCourseInfo> getListRegClassCourseInfo()
    {
        return listRegClassCourseInfo;
    }

    public void setListRegClassCourseInfo(List<RegClassCourseInfo> listRegClassCourseInfo)
    {
        this.listRegClassCourseInfo = listRegClassCourseInfo;
    }

}