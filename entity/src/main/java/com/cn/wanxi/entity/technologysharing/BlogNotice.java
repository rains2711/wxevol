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
//@TableName("wx_tab_blog_notice")
public class BlogNotice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 消息提醒的id
     */
//    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 关注者的id
     */
    private Integer slaveId;
    /**
     * 被关注的id
     */
    private Integer masterId;
    /**
     * 消息提醒的时间
     */
    private Date time;
    /**
     * 是否查看，0为未查看，查看后删除该行
     */
    private Integer isLook;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(Integer slaveId) {
        this.slaveId = slaveId;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getIsLook() {
        return isLook;
    }

    public void setIsLook(Integer isLook) {
        this.isLook = isLook;
    }

    @Override
    public String toString() {
        return "BlogNotice{" +
        ", id=" + id +
        ", slaveId=" + slaveId +
        ", masterId=" + masterId +
        ", time=" + time +
        ", isLook=" + isLook +
        "}";
    }
}
