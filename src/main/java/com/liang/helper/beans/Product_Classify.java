package com.liang.helper.beans;



/*产品分类表*/
public class Product_Classify {
        private int ClassifyID;//分类ID
        private String ClassifyName;//产品分类名称

    @Override
    public String toString() {
        return "Product_Classify{" +
                "ClassifyID=" + ClassifyID +
                ", ClassifyName='" + ClassifyName + '\'' +
                '}';
    }

    public int getClassifyID() {
        return ClassifyID;
    }

    public void setClassifyID(int classifyID) {
        ClassifyID = classifyID;
    }

    public String getClassifyName() {
        return ClassifyName;
    }

    public void setClassifyName(String classifyName) {
        ClassifyName = classifyName;
    }

    public Product_Classify() {
    }

    public Product_Classify(int classifyID, String classifyName) {
        ClassifyID = classifyID;
        ClassifyName = classifyName;
    }
}
