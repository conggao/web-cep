package com.cep.protocol.news;
import java.sql.Timestamp;
public class ViewNewsPraiseInfo {
    private long id;
    private long newsId;
    private long createUserId;
    private Timestamp createTime;
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

    
    
    public long getNewsId() {
        return newsId;
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
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

        ViewNewsPraiseInfo that = (ViewNewsPraiseInfo) o;

        if (id != that.id) return false;
        if (newsId != that.newsId) return false;
        if (createUserId != that.createUserId) return false;
        if (isDel != that.isDel) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
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
        result = 31 * result + (int) (newsId ^ (newsId >>> 32));
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isDel ? 1 : 0);
        result = 31 * result + (createUserName != null ? createUserName.hashCode() : 0);
        result = 31 * result + (createUserRealName != null ? createUserRealName.hashCode() : 0);
        result = 31 * result + (createUserHeadUrl != null ? createUserHeadUrl.hashCode() : 0);
        return result;
    }
}
