package com.cn.wanxi.entity.technologysharing;

//import com.baomidou.mybatisplus.annotations.TableId;
//import com.baomidou.mybatisplus.annotations.TableName;
//import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiRui
 * @since 2019-12-13
 */
//@TableName("wx_tab_care")
public class Care implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关注的id
     */
//    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 关注的用户id
     */
    private Integer slaveId;
    /**
     * 被关注者的用户id
     */
    private Integer masterId;


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

    @Override
    public String toString() {
        return "Care{" +
        ", id=" + id +
        ", slaveId=" + slaveId +
        ", masterId=" + masterId +
        "}";
    }
}
