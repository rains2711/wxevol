package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * wx_tab_project
 *
 * @author
 */
@Data
public class WxTabProjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 项目编号
     */
    private Integer id;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 所属团队编号
     */
    private Long teamId;
    /**
     * 项目创建日期
     */
    private Date createTime;
    /**
     * 修改日期
     */
    private Date updateTime;
    /**
     * 启动日期
     */
    private Date startTime;
    /**
     * 备注(单位:元)
     */
    private BigDecimal startCapital;
    /**
     * (0:关闭,1:待启动,2进行中,3已完毕)
     */
    private Byte status;
    /**
     * 项目介绍
     */
    private String description;
}