package com.cn.wanxi.entity.technologysharing;


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
public class TagEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Integer id;
    /**
     * 标签名字
     */
    private String name;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后一次修改时间
     */
    private Date lastUpdateTime;
    /**
     * 标签的状态
     */
    private Integer status;
    /**
     * 引用该标签的次数
     */
    private Integer quote;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public Integer getQuote() {
        return quote;
    }

    public void setQuote(Integer quote) {
        this.quote = quote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TagEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", status=" + status +
                ", quote=" + quote +
                '}';
    }
}
