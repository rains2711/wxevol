package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabWeeklyReportEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabWeeklyReportDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabWeeklyReportEntity record);

    int insertSelective(WxTabWeeklyReportEntity record);

    WxTabWeeklyReportEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabWeeklyReportEntity record);

    int updateByPrimaryKeyWithBLOBs(WxTabWeeklyReportEntity record);

    int updateByPrimaryKey(WxTabWeeklyReportEntity record);
}