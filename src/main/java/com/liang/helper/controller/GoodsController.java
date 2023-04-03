package com.liang.helper.controller;

import com.liang.helper.beans.Goods;
import com.liang.helper.service.GoodsService;
import com.liang.helper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsController {
    
    @Autowired
    private GoodsService goodsService;

    /*通过获取所有商品*/
    @RequestMapping(value = "/goods",method = RequestMethod.GET)
    @ResponseBody
    private Goods getAllGoods(){
        Goods goods = goodsService.selectAllGoods();
        System.out.println(goods);
        return goods;
    }

    /*通过id获取商品*/
    @RequestMapping(value = "/goods/{id}",method = RequestMethod.GET)
    @ResponseBody
    private Goods getGoodsByID(@PathVariable("id") int id){
        Goods goods = goodsService.selectGoodsById(id);
        System.out.println(goods);
        return goods;
    }


    /*查找商品近似查找*/
//    @RequestMapping(value = "/goods/{id}",method = RequestMethod.GET)
//    @ResponseBody
//    private Goods getGoodsByLikeName(@PathVariable("id") int id){
//        Goods goods = goodsService.selectGoodsById(id);
//        System.out.println(goods);
//        return goods;
//    }







}
