package com.liang.helper.beans;

/*产品表*/
public class Product {
    private int ProductID;//产品ID
    private int classifyID; //分类ID
    private String ProductName; //产品名称
    private String ProductSpecs; //产品规格

    @Override
    public String toString() {
        return "Product{" +
                "ProductID=" + ProductID +
                ", classifyID=" + classifyID +
                ", ProductName='" + ProductName + '\'' +
                ", ProductSpecs='" + ProductSpecs + '\'' +
                '}';
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getClassifyID() {
        return classifyID;
    }

    public void setClassifyID(int classifyID) {
        this.classifyID = classifyID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductSpecs() {
        return ProductSpecs;
    }

    public void setProductSpecs(String productSpecs) {
        ProductSpecs = productSpecs;
    }

    public Product() {
    }

    public Product(int productID, int classifyID, String productName, String productSpecs) {
        ProductID = productID;
        this.classifyID = classifyID;
        ProductName = productName;
        ProductSpecs = productSpecs;
    }
}
