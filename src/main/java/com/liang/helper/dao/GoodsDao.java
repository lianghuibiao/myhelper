package com.liang.helper.dao;

import com.liang.helper.beans.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsDao {

    /*返回所有产品数据*/
    Goods selectAllGoods();

    /*根据id返回产品数据*/
    Goods selectGoodsById(int GoodsID);

    /*根据id返回产品集合*/
    List selectGoodsBySupplierId(int supplierID);


    /*根据根据商品名称*/
    List<Goods> getGoodsByLikeName(String GoodName);

}
