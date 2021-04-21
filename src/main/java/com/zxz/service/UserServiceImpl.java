package com.zxz.service;

import com.zxz.dao.UserMapper;
import com.zxz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int uid) {
        return userMapper.deleteUser(uid);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User findByUid(int uid) {
        return userMapper.findByUid(uid);
    }


    @Override
    public List<User> findByName(String uname) {
        return userMapper.findByName(uname);
    }

    @Override
    public List<User> findTotal(int uid) {
        return null;
    }

    @Override
    public User findByTel(String tel) {
        return userMapper.findByTel(tel);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public User checkLogin(String tel, String psd) {
        User user = userMapper.findByTel(tel);
        if(user != null && user.getPsd().equals(psd)){
            return user;
        }
        return null;
    }

    @Override
    public void Regist(User user) {
        userMapper.Regist(user.getTel(),user.getPsd());
    }


}
