package com.lxx.enums;


public enum ErrorCode {

	SUCCESS(0, "success"),

	// 系统
	SYSTEM_PARAM_ERROR(10001, "系统错误"),
	SYSTEM_JSON_PARSE_ERROR(10002, "JSON解析错误"),
	SYSTEM_PARAM_ERROR_TOO_LONG(10003, "字段过长"),
	SYSTEM_PARAM_ERROR_IS_NULL(10004, "字段为空"),
	SYSTEM_PARAM_ERROR_VALID_DATA_RANGE(10005, "字段不在有效的范围内"),
	SYSTEM_UNRECOGNIZED_ERROR(10201, "未识别错误"),
	SYSTEM_CLICK_TOO_FREQUENTLY(10009,"点击过快"),
	SYSTEM_BUSY(10101, "系统繁忙，请稍后重试"),
	SYSTEM_CLIENT_CALL_FAIL(10102, "服务调用失败"),
	SYSTEM_CLIENT_CALL_ERROR(10103, "服务调用异常"),
	HTTP_SERVER_ERROR(10201, "网络服务异常"),
	DEFAULT(99999, "系统错误");


	private Integer code;

	private String msg;

	ErrorCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
}
