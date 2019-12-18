package com.cn.wanxi.entity.projectrequirements.views;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * member_role_user
 *
 * @author
 */
@Data
public class MemberRoleUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 成员编号
     */
    private Long memberId;
    /**
     * 成员名字
     */
    private String memberName;
    /**
     * 所属团队编号
     */
    private Long teamId;
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