package com.cn.wanxi.dao.projectrequirements;

/**
 * DAO公共基类，由MybatisGenerator自动生成请勿修改
 *
 * @param <Entity> The Entity Class 这里是泛型不是Model类
 * @author MybatisGenerator
 */
public interface MyBatisBaseDao<Entity> {
    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int deleteByPrimaryKey(Entity entity);

    /**
     * <p>
     * 全字段插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
//    int insert(Entity entity);

    /**
     * <p>
     * 字段动态插入一条记录
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
     * @param entity 实体对象
     * @return T
     */
    Entity selectByPrimaryKey(Entity entity);

    /**
     * <p>
     * 根据 ID 字段动态修改
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    int updateByPrimaryKeySelective(Entity entity);

    /**
     * <p>
     * 根据 ID 修改全部字段
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
//    int updateByPrimaryKeyWithBLOBs(Entity entity);

    /**
     * <p>
     * 根据 ID 修改部分字段 不包含大内容字段
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
//    int updateByPrimaryKey(Entity entity);
}