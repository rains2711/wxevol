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
//@TableName("wx_tab_blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 博客id
     */
//    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 博客标题
     */
    private String title;
    /**
     * 博客内容的html地址
     */
    private String content;
    /**
     * 博客作者名字
     */
    private String author;
    /**
     * 作者id
     */
    private Integer uId;
    /**
     * 博客地址
     */
    private String url;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后的修改时间
     */
    private Date lastUpdateTime;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 该博客的点赞总数
     */
    private Integer praiseCount;
    /**
     * 博客简述
     */
    private String desc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Blog{" +
        ", id=" + id +
        ", title=" + title +
        ", content=" + content +
        ", author=" + author +
        ", uId=" + uId +
        ", url=" + url +
        ", createTime=" + createTime +
        ", lastUpdateTime=" + lastUpdateTime +
        ", status=" + status +
        ", praiseCount=" + praiseCount +
        ", desc=" + desc +
        "}";
    }
}
