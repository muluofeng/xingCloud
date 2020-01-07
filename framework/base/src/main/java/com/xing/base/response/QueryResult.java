package com.xing.base.response;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class QueryResult<T> {
    //数据列表
    @ApiModelProperty("数据列表")
    private List<T> list;
    //数据总数
    @ApiModelProperty("数据总数")
    private long total;

    @ApiModelProperty("页数")
    private Integer page;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public QueryResult() {
    }

    public QueryResult(List<T> list, long total, Integer page) {
        this.list = list;
        this.total = total;
        this.page = page;
    }
}
