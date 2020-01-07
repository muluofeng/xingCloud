package com.xing.base.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel
public class SingleResult<T> extends Result {
    @ApiModelProperty("数据信息")
    private T data;

    public SingleResult() {
    }

    public SingleResult(ResultCode resultCode, T t) {
        super(resultCode);
        this.data = t;
    }


    public static <T> SingleResult<T> ok(T data) {
        return new SingleResult<T>(CommonCode.SUCCESS, data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
