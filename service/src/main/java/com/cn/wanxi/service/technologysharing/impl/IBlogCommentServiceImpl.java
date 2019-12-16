package com.cn.wanxi.service.technologysharing.impl;

import com.cn.wanxi.entity.technologysharing.BlogCommentEntity;
import com.cn.wanxi.service.technologysharing.IBlogCommentService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiRui
 * @since 2019-12-13
 */
@Service
public class IBlogCommentServiceImpl implements IBlogCommentService {


    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    @Override
    public Integer insert(BlogCommentEntity entity) {
        return null;
    }

    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param id 主键ID
     * @return int
     */
    @Override
    public Integer deleteById(Serializable id) {
        return null;
    }

    /**
     * <p>
     * 根据 ID 修改
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    @Override
    public Integer updateById(BlogCommentEntity entity) {
        return null;
    }

    /**
     * <p>
     * 根据 ID 查询
     * </p>
     *
     * @param id 主键ID
     * @return T
     */
    @Override
    public BlogCommentEntity selectById(Serializable id) {
        return null;
    }

    /**
     * 分页接口
     *
     * @param map
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<BlogCommentEntity> findPage(Map<String, Object> map, Integer page, Integer size) {
        return null;
    }
}
