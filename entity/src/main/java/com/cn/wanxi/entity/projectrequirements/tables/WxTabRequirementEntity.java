package com.cn.wanxi.entity.projectrequirements.tables;

import lombok.Data;

import java.io.Serializable;

/**
 * wx_tab_requirement
 *
 * @author
 */
@Data
public class WxTabRequirementEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 需求编号
     */
    private Long id;
    /**
     * 需求优先级,备注(0>1>2>3=紧急重要,紧急,重要,普通)
     */
    private Byte priority;
    /**
     * 父级需求编号
     */
    private Long requirementId;
    /**
     * 所属任务单编号
     */
    private Long taskId;
    /**
     * 需求所属项目编号
     */
    private Long projectId;
    /**
     * 需求创建时间
     */
    private Long createTime;
    /**
     * 修改时间
     */
    private Long updateTime;
    /**
     * 需求优先级,备注(1>2>3>4>5=最高,较高,普通,较低,最低)
     */
    private Byte status;
    /**
     * 需求介绍
     */
    private String description;
}