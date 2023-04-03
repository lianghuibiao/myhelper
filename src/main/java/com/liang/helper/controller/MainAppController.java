package com.liang.helper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/*接口总路径：http://localhost:8080/mainApp    */
@Controller
@RequestMapping("/mainApp")
public class MainAppController {


    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String MainApp(@PathVariable("id") int id){

        //从这里应该可以返回主页部分数据  全部查找
        //需要返回产品相关数据  这里只需要获取到权限即可回传数据  或者直接回传数据






        return "";
    }




}
