package com.lxx.common;

import lombok.Data;

/**
 * 响应类
 * @Author lxx
 * @Date 2023/5/9
 */
@Data
public class Response<T> {
    private int code;
    private String msg;
    private T data;

    public Response() {
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}