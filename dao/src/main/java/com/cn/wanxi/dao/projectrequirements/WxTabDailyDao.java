package com.cn.wanxi.dao.projectrequirements;


import com.cn.wanxi.entity.projectrequirements.tables.WxTabDailyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabDailyDao extends MyBatisBaseDao<WxTabDailyEntity> {

}