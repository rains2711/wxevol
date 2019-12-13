package com.cn.wanxi.service.technologysharing.impl;

import com.cn.wanxi.service.technologysharing.CareService;
import org.springframework.stereotype.Service;

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
public class CareServiceImpl implements CareService {

    /**
     * 分页接口
     *
     * @param map
     * @param page
     * @param size
     * @return
     */
    @Override
    public Map<String, Object> findPage(Map<String, Object> map, Integer page, Integer size) {
        return null;
    }

    /**
     * 新增
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> add(Map<String, Object> map) {
        return null;
    }

    /**
     * 修改接口
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> update(Map<String, Object> map) {
        return null;
    }

    /**
     * 删除接口
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> delete(Map<String, Object> map) {
        return null;
    }

    /**
     * 根据ID查找对象
     *
     * @param map
     * @return
     */
    @Override
    public Map<String, Object> findById(Map<String, Object> map) {
        return null;
    }
}
