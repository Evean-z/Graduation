package com.zxz.dao;

import com.zxz.pojo.Message;

import java.util.List;

public interface MessageMapper {

    //查询所有信息
    List<Message> findAllMsg();

    //添加一个公告信息
    int addMsg(Message message);

    //根据主键查询信息
    Message findByBh(int xxbh);

    //修改公告信息
    int updateMsg(Message message);

    //删除公告信息
    int deleteMsg(int xxbh);

    //显示最新公告信息
    Message findFirstMsg(int xxbh);

    //根据标题模糊查询
    List<Message> findOneMsg(String xxbt);
}
