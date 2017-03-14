package com.cep.protocol.news;
import java.sql.Timestamp;
public class ViewNewsBaseInfo {
    private long id;
    private int schoolId;
    private int type;
    private String typeName;
    private Long classId;
    private String title;
    private String content;
    private long createUserId;
    private Timestamp createTime;
    private Timestamp lastUpdateTime;
    private int praiseNum;
    private int commentNum;
    private boolean isDel;
    private String createUserName;
    private String createUserRealName;
    private String createUserHeadUrl;

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    
    
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    
    
    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    
    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    
    
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    
    
    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    
    
    public int getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(int praiseNum) {
        this.praiseNum = praiseNum;
    }

    
    
    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    
    
    public boolean isDel() {
        return isDel;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    
    
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    
    
    public String getCreateUserRealName() {
        return createUserRealName;
    }

    public void setCreateUserRealName(String createUserRealName) {
        this.createUserRealName = createUserRealName;
    }

    
    
    public String getCreateUserHeadUrl() {
        return createUserHeadUrl;
    }

    public void setCreateUserHeadUrl(String createUserHeadUrl) {
        this.createUserHeadUrl = createUserHeadUrl;
    }

    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewNewsBaseInfo that = (ViewNewsBaseInfo) o;

        if (id != that.id) return false;
        if (schoolId != that.schoolId) return false;
        if (type != that.type) return false;
        if (createUserId != that.createUserId) return false;
        if (praiseNum != that.praiseNum) return false;
        if (commentNum != that.commentNum) return false;
        if (isDel != that.isDel) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;
        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (lastUpdateTime != null ? !lastUpdateTime.equals(that.lastUpdateTime) : that.lastUpdateTime != null)
            return false;
        if (createUserName != null ? !createUserName.equals(that.createUserName) : that.createUserName != null)
            return false;
        if (createUserRealName != null ? !createUserRealName.equals(that.createUserRealName) : that.createUserRealName != null)
            return false;
        if (createUserHeadUrl != null ? !createUserHeadUrl.equals(that.createUserHeadUrl) : that.createUserHeadUrl != null)
            return false;

        return true;
    }

    
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + schoolId;
        result = 31 * result + type;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (classId != null ? classId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastUpdateTime != null ? lastUpdateTime.hashCode() : 0);
        result = 31 * result + praiseNum;
        result = 31 * result + commentNum;
        result = 31 * result + (isDel ? 1 : 0);
        result = 31 * result + (createUserName != null ? createUserName.hashCode() : 0);
        result = 31 * result + (createUserRealName != null ? createUserRealName.hashCode() : 0);
        result = 31 * result + (createUserHeadUrl != null ? createUserHeadUrl.hashCode() : 0);
        return result;
    }
}
