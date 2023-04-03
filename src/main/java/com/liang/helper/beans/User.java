package com.liang.helper.beans;



public class User {

/*
*
*
                userID int,
                user_name varchar(60) NOT NULL,
                user_head_address varchar(400) NOT NULL,
                user_sex varchar(40),
                user_address varchar(400),
                user_hobby varchar(100),
                user_phone_number int,
                user_e_mail varchar(60),
                user_power int,
                user_handle varchar(400),
                user_delete int,
                PRIMARY KEY ( userID )
* */

        private int userID; //用户ID
        private String UserName; //用户昵称
        private String UserHeadAddress;  //用户头像地址
        private String UserSex;        //用户性别
        private String UserAddress;     //地址
        private String UserHobby;       //爱好
        private String UserPhoneNumber;         //手机号
        private String UserEMail;       //邮箱
        private int UserPower;          //权限
        private String UserHandle;      //操作记录
        private int UserDelete;         //是否存在

        public User(int userID, String userName, String userHeadAddress, String userSex, String userAddress, String userHobby, String userPhoneNumber, String userEMail, int userPower, String userHandle, int userDelete) {
                this.userID = userID;
                UserName = userName;
                UserHeadAddress = userHeadAddress;
                UserSex = userSex;
                UserAddress = userAddress;
                UserHobby = userHobby;
                UserPhoneNumber = userPhoneNumber;
                UserEMail = userEMail;
                UserPower = userPower;
                UserHandle = userHandle;
                UserDelete = userDelete;
        }

        public User() {
        }

        public int getUserID() {
                return userID;
        }

        public void setUserID(int userID) {
                this.userID = userID;
        }

        public String getUserName() {
                return UserName;
        }

        public void setUserName(String userName) {
                UserName = userName;
        }

        public String getUserHeadAddress() {
                return UserHeadAddress;
        }

        public void setUserHeadAddress(String userHeadAddress) {
                UserHeadAddress = userHeadAddress;
        }

        public String getUserSex() {
                return UserSex;
        }

        public void setUserSex(String userSex) {
                UserSex = userSex;
        }

        public String getUserAddress() {
                return UserAddress;
        }

        public void setUserAddress(String userAddress) {
                UserAddress = userAddress;
        }

        public String getUserHobby() {
                return UserHobby;
        }

        public void setUserHobby(String userHobby) {
                UserHobby = userHobby;
        }

        public String getUserPhone() {
                return UserPhoneNumber;
        }

        public void setUserPhone(String userPhoneNumber) {
                UserPhoneNumber = userPhoneNumber;
        }

        public String getUserEMail() {
                return UserEMail;
        }

        public void setUserEMail(String userEMail) {
                UserEMail = userEMail;
        }

        public int getUserPower() {
                return UserPower;
        }

        public void setUserPower(int userPower) {
                UserPower = userPower;
        }

        public String getUserHandle() {
                return UserHandle;
        }

        public void setUserHandle(String userHandle) {
                UserHandle = userHandle;
        }

        public int getUserDelete() {
                return UserDelete;
        }

        public void setUserDelete(int userDelete) {
                UserDelete = userDelete;
        }

        @Override
        public String toString() {
                return "User{" +
                        "userID=" + userID +
                        ", UserName='" + UserName + '\'' +
                        ", UserHeadAddress='" + UserHeadAddress + '\'' +
                        ", UserSex='" + UserSex + '\'' +
                        ", UserAddress='" + UserAddress + '\'' +
                        ", UserHobby='" + UserHobby + '\'' +
                        ", UserPhone=" + UserPhoneNumber +
                        ", UserEMail='" + UserEMail + '\'' +
                        ", UserPower=" + UserPower +
                        ", UserHandle='" + UserHandle + '\'' +
                        ", UserDelete=" + UserDelete +
                        '}';
        }




}
