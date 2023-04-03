package com.liang.helper.beans;

/*商品表*/
public class Goods {
    private int GoodsID;//产品ID
    private int ClassifyID;//分类ID
    private String GoodsName;//商品名称
    private String GoodsSpecs;//商品规格
    private float GoodsPrice;//商品单价
    private int SupplierID;//供应商ID

    @Override
    public String toString() {
        return "Goods{" +
                "GoodsID=" + GoodsID +
                ", ClassifyID=" + ClassifyID +
                ", GoodsName='" + GoodsName + '\'' +
                ", GoodsSpecs='" + GoodsSpecs + '\'' +
                ", GoodsPrice=" + GoodsPrice +
                ", SupplierID=" + SupplierID +
                '}';
    }

    public int getGoodsID() {
        return GoodsID;
    }

    public void setGoodsID(int goodsID) {
        GoodsID = goodsID;
    }

    public int getClassifyID() {
        return ClassifyID;
    }

    public void setClassifyID(int classifyID) {
        ClassifyID = classifyID;
    }

    public String getGoodsName() {
        return GoodsName;
    }

    public void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public String getGoodsSpecs() {
        return GoodsSpecs;
    }

    public void setGoodsSpecs(String goodsSpecs) {
        GoodsSpecs = goodsSpecs;
    }

    public float getGoodsPrice() {
        return GoodsPrice;
    }

    public void setGoodsPrice(float goodsPrice) {
        GoodsPrice = goodsPrice;
    }

    public int getSupplierID() {
        return SupplierID;
    }

    public void setSupplierID(int supplierID) {
        SupplierID = supplierID;
    }

    public Goods() {
    }

    public Goods(int goodsID, int classifyID, String goodsName, String goodsSpecs, float goodsPrice, int supplierID) {
        GoodsID = goodsID;
        ClassifyID = classifyID;
        GoodsName = goodsName;
        GoodsSpecs = goodsSpecs;
        GoodsPrice = goodsPrice;
        SupplierID = supplierID;
    }
}
