package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.tables.WxTabMemberEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WxTabMemberDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabMemberEntity record);

    int insertSelective(WxTabMemberEntity record);

    WxTabMemberEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabMemberEntity record);

    int updateByPrimaryKey(WxTabMemberEntity record);
}