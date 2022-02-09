package com.wg.authority.common.bean;



import com.wg.authority.common.enums.ResponseStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * 自定义Api响应结构
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/23
 * @param <T> 响应数据类型
 */
@Data
public class ResultBean<T>{

    @ApiModelProperty(value = "响应状态码")
    private int code = ResponseStatus.OK.getCode();

    /**
     * 响应消息
     * */
    @ApiModelProperty(value = "响应状态信息")
    private String msg = ResponseStatus.OK.getMsg();
    /**
     * 响应中的数据
     * */
    @ApiModelProperty(value = "响应数据")
    private T data;


    private ResultBean() {

    }

    private ResultBean(ResponseStatus ResponseStatus) {
        this.code = ResponseStatus.getCode();
        this.msg = ResponseStatus.getMsg();

    }

    private ResultBean(T data){
        this.data = data;
    }




    /**
     * 业务处理成功,无数据返回
     * */
    public static ResultBean<Void> ok() {
        return new ResultBean<>();
    }

    /**
     * 业务处理成功，有数据返回
     * */
    public static <T> ResultBean<T> ok(T data) {
        return new ResultBean<>(data);
    }

    /**
     * 业务处理失败
     * */
    public static ResultBean<Void> fail(ResponseStatus ResponseStatus) {
        return new ResultBean<>(ResponseStatus);
    }


    /**
     * 系统错误
     * */
    public static ResultBean<Void> error() {
        return new ResultBean<>(ResponseStatus.ERROR);
    }

    /**
     * 未授权返回结果
     *
     */
    public static  ResultBean<String> forbidden(String message){
        return new ResultBean<>(ResponseStatus.FORBIDDEN.getMsg());
    }
    /**
     * 未登录或token失效
     */
    public static ResultBean<String> noLogin(String message){
        return new ResultBean<>(ResponseStatus.NO_LOGIN.getMsg());
    }
}

