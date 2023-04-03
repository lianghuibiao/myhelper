package com.liang.helper.service.Impl;


import com.liang.helper.beans.Goods;
import com.liang.helper.beans.Supplier;
import com.liang.helper.dao.SupplierDao;
import com.liang.helper.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    @Override
    public Supplier selectSupplierById(int supplierID) {
        return supplierDao.selectSupplierById(supplierID);
    }

    @Override
    public int selectSupplierByName(String SupplierName) {
        return supplierDao.selectSupplierByName(SupplierName);
    }

    @Override
    public Supplier selectSupplierLikeByName(String SupplierName) {
        return supplierDao.selectSupplierLikeByName(SupplierName);
    }

    @Override
    public List<Goods> selectGoodsBySupplierId(int supplierID) {
        return supplierDao.selectGoodsBySupplierId(supplierID);
    }


}
