package com.liang.helper.service;


import com.liang.helper.beans.Goods;
import com.liang.helper.beans.Supplier;

import java.util.List;

public interface SupplierService {

    /*根据供应商ID查找供应商   点击商品明细的时候可以请求看供销商名称 */
    Supplier selectSupplierById(int supplierID);

    /*根据供应商名称 返回供应商ID    场景：这个返回的ID可以用来查找详细的商品列表*/
    int selectSupplierByName(String SupplierName);


    /*根据模糊查询供应商*/

    Supplier selectSupplierLikeByName(String SupplierName);

    /*根据id返回产品集合*/
    List<Goods> selectGoodsBySupplierId(int supplierID);
}
