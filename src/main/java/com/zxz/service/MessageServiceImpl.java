package com.zxz.service;

import com.zxz.dao.MessageMapper;
import com.zxz.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("MessageService")
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    public void setMessageMapper(MessageMapper messageMapper){
        this.messageMapper = messageMapper;
    }

    @Override
    public List<Message> findAllMsg() {
        return messageMapper.findAllMsg();
    }

    @Override
    public int addMsg(Message message) {
        return messageMapper.addMsg(message);
    }

    @Override
    public Message findByBh(int xxbh) {
        return messageMapper.findByBh(xxbh);
    }

    @Override
    public int updateMsg(Message message) {
        return messageMapper.updateMsg(message);
    }

    @Override
    public int deleteMsg(int xxbh) {
        return messageMapper.deleteMsg(xxbh);
    }

    @Override
    public Message findFirstMsg(int xxbh) {
        return messageMapper.findFirstMsg(xxbh);
    }

    @Override
    public List<Message> findOneMsg(String xxbt) {
        return messageMapper.findOneMsg(xxbt);
    }
}
