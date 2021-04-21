package com.zxz.service;

import com.zxz.pojo.User;

import java.util.List;

public interface UserService{
    //添加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUser(int uid);

    //修改用户
    int updateUser(User user);

    //查看所有用户
    List<User> queryAllUser();

    //根据uid查询用户
    User findByUid(int uid);

    //通过用户名查询用户名
    List<User> findByName(String uname) ;

    //获取用户总数
    List<User> findTotal(int uid);


    User findByTel(String tel);
    User checkLogin(String tel, String psd);
    void Regist(User user);

}
