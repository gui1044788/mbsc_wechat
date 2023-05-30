package com.xhsd.utils;

import org.springframework.http.HttpStatus;

public enum ReturnCode {
    /**
     * 响应成功
     */
    RC_SUCCESS(HttpStatus.OK,200, "响应成功"),
    /**
     * 响应异常
     */
    RC_FAIL(HttpStatus.BAD_REQUEST,400, "响应异常"),
    /**
     * 响应失败
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 501, "响应失败"),

    /**
     * 操作失败
     */
    OPERATION_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, 503, "操作失败"),

    /**
     * 异常失败
     */
    EXPECTATION_ERROR(HttpStatus.EXPECTATION_FAILED, 503, "异常失败"),




    ;

    // 自定义状态码
    private final int code;

    // 自定义描述
    private final String msg;


    /** 返回的HTTP状态码,  符合http请求 */
    private HttpStatus httpStatus;
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ReturnCode(HttpStatus httpStatus, Integer code, String msg) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.msg = msg;
    }
}
