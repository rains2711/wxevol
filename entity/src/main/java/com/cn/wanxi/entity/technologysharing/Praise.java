package com.cn.wanxi.entity.technologysharing;

//import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiRui
 * @since 2019-12-13
 */
//@TableName("wx_tab_praise")
public class Praise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 点赞的用户id
     */
    private Integer uId;
    /**
     * 博客的id
     */
    private Integer blogId;


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

    @Override
    public String toString() {
        return "Praise{" +
        ", uId=" + uId +
        ", blogId=" + blogId +
        "}";
    }
}
