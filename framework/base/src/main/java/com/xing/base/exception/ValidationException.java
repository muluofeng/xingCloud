package com.xing.base.exception;

/**
 * 数据验证异常
 *
 * @author xiexingxing
 * @Created by 2019-11-17 20:11.
 */
public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}