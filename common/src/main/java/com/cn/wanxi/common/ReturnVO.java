package com.cn.wanxi.common;

/**
 * VO（View Object）：显示层对象，通常是 Web 向模板渲染引擎层传输的对象。
 *
 * @author luoyuequan
 * @time 2019/12/17 14:25
 */
public class ReturnVO {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    private ReturnVO() {
    }

    /**
     * 有数据构造
     *
     * @param code 响应码
     * @param msg  响应消息
     * @param data 数据
     */
    private ReturnVO(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 无数据构造
     *
     * @param code 响应码
     * @param msg  响应消息
     */
    private ReturnVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 成功响应，有响应数据
     *
     * @param messageEnum 消息
     * @param data        反馈数据
     * @return vo
     */
    public static ReturnVO success(MessageEnum messageEnum, Object data) {
        return new ReturnVO(messageEnum.getCode(), messageEnum.getMsg(), data);
    }

    /**
     * 成功响应，无响应数据
     *
     * @param messageEnum 消息
     * @return vo
     */
    public static ReturnVO success(MessageEnum messageEnum) {
        return success(messageEnum, null);
    }

    /**
     * 失败响应，无响应数据
     *
     * @param messageEnum 消息
     * @return vo
     */
    public static ReturnVO error(MessageEnum messageEnum) {
        return new ReturnVO(messageEnum.getCode(), messageEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReturnVO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

}
