package com.xhsd.utils;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Result<T> {
    /** 业务错误码 */
    private Integer code;
    /** 信息描述 */
    private String msg;
    /** 返回参数 */
    private T data;

    private Result(ReturnCode resultStatus, T data) {
        this.code = resultStatus.getCode();
        this.msg = resultStatus.getMsg();
        this.data = data;
    }

    /** 业务成功返回业务代码和描述信息 */
    public static Result<Void> success() {
        return new Result<Void>(ReturnCode.RC_SUCCESS, null);
    }

    /** 业务成功返回业务代码,描述和返回的参数 */
    public static <T> Result<T> success(T data) {
        return new Result<T>(ReturnCode.RC_SUCCESS, data);
    }

    /** 业务成功返回业务代码,描述和返回的参数 */
    public static <T> Result<T> success(ReturnCode resultStatus, T data) {
        if (resultStatus == null) {
            return success(data);
        }
        return new Result<T>(resultStatus, data);
    }

    /** 业务异常返回业务代码和描述信息 */
    public static <T> Result<T> failure() {
        return new Result<T>(ReturnCode.INTERNAL_SERVER_ERROR, null);
    }

    /** 业务异常返回业务代码,描述和返回的参数 */
    public static <T> Result<T> failure(ReturnCode resultStatus) {
        return failure(resultStatus, null);
    }

    /** 业务异常返回业务代码,描述和返回的参数 */
    public static <T> Result<T> failure(ReturnCode resultStatus, T data) {
        if (resultStatus == null) {
            return new Result<T>(ReturnCode.INTERNAL_SERVER_ERROR, null);
        }
        return new Result<T>(resultStatus, data);
    }
}


