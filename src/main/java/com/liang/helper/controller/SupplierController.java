package com.liang.helper.controller;


import com.liang.helper.beans.Goods;
import com.liang.helper.dao.SupplierDao;
import com.liang.helper.service.GoodsService;
import com.liang.helper.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class SupplierController {

    /*搜索功能  根据供应商名称找商品  */

    @Autowired
    private SupplierService supplierService;
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/supplier",method = RequestMethod.GET)
    @ResponseBody
    public List<Goods> getSupplierIDbyName(@RequestParam("name") String name){
        System.out.println(name);
       int id = supplierService.selectSupplierByName(name);//找到供应商ID
       List<Goods> goods = supplierService.selectGoodsBySupplierId(id);

       goods.forEach(System.out::println);

       return goods;

    }


}
