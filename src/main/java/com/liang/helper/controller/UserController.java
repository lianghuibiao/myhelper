package com.liang.helper.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.liang.helper.beans.User;
import com.liang.helper.beans.UserLogin;
import com.liang.helper.common.R;
import com.liang.helper.dao.UserDao;
import com.liang.helper.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*接口总路径：http://localhost:8080/user*/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
    * 需求  通过id查询用户
    * 这样可以在登录完成之后迅速找到自己的名字  地址等信息
    *
    * */
   /* @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    private User toUser(@PathVariable("id") int Id){
        String number ="5678901";
        System.out.println(userService.selectUserById(Id));

        User user = new User();
        user.setUserEMail("111111@qq.com");
        user.setUserPhone(number);
      //  user.setUserPassword("3216541");
        user.setUserName(number);

        //userService.registerUser(user);//注册信息
        userService.insertUserMassage(user);//注入信息表


        return userService.selectUserById(Id);

       // return "aaa";

    }*/

    /*根据id查找角色信息   get请求*/
    @RequestMapping(value="/getUser/{id}",method = RequestMethod.GET)
    @ResponseBody
    private User selectUserById(@PathVariable("id") int id){

      return  userService.selectUserById(id);
    }

    /*
    * 用户登录功能
    *
    * */
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    private R loginHelper(String username,String password){
        /*预防空指针异常*/
            if (username==null||password==null){
                return R.ParamError("非法操作");

            }


            System.out.println("账号："+username+"==="+"密码："+password);

            if (username.equals("")||password.equals("")){
                return R.ParamError("账号或者密码不能为空");
            }

            UserLogin user = userService.loginHelper(username, password);

            if (user != null){
                // System.out.println(R.success());
                //登录成功  携带者数据进去才行   要携带个账号还有查询到的ID

                return  R.success(user.getUserID());
            }
            // System.out.println("账号："+username+"==="+"密码："+password);
            return R.error("");

    }

    /*
     * 用户注册功能
     *
     * */
    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    private R registerUserById(String phone,String email,String password){
        /*防止空指针*/
        if (phone==null||password==null||email==null){
            return R.ParamError("非法操作");

            
        }
        UserLogin user = userService.selectUserName(phone,email);
        if (user != null){
         //证明已经存在了一个同样的角色
            return  R.error("该账号已存在");
        }
        /*这里后来要加限制条件  加格式判定  这里先直接让注册了*/
       // if ()
        UserLogin registerUser = new UserLogin();
        registerUser.setUserName(phone);
        registerUser.setUserPhoneNumber(phone);
        registerUser.setUserEMail(email);
        registerUser.setUserPassword(password);

        userService.registerUser(registerUser);

        return R.success("注册成功","");

    }
    /*
     * 用户注册功能
     *
     * */


}
