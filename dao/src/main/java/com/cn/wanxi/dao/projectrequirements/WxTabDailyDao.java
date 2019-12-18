package com.cn.wanxi.dao.projectrequirements;


import com.cn.wanxi.entity.projectrequirements.tables.WxTabDailyEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WxTabDailyDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabDailyEntity record);

    int insertSelective(WxTabDailyEntity record);

    WxTabDailyEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabDailyEntity record);

    int updateByPrimaryKeyWithBLOBs(WxTabDailyEntity record);

    int updateByPrimaryKey(WxTabDailyEntity record);
}