package com.cn.wanxi.dao.projectrequirements;

import java.io.Serializable;

/**
 * DAO公共基类，由MybatisGenerator自动生成请勿修改
 *
 * @param <Entity> The Entity Class 这里是泛型不是Model类
 * @param <PK>     The Primary Key Class 如果是无主键，则可以用Model来跳过，如果是多主键则是Key类
 * @author MybatisGenerator
 */
public interface MyBatisBaseDao<Entity, PK extends Serializable> {
    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param id 主键ID
     * @return int
     */
    int deleteByPrimaryKey(PK id);

    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int insert(Entity entity);

    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int insertSelective(Entity entity);

    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id 主键ID
     * @return T
     */
    Entity selectByPrimaryKey(PK id);

    /**
     * <p>
     * 根据 ID 修改
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int updateByPrimaryKeySelective(Entity entity);

    /**
     * <p>
     * 根据 ID 修改
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(Entity entity);

    /**
     * <p>
     * 根据 ID 修改
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int updateByPrimaryKey(Entity entity);
}