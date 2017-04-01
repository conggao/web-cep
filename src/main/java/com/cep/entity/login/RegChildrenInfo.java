package com.cep.entity.login;

public class RegChildrenInfo implements java.io.Serializable
{
    private Long    studentId;
    private String  userName;
    private String  realName;
    private Boolean sex;
    private Integer birthday;
    private String  inviteCode;
    private Integer addrCityId;
    private Long    headPicId;

    public Long getHeadPicId()
    {
        return headPicId;
    }

    public void setHeadPicId(Long headPicId)
    {
        this.headPicId = headPicId;
    }

    public Integer getAddrCityId()
    {
        return addrCityId;
    }

    public void setAddrCityId(Integer addrCityId)
    {
        this.addrCityId = addrCityId;
    }

    public String getRealName()
    {
        return realName;
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    public String getInviteCode()
    {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode)
    {
        this.inviteCode = inviteCode;
    }

    public Long getStudentId()
    {
        return studentId;
    }

    public void setStudentId(Long studentId)
    {
        this.studentId = studentId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public Boolean getSex()
    {
        return sex;
    }

    public void setSex(Boolean sex)
    {
        this.sex = sex;
    }

    public Integer getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Integer birthday)
    {
        this.birthday = birthday;
    }

}