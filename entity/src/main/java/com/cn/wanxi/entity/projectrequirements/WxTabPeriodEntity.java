package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;

/**
 * wx_tab_period
 *
 * @author
 */
@Data
public class WxTabPeriodEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 项目周期编号
     */
    private Long id;
    /**
     * 项目编号
     */
    private Long projectId;
    /**
     * 备注(0~100,根据所有任务进度计算得出,非手动输入)
     */
    private Byte projectProgress;
}