package com.welearn.backend.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    SYSTEM_ERROR(2001, "服务器冒烟啦！！！要不然你稍后再试试～"),
    NO_LOGIN(2002, "未登录不能进行评论，请先登录");

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }
}
