package com.cep.protocol.huanxin;
import java.util.List;

/**
 * Created by pc on 2016/11/26.
 */
public class RemoveMemberReq {
    private String groupId;
    private List<String> memberList;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<String> memberList) {
        this.memberList = memberList;
    }
}
