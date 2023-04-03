package com.liang.helper.beans;

public class Supplier {
    private int supplierID;
    private String SupplierName;
    private String SupplierAddress;
    private String SupplierBusiness;
    private String SupplierNumber;

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierID=" + supplierID +
                ", SupplierName='" + SupplierName + '\'' +
                ", SupplierAddress='" + SupplierAddress + '\'' +
                ", SupplierBusiness='" + SupplierBusiness + '\'' +
                ", SupplierNumber='" + SupplierNumber + '\'' +
                '}';
    }

    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplierName) {
        SupplierName = supplierName;
    }

    public String getSupplierAddress() {
        return SupplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        SupplierAddress = supplierAddress;
    }

    public String getSupplierBusiness() {
        return SupplierBusiness;
    }

    public void setSupplierBusiness(String supplierBusiness) {
        SupplierBusiness = supplierBusiness;
    }

    public String getSupplierNumber() {
        return SupplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        SupplierNumber = supplierNumber;
    }

    public Supplier() {
    }

    public Supplier(int supplierID, String supplierName, String supplierAddress, String supplierBusiness, String supplierNumber) {
        this.supplierID = supplierID;
        SupplierName = supplierName;
        SupplierAddress = supplierAddress;
        SupplierBusiness = supplierBusiness;
        SupplierNumber = supplierNumber;
    }
}
