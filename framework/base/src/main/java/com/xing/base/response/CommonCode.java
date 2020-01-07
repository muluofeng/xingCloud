package com.xing.base.response;

import lombok.ToString;

@ToString
public enum CommonCode implements ResultCode {


    SUCCESS(true, 200, "操作成功！"),
    FAIL(false, 500, "操作失败！");


    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }


}
