package com.cn.wanxi.dao.technologysharing;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @author: LiRui
 * @Date: 2019/12/13
 * @Time: 16:34
 */
public interface BaseMapper<T> {

    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    Integer insert(T entity);
    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param id 主键ID
     * @return int
     */
    Integer deleteById(Serializable id);
    /**
     * <p>
     * 根据 ID 修改
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    Integer updateById(@Param("et") T entity);
    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id 主键ID
     * @return T
     */
    T selectById(Serializable id);
    /**
     * 分页接口
     *
     * @param entities
     * @param page
     * @param size
     * @return
     */
    List<T> findPage(List<T> entities, Integer page, Integer size);

    /**
     * 通过条件查询
     * @param entity
     * @return
     */
    List<T> findByWrapper(T entity);
    /**
     * 查询全部
     * @return
     */
    List<T> findAll();
}
