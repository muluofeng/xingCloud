package com.xing.base.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel
@Builder
@AllArgsConstructor
public class Result implements Response {

    /**
     * 操作是否成功
     */
    @ApiModelProperty("操作是否成功")
    boolean success = SUCCESS;

    /**
     * 操作代码
     */
    @ApiModelProperty("操作代码")
    int code = SUCCESS_CODE;

    /**
     * 提示信息
     */
    @ApiModelProperty("提示信息")
    String message;

    public Result(ResultCode resultCode) {
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public static Result ok() {
        return new Result(CommonCode.SUCCESS);
    }

    public static Result error() {
        return new Result(CommonCode.FAIL);
    }

}
