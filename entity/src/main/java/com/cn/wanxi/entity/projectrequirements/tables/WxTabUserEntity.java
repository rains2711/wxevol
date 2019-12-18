package com.cn.wanxi.entity.projectrequirements.tables;

import lombok.Data;

import java.io.Serializable;

/**
 * wx_tab_user
 *
 * @author
 */
@Data
public class WxTabUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户编号
     */
    private Long id;
    /**
     * 用户账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
}