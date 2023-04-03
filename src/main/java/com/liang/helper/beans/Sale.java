package com.liang.helper.beans;

public class Sale {
    private int SaleID; //业务员ID
    private String SaleName; //业务员昵称
    private float SaleVolume; //月销售额
    private float OfferStat;  //报价统计
    private float ClosingRatio; //签单率
    private int is_exist;  //是否存在  0不存在1存在
    private String notes; //备注


    @Override
    public String toString() {
        return "Sale{" +
                "SaleID=" + SaleID +
                ", SaleName='" + SaleName + '\'' +
                ", SaleVolume=" + SaleVolume +
                ", OfferStat=" + OfferStat +
                ", ClosingRatio=" + ClosingRatio +
                ", is_exist=" + is_exist +
                ", notes='" + notes + '\'' +
                '}';
    }

    public Sale() {
    }

    public Sale(int saleID, String saleName, float saleVolume, float offerStat, float closingRatio, int is_exist, String notes) {
        SaleID = saleID;
        SaleName = saleName;
        SaleVolume = saleVolume;
        OfferStat = offerStat;
        ClosingRatio = closingRatio;
        this.is_exist = is_exist;
        this.notes = notes;
    }

    public int getSaleID() {
        return SaleID;
    }

    public void setSaleID(int saleID) {
        SaleID = saleID;
    }

    public String getSaleName() {
        return SaleName;
    }

    public void setSaleName(String saleName) {
        SaleName = saleName;
    }

    public float getSaleVolume() {
        return SaleVolume;
    }

    public void setSaleVolume(float saleVolume) {
        SaleVolume = saleVolume;
    }

    public float getOfferStat() {
        return OfferStat;
    }

    public void setOfferStat(float offerStat) {
        OfferStat = offerStat;
    }

    public float getClosingRatio() {
        return ClosingRatio;
    }

    public void setClosingRatio(float closingRatio) {
        ClosingRatio = closingRatio;
    }

    public int getIs_exist() {
        return is_exist;
    }

    public void setIs_exist(int is_exist) {
        this.is_exist = is_exist;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
