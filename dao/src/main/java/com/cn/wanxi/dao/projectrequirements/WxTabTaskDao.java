package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.tables.WxTabTaskEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabTaskDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabTaskEntity record);

    int insertSelective(WxTabTaskEntity record);

    WxTabTaskEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabTaskEntity record);

    int updateByPrimaryKey(WxTabTaskEntity record);
}