package com.lxx.exception;


import com.lxx.common.response.Response;
import com.lxx.common.response.ResponseUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

import java.sql.SQLSyntaxErrorException;

        ;
import static com.lxx.enums.ErrorCode.HTTP_SERVER_ERROR;
import static com.lxx.enums.ErrorCode.SYSTEM_PARAM_ERROR;


/**
 * @Description
 * @Author lxx
 * @Date 2023/6/20
 */
@RestControllerAdvice
public class GlobalExceptionHandler{

    /**
     * sql异常
     **/
    @ExceptionHandler(SQLSyntaxErrorException.class)
    public Response sqlSyntaxErrorException(SQLSyntaxErrorException e) {
        return ResponseUtil.makeFail(SYSTEM_PARAM_ERROR.getMsg());
    }
    /**
     * 自定义异常
     **/
    @ExceptionHandler(ErrorCodeException.class)
    public Response ErrorCodeException(ErrorCodeException e) {
        return ResponseUtil.makeFail(e.getCode(),e.getMessage());
    }

    /**
     * HttpServerErrorException
     **/
    @ExceptionHandler(HttpServerErrorException.class)
    public Response httpServerErrorException(HttpServerErrorException e) {
        return ResponseUtil.makeFail(HTTP_SERVER_ERROR.getCode(),HTTP_SERVER_ERROR.getMsg());
    }

    /**
     * @Description
     * @Author lxx
     * @Date 2023/6/20
     */
    @ExceptionHandler(Exception.class)
    public Response SystemException(Exception e) {
        return ResponseUtil.makeFail(SYSTEM_PARAM_ERROR.getCode(),SYSTEM_PARAM_ERROR.getMsg());
    }
}