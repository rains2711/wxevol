package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabRoleEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WxTabRoleEntity record);

    int insertSelective(WxTabRoleEntity record);

    WxTabRoleEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxTabRoleEntity record);

    int updateByPrimaryKey(WxTabRoleEntity record);
}