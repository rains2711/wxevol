package com.cn.wanxi.entity.projectrequirements.tables;

import lombok.Data;

import java.io.Serializable;

/**
 * wx_tab_team
 *
 * @author
 */
@Data
public class WxTabTeamEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 团队编号
     */
    private Long id;
    /**
     * 团队名称
     */
    private String name;
    /**
     * 创建日期
     */
    private Long createTime;
    /**
     * 修改日期
     */
    private Long updateTime;
    /**
     * 上级团队编号
     */
    private Long superiorTeamId;
    /**
     * 工作日
     */
    private Byte workDay;
    /**
     * 团队状态 备注(1:正常,0:关闭)
     */
    private Byte status;

}