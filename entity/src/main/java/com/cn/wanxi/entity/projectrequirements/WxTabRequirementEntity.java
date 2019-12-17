package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 需求状态:备注(0:取消,1:待分配,2:已分配)此处分配为归档于任务单
     */
    private Byte status;
    /**
     * 需求介绍
     */
    private String description;
}