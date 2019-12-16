package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabTeamEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabTeamDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabTeamEntity record);

    int insertSelective(WxTabTeamEntity record);

    WxTabTeamEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabTeamEntity record);

    int updateByPrimaryKey(WxTabTeamEntity record);
}