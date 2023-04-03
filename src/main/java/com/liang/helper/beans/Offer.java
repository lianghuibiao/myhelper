package com.liang.helper.beans;

public class Offer {
        private int SaleID;
        private String SaleName;
        private String OrderNumber;
        private String EntryName;
        private String CustomerName;
        private float OfferPrice;
        private String OfferDate;
        private String OfferNotes;

    @Override
    public String toString() {
        return "Offer{" +
                "SaleID=" + SaleID +
                ", SaleName='" + SaleName + '\'' +
                ", OrderNumber='" + OrderNumber + '\'' +
                ", EntryName='" + EntryName + '\'' +
                ", CustomerName='" + CustomerName + '\'' +
                ", OfferPrice=" + OfferPrice +
                ", OfferDate='" + OfferDate + '\'' +
                ", OfferNotes='" + OfferNotes + '\'' +
                '}';
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

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public String getEntryName() {
        return EntryName;
    }

    public void setEntryName(String entryName) {
        EntryName = entryName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public float getOfferPrice() {
        return OfferPrice;
    }

    public void setOfferPrice(float offerPrice) {
        OfferPrice = offerPrice;
    }

    public String getOfferDate() {
        return OfferDate;
    }

    public void setOfferDate(String offerDate) {
        OfferDate = offerDate;
    }

    public String getOfferNotes() {
        return OfferNotes;
    }

    public void setOfferNotes(String offerNotes) {
        OfferNotes = offerNotes;
    }

    public Offer() {
    }

    public Offer(int saleID, String saleName, String orderNumber, String entryName, String customerName, float offerPrice, String offerDate, String offerNotes) {
        SaleID = saleID;
        SaleName = saleName;
        OrderNumber = orderNumber;
        EntryName = entryName;
        CustomerName = customerName;
        OfferPrice = offerPrice;
        OfferDate = offerDate;
        OfferNotes = offerNotes;
    }
}
