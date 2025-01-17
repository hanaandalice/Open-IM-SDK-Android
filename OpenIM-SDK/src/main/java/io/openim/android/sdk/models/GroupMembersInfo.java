package io.openim.android.sdk.models;

public class GroupMembersInfo {
    /**
     * 群id
     */
    private String groupID;
    /**
     * 用户id
     */
    private String userID;
    /**
     * 群内昵称
     */
    private String nickName;
    /**
     * 头像
     */
    private String faceURL;
    /**
     * 群角色
     */
    private int roleLevel;
    /**
     * 入群时间
     */
    private long joinTime;

    private int joinSource;
    private String operatorUserID;
    private String ext;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFaceURL() {
        return faceURL;
    }

    public void setFaceURL(String faceURL) {
        this.faceURL = faceURL;
    }

    public int getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(int roleLevel) {
        this.roleLevel = roleLevel;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(long joinTime) {
        this.joinTime = joinTime;
    }

    public int getJoinSource() {
        return joinSource;
    }

    public void setJoinSource(int joinSource) {
        this.joinSource = joinSource;
    }

    public String getOperatorUserID() {
        return operatorUserID;
    }

    public void setOperatorUserID(String operatorUserID) {
        this.operatorUserID = operatorUserID;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }
}
