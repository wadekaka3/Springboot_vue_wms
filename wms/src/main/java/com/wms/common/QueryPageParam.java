package com.wms.common;

import lombok.Data;

import java.util.HashMap;

/**
 * @author Brian
 * @version 1.0
 */
@Data
public class QueryPageParam {
    // default
    private static int PAGE_SIZE = 20;
    private static int PAGE_NUM = 1;

    private int pageSize = PAGE_SIZE;
    private int pageNum = PAGE_NUM;

    private HashMap param;
}
