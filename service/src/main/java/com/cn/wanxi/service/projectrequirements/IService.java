package com.cn.wanxi.service.projectrequirements;

/**
 * @author luoyuequan
 * @time 2019/12/20 10:24
 */
public interface IService<Entity> {

    /**
     * 添加
     *
     * @param entity 实体
     * @return 影响行数
     */
    int insert(Entity entity);

    /**
     * 删除
     *
     * @param entity 实体
     * @return 影响行数
     */
    int delete(Entity entity);

    /**
     * 根据主键 查询
     *
     * @param entity 实体
     * @return 查询实体
     */
    Entity findById(Entity entity);

    /**
     * 修改
     *
     * @param entity 实体
     * @return 影响行数
     */
    int update(Entity entity);
}
