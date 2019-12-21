package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.tables.WxTabTeamEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabTeamDao extends MyBatisBaseDao<WxTabTeamEntity> {

}