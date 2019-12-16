package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabUserEntity record);

    int insertSelective(WxTabUserEntity record);

    WxTabUserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabUserEntity record);

    int updateByPrimaryKey(WxTabUserEntity record);
}