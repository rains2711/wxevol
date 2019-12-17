package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * wx_tab_daily
 *
 * @author
 */
@Data
public class WxTabDailyEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 日报编号
     */
    private Long id;
    /**
     * 报提交日期
     */
    private Date commitTime;
    /**
     * 提交成员编号
     */
    private WxTabMemberEntity commitMember;
    /**
     * 修改日期
     */
    private Date updateTime;
    /**
     * 日报状态,备注(0删除,1正常)
     */
    private Byte status;
    /**
     * 所属项目周期编号
     */
    private WxTabPeriodEntity period;
    /**
     * 日报内容
     */
    private String content;
}