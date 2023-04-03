package com.liang.helper.common;

/*
* 响应状态码
*
* */
public interface Constants {
    String CODE_200 = "200"; //正确状态码
    String CODE_400 = "400"; //请求参数错误状态码
    String CODE_500 = "500"; //业务错误
    String CODE_401 = "500"; //权限不足
    String CODE_601 = "401"; //自定义（用户名不存在）
    String CODE_602 = "602"; //自定义（密码不存在）
}
