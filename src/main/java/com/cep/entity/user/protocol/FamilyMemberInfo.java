package com.cep.entity.user.protocol;


import com.cep.entity.user.ViewSchoolInfo;
import com.cep.entity.user.ViewUserFamilyInfo;
import com.cep.entity.user.ViewUserSimpleInfo;
import com.cep.entity.user.ViewUserStudentInfo;

public class FamilyMemberInfo implements java.io.Serializable {


    private ViewUserSimpleInfo viewUserSimpleInfo;
    private ViewUserFamilyInfo viewUserFamilyInfo;
    private ViewSchoolInfo viewSchoolInfo;
    private ViewUserStudentInfo viewUserStudentInfo;

    public ViewUserSimpleInfo getViewUserSimpleInfo() {
        return viewUserSimpleInfo;
    }

    public void setViewUserSimpleInfo(ViewUserSimpleInfo viewUserSimpleInfo) {
        this.viewUserSimpleInfo = viewUserSimpleInfo;
    }

    public ViewUserFamilyInfo getViewUserFamilyInfo() {
        return viewUserFamilyInfo;
    }

    public void setViewUserFamilyInfo(ViewUserFamilyInfo viewUserFamilyInfo) {
        this.viewUserFamilyInfo = viewUserFamilyInfo;
    }

    public ViewSchoolInfo getViewSchoolInfo() {
        return viewSchoolInfo;
    }

    public void setViewSchoolInfo(ViewSchoolInfo viewSchoolInfo) {
        this.viewSchoolInfo = viewSchoolInfo;
    }

    public ViewUserStudentInfo getViewUserStudentInfo() {
        return viewUserStudentInfo;
    }

    public void setViewUserStudentInfo(ViewUserStudentInfo viewUserStudentInfo) {
        this.viewUserStudentInfo = viewUserStudentInfo;
    }


}