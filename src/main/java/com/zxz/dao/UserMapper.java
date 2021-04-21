package com.zxz.dao;

import com.zxz.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查看所有用户
    //List<User> queryAllUser();

    //添加一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int uid);

    //模糊查询用户名
    List<User> findByName(@Param("uname") String uname);

    //根据uid查询用户
    User findByUid(int uid);

    //获取用户总数
    List<User> findTotal(int uid);

    List<User> queryAllUser();



    User findByTel(String tel);
    void Regist(@Param("tel") String tel,
                @Param("psd") String psd);
}
