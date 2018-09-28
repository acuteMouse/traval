package com.zy.traval.common.util;

import java.util.Map;

/**
 * @author cgl
 * @date 2018/9/25 21:05
 */
public class ResponMap {
    private Integer flag;
    private Object result;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void setFail(Object result) {
        this.flag = 0;
        this.result = result;
    }

    public void setSuccess(Object result) {
        this.flag = 1;
        this.result = result;
    }
}
