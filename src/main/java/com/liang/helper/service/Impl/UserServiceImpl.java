package com.liang.helper.service.Impl;


import com.liang.helper.beans.User;
import com.liang.helper.beans.UserLogin;
import com.liang.helper.dao.UserDao;
import com.liang.helper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.Password;


@Service
public class UserServiceImpl implements UserService {



    @Autowired
   private UserDao userDao;

    @Override
    public User selectUserById(int id) {

        return userDao.selectUserById(id);
    }

    @Override
    public int registerUser(UserLogin user) {
        return userDao.registerUser(user);
    }


    @Override
    public int insertUserMassage(User user) {
        return userDao.insertUserMassage(user);
    }

    @Override
    public User selectUserIdByPhoneNumber(String PhoneNumber) {
        return userDao.selectUserIdByPhoneNumber(PhoneNumber);
    }

    @Override
    public UserLogin loginHelper(String UserName, String UserPassword) {
        return userDao.loginHelper(UserName, UserPassword);
    }

    @Override
    public UserLogin selectUserName(String UserName, String UserEMail) {
        return userDao.selectUserName(UserName,UserEMail);
    }


}
