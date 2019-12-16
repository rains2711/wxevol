package com.cn.wanxi.dao.projectrequirements;

import com.cn.wanxi.entity.projectrequirements.WxTabRequirementEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface WxTabRequirementDao {
    int deleteByPrimaryKey(Long id);

    int insert(WxTabRequirementEntity record);

    int insertSelective(WxTabRequirementEntity record);

    WxTabRequirementEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxTabRequirementEntity record);

    int updateByPrimaryKeyWithBLOBs(WxTabRequirementEntity record);

    int updateByPrimaryKey(WxTabRequirementEntity record);
}