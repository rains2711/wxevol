package com.cn.wanxi.common;

import java.util.Map;

public interface IService {
    /**
     * 分页接口
     *
     * @param map
     * @param page
     * @param size
     * @return
     */
    Map<String, Object> findPage(Map<String, Object> map, Integer page, Integer size);

    /**
     * 新增
     *
     * @param map
     * @return
     */
    Map<String, Object> add(Map<String, Object> map);

    /**
     * 修改接口
     *
     * @param map
     * @return
     */
    Map<String, Object> update(Map<String, Object> map);

    /**
     * 删除接口
     *
     * @param map
     * @return
     */
    Map<String, Object> delete(Map<String, Object> map);

    /**
     * 根据ID查找对象
     *
     * @param map
     * @return
     */
    Map<String, Object> findById(Map<String, Object> map);
}
