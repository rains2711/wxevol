package com.cn.wanxi.entity.technologysharing;

/**
 * @author: LiRui
 * @Date: 2019/12/16
 * @Time: 15:49
 */
public enum StatusEnum{
    /**
     * 正在审核
     */
    CHECKING(0,"正在审核"),
    /**
     * 审核成功
     */
    SUCCESS(1,"审核成功"),
    /**
     * 已删除
     */
    DELETE(9,"已删除")
    ;

    private final Integer code;
    private final String message;

    private StatusEnum(Integer code,String message) {
        this.code=code;
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "StatusEnum{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
