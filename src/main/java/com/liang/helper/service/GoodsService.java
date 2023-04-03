package com.liang.helper.service;

import com.liang.helper.beans.Goods;

import java.util.List;

public interface GoodsService {

    /*返回所有产品数据*/
    Goods selectAllGoods();

    /*根据id返回产品数据*/
    Goods selectGoodsById(int GoodsID);


    /*根据id返回产品集合*/
    List<Goods> getGoodsByLikeName(String GoodName);

}
