package com.lxx.common.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageInfo<T> implements Serializable {
    private static final long serialVersionUID = 2L;
    private List<T> data;
    private long total;
    private Integer pageNo;
    private Integer pageSize;
    private Integer nextPage;
    private Boolean hasNext;


//    public static <W> PageInfo<W> copyFrom(PageInfo pageInfo) {
//        return PageInfo.<W>builder().total(pageInfo.total).pageSize(pageInfo.pageSize).pageNo(pageInfo.pageNo)
//                .nextPage(pageInfo.nextPage).hasNext(pageInfo.hasNext).build();
//    }
}