package com.liang.helper.beans;

import lombok.Data;


public class UserLogin {



    private int userID;
    private String UserPhoneNumber; //手机号
    private String UserEMail;       //邮箱
    private String UserPassword;       //密码
    private String UserName; //用户昵称

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }

    public String getUserEMail() {
        return UserEMail;
    }

    public void setUserEMail(String userEMail) {
        UserEMail = userEMail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public UserLogin() {
    }

    public UserLogin(int userID, String userPhoneNumber, String userEMail, String userPassword, String userName) {
        this.userID = userID;
        UserPhoneNumber = userPhoneNumber;
        UserEMail = userEMail;
        UserPassword = userPassword;
        UserName = userName;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userID=" + userID +
                ", UserPhoneNumber='" + UserPhoneNumber + '\'' +
                ", UserEMail='" + UserEMail + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserName='" + UserName + '\'' +
                '}';
    }
}
