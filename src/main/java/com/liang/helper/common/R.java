package com.liang.helper.common;

import com.sun.org.apache.regexp.internal.RE;

import javax.xml.transform.Result;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class R implements Serializable {
    /*
    * 响应码：200  成功
    * 响应码：400  错误
    *
    * */

    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public R(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static R success(){

        return new R(Constants.CODE_200,"登录成功",null);
    }
    /*定制成功*/
    public static R success(String msg,String str){

        return new R(Constants.CODE_200,msg,str);
    }
    public static R success(int id){

        return new R(Constants.CODE_200,"登录成功",id);
    }

    public static R error(String msg){
        return new R(Constants.CODE_500,"业务错误",msg);
    }
    public static R ParamError(String data){
        return new R(Constants.CODE_500,"请求参数错误",data);
    }
}
