package com.wz.pumer.beans;

/**
 * @author: wangzhen
 * @date:   2017/10/19
 * @description: 评论实体类
 */
public class CommentBean extends BaseBean{

    private int id;
    //发表评论的用户
    private int ownerUserId;
    // 评论的目标用户
    private int targetUserId;
    //评论内容
    private int content;
    //该评论被点赞的数量
    private int likeCount;
    //创建时间
    private int createTime;
    //评论的目标
    private int parentId;
    //评论的目标类型
    private int parentType;

    public CommentBean(int id, int ownerUserId, int targetUserId, int content, int likeCount, int createTime, int parentId, int parentType) {
        this.id = id;
        this.ownerUserId = ownerUserId;
        this.targetUserId = targetUserId;
        this.content = content;
        this.likeCount = likeCount;
        this.createTime = createTime;
        this.parentId = parentId;
        this.parentType = parentType;
    }

    public CommentBean( int ownerUserId, int targetUserId, int content, int likeCount, int createTime, int parentId, int parentType) {
        this.ownerUserId = ownerUserId;
        this.targetUserId = targetUserId;
        this.content = content;
        this.likeCount = likeCount;
        this.createTime = createTime;
        this.parentId = parentId;
        this.parentType = parentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(int ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public int getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(int targetUserId) {
        this.targetUserId = targetUserId;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getParentType() {
        return parentType;
    }

    public void setParentType(int parentType) {
        this.parentType = parentType;
    }

    @Override
    public String toString() {
        return "CommentBean{" +
                "id=" + id +
                ", ownerUserId=" + ownerUserId +
                ", targetUserId=" + targetUserId +
                ", content=" + content +
                ", likeCount=" + likeCount +
                ", createTime=" + createTime +
                ", parentId=" + parentId +
                ", parentType=" + parentType +
                '}';
    }
}
