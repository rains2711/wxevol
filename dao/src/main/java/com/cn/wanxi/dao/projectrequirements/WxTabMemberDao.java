package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.tables.WxTabMemberEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WxTabMemberDao extends MyBatisBaseDao<WxTabMemberEntity, Long> {
}