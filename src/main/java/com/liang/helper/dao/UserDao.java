package com.liang.helper.dao;

import com.liang.helper.beans.User;
import com.liang.helper.beans.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    /*根据ID查找角色*/
    User selectUserById(int id);

    /*插入一条信息  注册*/
    int registerUser(UserLogin user);

    /*插入一条信息给user_msg 更新数据  注册*/
    int insertUserMassage(User user);

    User selectUserIdByPhoneNumber(String PhoneNumber);
    /*登录接口  当账号/邮箱和密码同时正确 允许登录*/
    UserLogin loginHelper(String UserName,String UserPassword);

    /*注册之前查询下 账号存不存在  */
    UserLogin selectUserName(String UserName,String UserEMail);
}
