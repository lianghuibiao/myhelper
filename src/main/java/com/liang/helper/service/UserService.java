package com.liang.helper.service;


import com.liang.helper.beans.User;
import com.liang.helper.beans.UserLogin;

public interface UserService {
    User selectUserById(int id);

    int registerUser(UserLogin user);

    /*插入一条信息给user_msg 更新数据  注册*/
    int insertUserMassage(User user);

    User selectUserIdByPhoneNumber(String PhoneNumber);

    UserLogin loginHelper(String UserName,String UserPassword);

    UserLogin selectUserName(String UserName,String UserEMail);
}
