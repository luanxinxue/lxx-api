package com.lxx.model.common;

import lombok.Data;

@Data
public class PageParam {

    /**
     * 页面编码。 默认从1开始
     */
    private int pageNo = 1;
    /**
     * 页面数量
     */
    private int pageSize = 10;
    /**
     * 偏移量
     */
    private long offset;
    /**
     * 起始id
     */
    private long sinceId;

    public long getOffset() {
        if (offset > 0) {
            return offset;
        } else {
            return (pageNo - 1) * pageSize;
        }
    }
}
