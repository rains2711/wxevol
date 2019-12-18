package com.cn.wanxi.entity.projectrequirements.views;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * team_has_member
 *
 * @author
 */
@Data
public class TeamHasMemberEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 团队编号
     */
    private Long teamId;
    /**
     * 团队名称
     */
    private String teamName;
    /**
     * 创建日期
     */
    private Date teamCreateTime;
    /**
     * 修改日期
     */
    private Date teamUpdateTime;
    /**
     * 上级团队编号,(0表示无上级)
     */
    private Long superiorTeamId;
    /**
     * 工作日
     */
    private Byte workDay;
    /**
     * 团队状态 备注(1:正常,0:关闭)
     */
    private Byte teamStatus;
    /**
     * 成员编号
     */
    private Long memberId;
    /**
     * 成员名字
     */
    private String memberName;
    /**
     * 创建日期
     */
    private Date memberCreateTime;
    /**
     * 修改日期
     */
    private Date memberUpdateTime;
    /**
     * 成员状态 备注(1:正常,0:删除,2:暂休)
     */
    private Byte memberStatus;
    /**
     * 角色编号
     */
    private Integer roleId;
    /**
     * 备注(团队管理员,队长,开发,审核,测试)
     */
    private String roleName;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 暂不详,待考究
     */
    private String roleAuthority;
    /**
     * 用户账号
     */
    private String account;
}