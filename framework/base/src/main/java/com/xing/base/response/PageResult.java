package com.xing.base.response;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel
public class PageResult<T> extends Result{
    /**
     * 数据列表
     */
    @ApiModelProperty("数据列表")
    private List<T> list;
    /**
     * 数据总数
     */
    @ApiModelProperty("数据总数")
    private long total;

    @ApiModelProperty("页数")
    private Long page;


    @ApiModelProperty("总页数")
    private Long pageTotal;


    public PageResult() {
    }



    public PageResult(ResultCode resultCode, String message) {
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = message;
    }

    public PageResult(List<T> list, long total, Long page, Long pageTotal) {
        super(CommonCode.SUCCESS);
        this.list = list;
        this.total = total;
        this.page = page;
        this.pageTotal = pageTotal;
    }


    public PageResult(List<T> list, long total, long page, long pageSize) {
        super(CommonCode.SUCCESS);
        this.list = list;
        this.total = total;
        this.page = page;
        long currentPageSize = (pageSize == 0) ? 10 : pageSize;
        long pageTotal = (int) Math.ceil(total * 1.0 / currentPageSize);
        this.pageTotal = pageTotal;
    }

    public static <T> PageResult<T> getQueryResult(List<T> list, long total, int page, int pageSize) {
        return new PageResult(list, total, page, pageSize);
    }

    public static PageResult error(String message) {
        return new PageResult(CommonCode.FAIL, message);
    }
//
//
//    /**
//     * mybatis page 转为 自定义page
//     * @param pae
//     * @param <T>
//     * @return
//     */
//    public static <T> PageResult<T> fromPage(Page<T> pae) {
//        return new PageResult(pae.getRecords(), pae.getTotal(), pae.getPages(), pae.getSize());
//    }


}
