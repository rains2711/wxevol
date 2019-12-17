package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * wx_tab_task
 *
 * @author
 */
@Data
public class WxTabTaskEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 任务单编号
     */
    private Long id;
    /**
     * 任务工时
     */
    private Byte workHour;
    /**
     * 任务优先级 备注(0>1>2>3=紧急重要,紧急,重要,普通)
     */
    private Byte priority;
    /**
     * 父级任务编号
     */
    private WxTabTaskEntity task;
    /**
     * 任务所属成员编号
     */
    private WxTabMemberEntity member;
    /**
     * 任务所属项目编号
     */
    private WxTabProjectEntity project;
    /**
     * 任务进度.备注(0~100,进度计算得出,非手动输入)
     */
    private Byte progress;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 备注(0:取消,1:待分配,2:未完成,3:已完成)此处分配为工作人员指定
     */
    private Byte status;
}