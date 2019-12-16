package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabProjectEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabProjectDao {
    int deleteByPrimaryKey(Integer id);

    int insert(WxTabProjectEntity record);

    int insertSelective(WxTabProjectEntity record);

    WxTabProjectEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxTabProjectEntity record);

    int updateByPrimaryKeyWithBLOBs(WxTabProjectEntity record);

    int updateByPrimaryKey(WxTabProjectEntity record);
}