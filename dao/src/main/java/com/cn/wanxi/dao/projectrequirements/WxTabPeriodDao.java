package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabPeriodEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface WxTabPeriodDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabPeriodEntity record);

    int insertSelective(WxTabPeriodEntity record);

    WxTabPeriodEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabPeriodEntity record);

    int updateByPrimaryKey(WxTabPeriodEntity record);
}