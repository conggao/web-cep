package com.cep.entity.json;

import java.util.List;

/**
 * Created by pc on 2016/12/19.
 */
public class MyResCopyReq {
        private Long desId;
        private List<Long> dirList;
        private List<Long> resList;
        public Long getDesId() {
            return desId;
        }
        public void setDesId(Long desId) {
            this.desId = desId;
        }
        public List<Long> getDirList() {
            return dirList;
        }
        public void setDirList(List<Long> dirList) {
            this.dirList = dirList;
        }
        public List<Long> getResList() {
            return resList;
        }
        public void setResList(List<Long> resList) {
            this.resList = resList;
        }

    }
