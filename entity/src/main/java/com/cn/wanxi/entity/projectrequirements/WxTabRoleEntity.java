package com.cn.wanxi.entity.projectrequirements;

import lombok.Data;

import java.io.Serializable;

/**
 * wx_tab_role
 *
 * @author
 */
@Data
public class WxTabRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    /**
     * 备注(团队管理员,队长,开发,审核,测试)
     */
    private String name;
    /**
     * 暂不详,待考究
     */
    private String authority;
}