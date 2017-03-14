package com.cep.entity.user.protocol;
import java.util.List;
public class LoginInfo {
    private ValueBean value;
    private TypeBean type;
    public ValueBean getValue() {
        return value;
    }
    public void setValue(ValueBean value) {
        this.value = value;
    }
    public TypeBean getType() {
        return type;
    }
    public void setType(TypeBean type) {
        this.type = type;
    }
    public static class ValueBean {
        private UserBaseInfoBean userBaseInfo;
        private UserTokenBean userToken;
        private String userHeadPicUrl;
        private List<ListChildInfoBean> listChildInfo;
        private List<ListViewUserTeacherInfoBean> listViewUserTeacherInfo;
        public UserBaseInfoBean getUserBaseInfo() {
            return userBaseInfo;
        }
        public void setUserBaseInfo(UserBaseInfoBean userBaseInfo) {
            this.userBaseInfo = userBaseInfo;
        }
        public UserTokenBean getUserToken() {
            return userToken;
        }
        public void setUserToken(UserTokenBean userToken) {
            this.userToken = userToken;
        }
        public String getUserHeadPicUrl() {
            return userHeadPicUrl;
        }
        public void setUserHeadPicUrl(String userHeadPicUrl) {
            this.userHeadPicUrl = userHeadPicUrl;
        }
        public List<ListChildInfoBean> getListChildInfo() {
            return listChildInfo;
        }
        public void setListChildInfo(List<ListChildInfoBean> listChildInfo) {
            this.listChildInfo = listChildInfo;
        }
        public List<ListViewUserTeacherInfoBean> getListViewUserTeacherInfo() {
            return listViewUserTeacherInfo;
        }
        public void setListViewUserTeacherInfo(List<ListViewUserTeacherInfoBean> listViewUserTeacherInfo) {
            this.listViewUserTeacherInfo = listViewUserTeacherInfo;
        }
        public static class UserBaseInfoBean {
            private int userId;
            private String userName;
            private String mobilePhone;
            private boolean sex;
            private int role;
            private String nickName;
            private String realName;
            private int headPicId;
            private boolean regFlag;
            private String regTime;
            private String updateTime;
            public int getUserId() {
                return userId;
            }
            public void setUserId(int userId) {
                this.userId = userId;
            }
            public String getUserName() {
                return userName;
            }
            public void setUserName(String userName) {
                this.userName = userName;
            }
            public String getMobilePhone() {
                return mobilePhone;
            }
            public void setMobilePhone(String mobilePhone) {
                this.mobilePhone = mobilePhone;
            }
            public boolean isSex() {
                return sex;
            }
            public void setSex(boolean sex) {
                this.sex = sex;
            }
            public int getRole() {
                return role;
            }
            public void setRole(int role) {
                this.role = role;
            }
            public String getNickName() {
                return nickName;
            }
            public void setNickName(String nickName) {
                this.nickName = nickName;
            }
            public String getRealName() {
                return realName;
            }
            public void setRealName(String realName) {
                this.realName = realName;
            }
            public int getHeadPicId() {
                return headPicId;
            }
            public void setHeadPicId(int headPicId) {
                this.headPicId = headPicId;
            }
            public boolean isRegFlag() {
                return regFlag;
            }
            public void setRegFlag(boolean regFlag) {
                this.regFlag = regFlag;
            }
            public String getRegTime() {
                return regTime;
            }
            public void setRegTime(String regTime) {
                this.regTime = regTime;
            }
            public String getUpdateTime() {
                return updateTime;
            }
            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }
        }
        public static class UserTokenBean {
            private int userId;
            private String token;
            private String updateTime;
            public int getUserId() {
                return userId;
            }
            public void setUserId(int userId) {
                this.userId = userId;
            }
            public String getToken() {
                return token;
            }
            public void setToken(String token) {
                this.token = token;
            }
            public String getUpdateTime() {
                return updateTime;
            }
            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }
        }
        public static class ListChildInfoBean {
            private ViewSchoolInfoBean viewSchoolInfo;
            private UserBaseInfoBeanX userBaseInfo;
            private UserTokenBeanX userToken;
            private String userHeadPicUrl;
            private ViewUserStudentInfoBean viewUserStudentInfo;
            private ViewUserFamilyInfoBean viewUserFamilyInfo;
            private List<ListFamilyMemberInfoBean> listFamilyMemberInfo;
            public ViewSchoolInfoBean getViewSchoolInfo() {
                return viewSchoolInfo;
            }
            public void setViewSchoolInfo(ViewSchoolInfoBean viewSchoolInfo) {
                this.viewSchoolInfo = viewSchoolInfo;
            }
            public UserBaseInfoBeanX getUserBaseInfo() {
                return userBaseInfo;
            }
            public void setUserBaseInfo(UserBaseInfoBeanX userBaseInfo) {
                this.userBaseInfo = userBaseInfo;
            }
            public UserTokenBeanX getUserToken() {
                return userToken;
            }
            public void setUserToken(UserTokenBeanX userToken) {
                this.userToken = userToken;
            }
            public String getUserHeadPicUrl() {
                return userHeadPicUrl;
            }
            public void setUserHeadPicUrl(String userHeadPicUrl) {
                this.userHeadPicUrl = userHeadPicUrl;
            }
            public ViewUserStudentInfoBean getViewUserStudentInfo() {
                return viewUserStudentInfo;
            }
            public void setViewUserStudentInfo(ViewUserStudentInfoBean viewUserStudentInfo) {
                this.viewUserStudentInfo = viewUserStudentInfo;
            }
            public ViewUserFamilyInfoBean getViewUserFamilyInfo() {
                return viewUserFamilyInfo;
            }
            public void setViewUserFamilyInfo(ViewUserFamilyInfoBean viewUserFamilyInfo) {
                this.viewUserFamilyInfo = viewUserFamilyInfo;
            }
            public List<ListFamilyMemberInfoBean> getListFamilyMemberInfo() {
                return listFamilyMemberInfo;
            }
            public void setListFamilyMemberInfo(List<ListFamilyMemberInfoBean> listFamilyMemberInfo) {
                this.listFamilyMemberInfo = listFamilyMemberInfo;
            }
            public static class ViewSchoolInfoBean {
                private int id;
                private String name;
                private int addrCountyId;
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
                public int getAddrCountyId() {
                    return addrCountyId;
                }
                public void setAddrCountyId(int addrCountyId) {
                    this.addrCountyId = addrCountyId;
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
            }
            public static class UserBaseInfoBeanX {
                private int userId;
                private String userName;
                private String mobilePhone;
                private boolean sex;
                private int role;
                private String nickName;
                private String realName;
                private int headPicId;
                private boolean regFlag;
                private String regTime;
                private String updateTime;
                public int getUserId() {
                    return userId;
                }
                public void setUserId(int userId) {
                    this.userId = userId;
                }
                public String getUserName() {
                    return userName;
                }
                public void setUserName(String userName) {
                    this.userName = userName;
                }
                public String getMobilePhone() {
                    return mobilePhone;
                }
                public void setMobilePhone(String mobilePhone) {
                    this.mobilePhone = mobilePhone;
                }
                public boolean isSex() {
                    return sex;
                }
                public void setSex(boolean sex) {
                    this.sex = sex;
                }
                public int getRole() {
                    return role;
                }
                public void setRole(int role) {
                    this.role = role;
                }
                public String getNickName() {
                    return nickName;
                }
                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }
                public String getRealName() {
                    return realName;
                }
                public void setRealName(String realName) {
                    this.realName = realName;
                }
                public int getHeadPicId() {
                    return headPicId;
                }
                public void setHeadPicId(int headPicId) {
                    this.headPicId = headPicId;
                }
                public boolean isRegFlag() {
                    return regFlag;
                }
                public void setRegFlag(boolean regFlag) {
                    this.regFlag = regFlag;
                }
                public String getRegTime() {
                    return regTime;
                }
                public void setRegTime(String regTime) {
                    this.regTime = regTime;
                }
                public String getUpdateTime() {
                    return updateTime;
                }
                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }
            }
            public static class UserTokenBeanX {
                private int userId;
                private String token;
                private String updateTime;
                public int getUserId() {
                    return userId;
                }
                public void setUserId(int userId) {
                    this.userId = userId;
                }
                public String getToken() {
                    return token;
                }
                public void setToken(String token) {
                    this.token = token;
                }
                public String getUpdateTime() {
                    return updateTime;
                }
                public void setUpdateTime(String updateTime) {
                    this.updateTime = updateTime;
                }
            }
            public static class ViewUserStudentInfoBean {
                private int userId;
                private int classId;
                private int schoolId;
                private String schoolName;
                private int gradeNo;
                private String gradeName;
                private int classNo;
                public int getUserId() {
                    return userId;
                }
                public void setUserId(int userId) {
                    this.userId = userId;
                }
                public int getClassId() {
                    return classId;
                }
                public void setClassId(int classId) {
                    this.classId = classId;
                }
                public int getSchoolId() {
                    return schoolId;
                }
                public void setSchoolId(int schoolId) {
                    this.schoolId = schoolId;
                }
                public String getSchoolName() {
                    return schoolName;
                }
                public void setSchoolName(String schoolName) {
                    this.schoolName = schoolName;
                }
                public int getGradeNo() {
                    return gradeNo;
                }
                public void setGradeNo(int gradeNo) {
                    this.gradeNo = gradeNo;
                }
                public String getGradeName() {
                    return gradeName;
                }
                public void setGradeName(String gradeName) {
                    this.gradeName = gradeName;
                }
                public int getClassNo() {
                    return classNo;
                }
                public void setClassNo(int classNo) {
                    this.classNo = classNo;
                }
            }
            public static class ViewUserFamilyInfoBean {
                private int userId;
                private int familyId;
                private int familyRoleTypeId;
                private String familyRoleTypeName;
                public int getUserId() {
                    return userId;
                }
                public void setUserId(int userId) {
                    this.userId = userId;
                }
                public int getFamilyId() {
                    return familyId;
                }
                public void setFamilyId(int familyId) {
                    this.familyId = familyId;
                }
                public int getFamilyRoleTypeId() {
                    return familyRoleTypeId;
                }
                public void setFamilyRoleTypeId(int familyRoleTypeId) {
                    this.familyRoleTypeId = familyRoleTypeId;
                }
                public String getFamilyRoleTypeName() {
                    return familyRoleTypeName;
                }
                public void setFamilyRoleTypeName(String familyRoleTypeName) {
                    this.familyRoleTypeName = familyRoleTypeName;
                }
            }
            public static class ListFamilyMemberInfoBean {
                private ViewUserSimpleInfoBean viewUserSimpleInfo;
                private ViewUserFamilyInfoBeanX viewUserFamilyInfo;
                public ViewUserSimpleInfoBean getViewUserSimpleInfo() {
                    return viewUserSimpleInfo;
                }
                public void setViewUserSimpleInfo(ViewUserSimpleInfoBean viewUserSimpleInfo) {
                    this.viewUserSimpleInfo = viewUserSimpleInfo;
                }
                public ViewUserFamilyInfoBeanX getViewUserFamilyInfo() {
                    return viewUserFamilyInfo;
                }
                public void setViewUserFamilyInfo(ViewUserFamilyInfoBeanX viewUserFamilyInfo) {
                    this.viewUserFamilyInfo = viewUserFamilyInfo;
                }
                public static class ViewUserSimpleInfoBean {
                    private int userId;
                    private String userName;
                    private String mobilePhone;
                    private int role;
                    private boolean sex;
                    private String nickName;
                    private String realName;
                    private String imAccount;
                    private String headUrl;
                    public int getUserId() {
                        return userId;
                    }
                    public void setUserId(int userId) {
                        this.userId = userId;
                    }
                    public String getUserName() {
                        return userName;
                    }
                    public void setUserName(String userName) {
                        this.userName = userName;
                    }
                    public String getMobilePhone() {
                        return mobilePhone;
                    }
                    public void setMobilePhone(String mobilePhone) {
                        this.mobilePhone = mobilePhone;
                    }
                    public int getRole() {
                        return role;
                    }
                    public void setRole(int role) {
                        this.role = role;
                    }
                    public boolean isSex() {
                        return sex;
                    }
                    public void setSex(boolean sex) {
                        this.sex = sex;
                    }
                    public String getNickName() {
                        return nickName;
                    }
                    public void setNickName(String nickName) {
                        this.nickName = nickName;
                    }
                    public String getRealName() {
                        return realName;
                    }
                    public void setRealName(String realName) {
                        this.realName = realName;
                    }
                    public String getImAccount() {
                        return imAccount;
                    }
                    public void setImAccount(String imAccount) {
                        this.imAccount = imAccount;
                    }
                    public String getHeadUrl() {
                        return headUrl;
                    }
                    public void setHeadUrl(String headUrl) {
                        this.headUrl = headUrl;
                    }
                }
                public static class ViewUserFamilyInfoBeanX {
                    private int userId;
                    private int familyId;
                    private int familyRoleTypeId;
                    private String familyRoleTypeName;
                    public int getUserId() {
                        return userId;
                    }
                    public void setUserId(int userId) {
                        this.userId = userId;
                    }
                    public int getFamilyId() {
                        return familyId;
                    }
                    public void setFamilyId(int familyId) {
                        this.familyId = familyId;
                    }
                    public int getFamilyRoleTypeId() {
                        return familyRoleTypeId;
                    }
                    public void setFamilyRoleTypeId(int familyRoleTypeId) {
                        this.familyRoleTypeId = familyRoleTypeId;
                    }
                    public String getFamilyRoleTypeName() {
                        return familyRoleTypeName;
                    }
                    public void setFamilyRoleTypeName(String familyRoleTypeName) {
                        this.familyRoleTypeName = familyRoleTypeName;
                    }
                }
            }
        }
        public static class ListViewUserTeacherInfoBean {
            private int id;
            private int userId;
            private int classId;
            private int schoolId;
            private String schoolName;
            private int gradeNo;
            private String gradeName;
            private int classNo;
            private int courseId;
            private String courseName;
            private int inviteCode;
            public int getId() {
                return id;
            }
            public void setId(int id) {
                this.id = id;
            }
            public int getUserId() {
                return userId;
            }
            public void setUserId(int userId) {
                this.userId = userId;
            }
            public int getClassId() {
                return classId;
            }
            public void setClassId(int classId) {
                this.classId = classId;
            }
            public int getSchoolId() {
                return schoolId;
            }
            public void setSchoolId(int schoolId) {
                this.schoolId = schoolId;
            }
            public String getSchoolName() {
                return schoolName;
            }
            public void setSchoolName(String schoolName) {
                this.schoolName = schoolName;
            }
            public int getGradeNo() {
                return gradeNo;
            }
            public void setGradeNo(int gradeNo) {
                this.gradeNo = gradeNo;
            }
            public String getGradeName() {
                return gradeName;
            }
            public void setGradeName(String gradeName) {
                this.gradeName = gradeName;
            }
            public int getClassNo() {
                return classNo;
            }
            public void setClassNo(int classNo) {
                this.classNo = classNo;
            }
            public int getCourseId() {
                return courseId;
            }
            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }
            public String getCourseName() {
                return courseName;
            }
            public void setCourseName(String courseName) {
                this.courseName = courseName;
            }
            public int getInviteCode() {
                return inviteCode;
            }
            public void setInviteCode(int inviteCode) {
                this.inviteCode = inviteCode;
            }
        }
    }
    public static class TypeBean {
        private int status;
        public int getStatus() {
            return status;
        }
        public void setStatus(int status) {
            this.status = status;
        }
    }
}
