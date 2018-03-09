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
    private int followNum;
    private int vipLevel;
    private int crateTime;
    private int liveType;
    private int headImageUrl;


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

    public int getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(int headImageUrl) {
        this.headImageUrl = headImageUrl;
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
