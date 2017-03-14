package com.cep.entity.huanxin;

import java.util.List;

/**
 * Created by pc on 2016/11/26.
 */
public class ModifyGroupNameRsp {

    /**
     * action : get
     * uri : https://a1.easemob.com/easemob-demo/4d7e4ba0-dc4a-11e3-90d5-e1ffbaacdaf5/chatgroups/1411816013089/users
     * entities : []
     * data : [{"member":"lidis"},{"member":"asdfgh"},{"member":"zhanglin"},{"owner":"ruson"}]
     * timestamp : 1413012431449
     * duration : 24
     */

    private String action;
    private String uri;
    private long timestamp;
    private int duration;
    private List<?> entities;
    private List<DataBean> data;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<?> getEntities() {
        return entities;
    }

    public void setEntities(List<?> entities) {
        this.entities = entities;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * member : lidis
         * owner : ruson
         */

        private String member;
        private String owner;

        public String getMember() {
            return member;
        }

        public void setMember(String member) {
            this.member = member;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }
    }
}
