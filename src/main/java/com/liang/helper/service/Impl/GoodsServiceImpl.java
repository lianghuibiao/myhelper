package com.liang.helper.service.Impl;


import com.liang.helper.beans.Goods;
import com.liang.helper.dao.GoodsDao;
import com.liang.helper.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;


    @Override
    public Goods selectAllGoods() {
        return goodsDao.selectAllGoods();
    }

    @Override
    public Goods selectGoodsById(int GoodsID) {
        return goodsDao.selectGoodsById(GoodsID);
    }


    @Override
    public List<Goods> getGoodsByLikeName(String GoodName) {
        return goodsDao.getGoodsByLikeName(GoodName);
    }
}
