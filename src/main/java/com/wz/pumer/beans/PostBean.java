package com.wz.pumer.beans;

/**
 * @author: wangzhen
 * @date:   2017/10/19
 * @description: 帖子实体类
*/
public class PostBean extends BaseBean{

    private int id;
    private String title;
    private String content;
    private int authorId;
    private int browseNum;
    private int likesNum;
    private int themeId;
    private int hotLevelId;
    private int crateTime;
    private int liveTypeId;
    private String backgroundUrl;

    public PostBean( String title, String content, int authorId, int browseNum, int likesNum, int themeId, int hotLevelId, int crateTime, int liveTypeId, String backgroundUrl) {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.browseNum = browseNum;
        this.likesNum = likesNum;
        this.themeId = themeId;
        this.hotLevelId = hotLevelId;
        this.crateTime = crateTime;
        this.liveTypeId = liveTypeId;
        this.backgroundUrl = backgroundUrl;
    }

    public PostBean(int id, String title, String content, int authorId, int browseNum, int likesNum, int themeId, int hotLevelId, int crateTime, int liveTypeId, String backgroundUrl) {
        this.id=id;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.browseNum = browseNum;
        this.likesNum = likesNum;
        this.themeId = themeId;
        this.hotLevelId = hotLevelId;
        this.crateTime = crateTime;
        this.liveTypeId = liveTypeId;
        this.backgroundUrl = backgroundUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(int browseNum) {
        this.browseNum = browseNum;
    }

    public int getLikesNum() {
        return likesNum;
    }

    public void setLikesNum(int likesNum) {
        this.likesNum = likesNum;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public int getHotLevelId() {
        return hotLevelId;
    }

    public void setHotLevelId(int hotLevelId) {
        this.hotLevelId = hotLevelId;
    }

    public int getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(int crateTime) {
        this.crateTime = crateTime;
    }

    public int getLiveTypeId() {
        return liveTypeId;
    }

    public void setLiveTypeId(int liveTypeId) {
        this.liveTypeId = liveTypeId;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    @Override
    public String toString() {
        return "PostBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authorId=" + authorId +
                ", browseNum=" + browseNum +
                ", likesNum=" + likesNum +
                ", themeId=" + themeId +
                ", hotLevelId=" + hotLevelId +
                ", crateTime=" + crateTime +
                ", liveTypeId=" + liveTypeId +
                ", backgroundUrl='" + backgroundUrl + '\'' +
                '}';
    }
}
