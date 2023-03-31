package com.wms.common;

import lombok.Data;

/**
 * @author Brian
 * @version 1.0
 */
@Data
public class Result {
    /** 200/400 */
    private int code;
    /** success/fail */
    private String msg;
    /** total records */
    private Long total;
    /** data */
    private Object data;

    public static Result fail(){
        return result(400, "fail", 0L, null);
    }

    public static Result success(){
        return result(200, "success", 0L, null);
    }

    public static Result success(Object data){
        return result(200, "success", 0L, data);
    }

    public static Result success(Object data, Long total){
        return result(200, "success", total, data);
    }

    private static Result result(int code, String msg, Long total, Object data) {
        Result res = new Result();
        res.setData(data);
        res.setMsg(msg);
        res.setCode(code);
        res.setTotal(total);

        return res;
    }
}
