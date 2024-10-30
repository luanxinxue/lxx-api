package com.lxx.exception;

import com.lxx.enums.ErrorCode;
import lombok.Getter;

@Getter
public class ErrorCodeException extends Exception {

    private static final long serialVersionUID = 2030052181585565652L;

    private int code;

    private String msg;
    /**
     * errorCode
     */
    private ErrorCode errorCode;
    /**
     * obj:返回的数据，推荐使用map类型
     */
    private Object obj;

    public ErrorCodeException(ErrorCode errorCode, Object obj) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
        this.obj = obj;
    }

    public ErrorCodeException(int code, String msg, Object obj) {
        super(msg);
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public ErrorCodeException(int code, String msg) {
        this(code, msg, null);
    }

    public ErrorCodeException(ErrorCode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
        this.obj = null;
    }

}
