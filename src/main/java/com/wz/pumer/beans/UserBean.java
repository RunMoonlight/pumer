package com.wz.pumer.beans;

/**
 * @author: wangzhen
 * @date:   2017/10/19
 * @description: 用户实体类
*/
public class UserBean extends BaseBean{
    private int id;
    private String name;
    private String nickname;
    private String email;
    private String password;
    private int followNum;
    private int vipLevel;
    private int crateTime;
    private int liveType;
    private String headImageUrl;

    public UserBean(){

    }
    public UserBean(String name, String nickname, String email, String password, int followNum, int vipLevel, int crateTime, int liveType, String headImageUrl) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.followNum = followNum;
        this.vipLevel = vipLevel;
        this.crateTime = crateTime;
        this.liveType = liveType;
        this.headImageUrl = headImageUrl;
    }

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFollowNum() {
        return followNum;
    }

    public void setFollowNum(int followNum) {
        this.followNum = followNum;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public int getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(int crateTime) {
        this.crateTime = crateTime;
    }

    public int getLiveType() {
        return liveType;
    }

    public void setLiveType(int liveType) {
        this.liveType = liveType;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", followNum=" + followNum +
                ", vipLevel=" + vipLevel +
                ", crateTime=" + crateTime +
                ", liveType=" + liveType +
                ", headImageUrl=" + headImageUrl +
                '}';
    }
}
