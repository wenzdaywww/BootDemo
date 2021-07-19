package com.www.demo.model.common;

import java.io.Serializable;

/**
 * @author www
 * @version 1.0
 * @description 响应报文类
 * @date 2021/7/19 22:22
 */
public class ResponseMsg<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 响应码 **/
    private Integer code;
    /** 响应消息 **/
    private String msg;
    /** 响应数据 **/
    private T data;
    /**
     * @author www
     * @date 2021/7/19 22:26
     * @description 响应报文构造方法
     * @param code 响应码
     * @param data 数据
     */
    public ResponseMsg(ResponseEnum code, T data) {
        this.code = code.getCode();
        this.msg = code.getMsg();
        this.data = data;
    }
    /**
     * @author www
     * @date 2021/7/19 22:26
     * @description 响应报文构造方法
     * @param code 响应码
     * @param msg 响应信息
     * @param data 数据
     */
    public ResponseMsg(ResponseEnum code, String msg, T data) {
        this.code = code.getCode();
        this.msg = msg == null ? code.getMsg() : msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
