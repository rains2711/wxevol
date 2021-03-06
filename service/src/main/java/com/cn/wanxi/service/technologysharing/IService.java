package com.cn.wanxi.service.technologysharing;

import com.cn.wanxi.entity.technologysharing.BlogCommentEntity;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @author: LiRui
 * @Date: 2019/12/13
 * @Time: 16:31
 */
public interface IService<T> {
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
     * 通过条件查询
     * @param entity
     * @return
     */
    List<T> findByWrapper(T entity);
    /**
     * 分页接口
     *
     * @param entities
     * @param page
     * @param size
     * @return
     */
    public List<BlogCommentEntity> findPage(List<BlogCommentEntity> entities, Integer page, Integer size);
    /**
     * 查询全部
     * @return
     */
    List<T> findAll();
}
