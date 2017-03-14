package com.cep.entity.user.protocol;


import com.cep.entity.master.UserBaseInfo;
import com.cep.entity.master.UserToken;
import com.cep.entity.user.*;

import java.util.List;

public class LoginUserInfo implements java.io.Serializable {

    private ViewSchoolInfo viewSchoolInfo;
    private Boolean isManager;

    private UserBaseInfo userBaseInfo;
    private UserCookie userCookie;
    private UserToken userToken;


    private String userHeadPicUrl;

    private List<ViewUserTeacherInfo> listViewUserTeacherInfo;
    private ViewUserStudentInfo viewUserStudentInfo;

    private ViewUserFamilyInfo viewUserFamilyInfo;
    private List<FamilyMemberInfo> listFamilyMemberInfo;

    private List<Integer> listPrivilegeId;

    public ViewSchoolInfo getViewSchoolInfo() {
        return viewSchoolInfo;
    }

    public void setViewSchoolInfo(ViewSchoolInfo viewSchoolInfo) {
        this.viewSchoolInfo = viewSchoolInfo;
    }


    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public UserBaseInfo getUserBaseInfo() {
        return userBaseInfo;
    }

    public void setUserBaseInfo(UserBaseInfo userBaseInfo) {
        this.userBaseInfo = userBaseInfo;
    }

    public UserCookie getUserCookie() {
        return userCookie;
    }

    public void setUserCookie(UserCookie userCookie) {
        this.userCookie = userCookie;
    }

    public UserToken getUserToken() {
        return userToken;
    }

    public void setUserToken(UserToken userToken) {
        this.userToken = userToken;
    }


    public String getUserHeadPicUrl() {
        return userHeadPicUrl;
    }

    public void setUserHeadPicUrl(String userHeadPicUrl) {
        this.userHeadPicUrl = userHeadPicUrl;
    }

    public List<ViewUserTeacherInfo> getListViewUserTeacherInfo() {
        return listViewUserTeacherInfo;
    }

    public void setListViewUserTeacherInfo(
            List<ViewUserTeacherInfo> listViewUserTeacherInfo) {
        this.listViewUserTeacherInfo = listViewUserTeacherInfo;
    }

    public ViewUserStudentInfo getViewUserStudentInfo() {
        return viewUserStudentInfo;
    }

    public void setViewUserStudentInfo(ViewUserStudentInfo viewUserStudentInfo) {
        this.viewUserStudentInfo = viewUserStudentInfo;
    }

    public ViewUserFamilyInfo getViewUserFamilyInfo() {
        return viewUserFamilyInfo;
    }

    public void setViewUserFamilyInfo(ViewUserFamilyInfo viewUserFamilyInfo) {
        this.viewUserFamilyInfo = viewUserFamilyInfo;
    }

    public List<FamilyMemberInfo> getListFamilyMemberInfo() {
        return listFamilyMemberInfo;
    }

    public void setListFamilyMemberInfo(List<FamilyMemberInfo> listFamilyMemberInfo) {
        this.listFamilyMemberInfo = listFamilyMemberInfo;
    }

    public List<Integer> getListPrivilegeId() {
        return listPrivilegeId;
    }

    public void setListPrivilegeId(List<Integer> listPrivilegeId) {
        this.listPrivilegeId = listPrivilegeId;
    }


}