package com.cn.wanxi.service.technologysharing.impl;

import com.cn.wanxi.dao.technologysharing.BlogNoticeMapper;
import com.cn.wanxi.entity.technologysharing.BlogCommentEntity;
import com.cn.wanxi.entity.technologysharing.BlogNoticeEntity;
import com.cn.wanxi.service.technologysharing.IBlogNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LiRui
 * @since 2019-12-13
 */
@Service
public class IBlogNoticeServiceImpl implements IBlogNoticeService {

    @Autowired
    private BlogNoticeMapper bnm;

    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param entity 实体对象
     * @return int
     */
    @Override
    public Integer insert(BlogNoticeEntity entity) {
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
    public Integer updateById(BlogNoticeEntity entity) {
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
    public BlogNoticeEntity selectById(Serializable id) {
        return null;
    }
    /**
     * 通过条件查询
     *
     * @param entity
     * @return
     */
    @Override
    public List<BlogNoticeEntity> findByWrapper(BlogNoticeEntity entity) {
        return null;
    }

    /**
     * 分页接口
     *
     * @param entities
     * @param page
     * @param size
     * @return
     */
    @Override
    public List<BlogCommentEntity> findPage(List<BlogCommentEntity> entities, Integer page, Integer size) {
        return null;
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<BlogNoticeEntity> findAll() {
        return null;
    }
}
