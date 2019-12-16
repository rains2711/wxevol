package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * wx_tab_member
 *
 * @author
 */
@Data
public class WxTabMemberEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 成员编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 成员名字
     */
    private String name;
    /**
     * 角色编号
     */
    private Integer roleId;
    /**
     * 所属团队编号
     */
    private Long teamId;
    /**
     * 创建日期
     */
    private Date createTime;
    /**
     * 修改日期
     */
    private Date updateTime;
    /**
     * 成员状态 备注(1:正常,0:删除,2:暂休)
     */
    private Byte status;
}