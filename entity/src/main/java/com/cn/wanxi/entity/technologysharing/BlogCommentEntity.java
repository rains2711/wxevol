package com.cn.wanxi.entity.technologysharing;

//import com.baomidou.mybatisplus.annotations.TableId;
//import com.baomidou.mybatisplus.annotations.TableName;
//import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiRui
 * @since 2019-12-13
 */
//@TableName("wx_tab_blog_comment")
public class BlogCommentEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博客的评论id
     */
//    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 评论人的id
     */
    private Integer uId;
    /**
     * 博客的id
     */
    private Integer blogId;
    /**
     * 评论内容
     */
    private String comment;
    /**
     * 评论的时间
     */
    private Date createTime;
    /**
     * 评论的状态
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BlogComment{" +
        ", id=" + id +
        ", uId=" + uId +
        ", blogId=" + blogId +
        ", comment=" + comment +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
