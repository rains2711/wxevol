package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * wx_tab_weekly_report
 *
 * @author
 */
@Data
public class WxTabWeeklyReportEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 周报编号
     */
    private Long id;
    /**
     * 周报提交日期
     */
    private Date commitTime;
    /**
     * 提交成员编号
     */
    private Long commitMemberId;
    /**
     * 修改日期
     */
    private Date updateTime;
    /**
     * 备注(0删除,1正常)
     */
    private Byte status;
    /**
     * 所属项目周期编号
     */
    private Long periodId;
    /**
     * 周报内容
     */
    private String content;
}