package com.lxx.common.response;


/**
 * 返回工具类
 * @Author lxx
 * @Date 2023/5/9
 */
public class ResponseUtil {

    public static <T> Response<T> makeSuccess(T obj) {
        return makeResponse(0, "", obj);
    }

    public static <T> Response<T> makeResponse(int code, String msg, T obj) {
        Response<T> result = new Response<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(obj);
        return result;
    }

    public static <T> Response<T> makeFail(String message) {
        return makeResponse(1, message, null);
    }

    public static <T> Response<T> makeFail(Integer code, String message) {
        return makeResponse(code, message, null);
    }

}