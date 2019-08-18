package com.tang.oauth.content.resource.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用的返回对象
 * @author ASUS
 * @create 2019-08-17 18:52
 */
@Data
public class ResponseResult<T> implements Serializable {

    /**
     * 状态码
     */
    private Integer state;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回对象
     */
    private T data;

    public ResponseResult() { }

    public ResponseResult(Integer state) { }

    public ResponseResult(Integer state, String message) {
        this.state = state;
        this.message = message;
    }

    public ResponseResult(Integer state, Throwable throwable) {
        this.state = state;
        this.message = throwable.getMessage();
    }

    public ResponseResult(Integer state, String message, T data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

}
