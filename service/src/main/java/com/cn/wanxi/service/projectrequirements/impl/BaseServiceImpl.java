package com.cn.wanxi.service.projectrequirements.impl;

import com.cn.wanxi.dao.projectrequirements.MyBatisBaseDao;
import com.cn.wanxi.service.projectrequirements.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luoyuequan
 * @time 2019/12/21 13:11
 */
public class BaseServiceImpl<Dao extends MyBatisBaseDao<Entity>, Entity> implements IService<Entity> {

    @Autowired
    Dao baseDao;

    /**
     * 添加
     *
     * @param entity 实体
     * @return 影响行数
     */
    public int insert(Entity entity) {
        return baseDao.insertSelective(entity);
    }

    /**
     * 删除
     *
     * @param entity 实体
     * @return 影响行数
     */
    public int delete(Entity entity) {
        return baseDao.deleteByPrimaryKey(entity);
    }

    /**
     * 根据主键 查询
     *
     * @param entity 实体
     * @return 查询实体
     */
    public Entity findById(Entity entity) {
        return (Entity) baseDao.selectByPrimaryKey(entity);
    }

    /**
     * 修改
     *
     * @param entity 实体
     * @return 影响行数
     */
    public int update(Entity entity) {
        return baseDao.updateByPrimaryKeySelective(entity);
    }
}
