package com.zxz.controller;

import com.zxz.pojo.Message;
import com.zxz.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/message")
public class MessageController {

    //Controller调用Service层
    @Autowired
    @Qualifier("MessageServiceImpl")
    private MessageService messageService;

    //查询全部用户并返回allUser页面
    @RequestMapping("/allMsg")
    public String findAllMsg(Model model) {
        List<Message> list = messageService.findAllMsg();
        model.addAttribute("list", list);
        return "allMsg";
    }

    //跳转到增加信息页面
    @RequestMapping("/toAddMsg")
    public String toAddMsg() {
        return "addMsg";
    }

    @RequestMapping("/addMsg")
    public String addMsg(Message message) {
        System.out.println(message);
        messageService.addMsg(message);
        return "redirect:/message/allMsg";
    }

    //跳转到修改信息页面
    @RequestMapping("/toUpdateMsg")
    public String toUpdateMsg(Model model, Integer xxbh) {
        Message message = messageService.findByBh(xxbh);
        System.out.println(message);
        model.addAttribute("message", message);
        return "updateMsg";
    }

    //修改信息
    @RequestMapping("/updateMsg")
    public String updateUser(Model model, Message message) {
        System.out.println(message);
        messageService.updateMsg(message);
        Message msg = messageService.findByBh(message.getXxbh());
        model.addAttribute("message",msg);
        return "redirect:/message/allMsg";
    }

    //删除信息
    @RequestMapping("/deleteMsg/{xxbh}")
    public String deleteMsg(@PathVariable("xxbh") int xxbh) {
        messageService.deleteMsg(xxbh);
        return "redirect:/message/allMsg";
    }

    //模糊查询信息标题
    @RequestMapping("/findOneMsg")
    public ModelAndView findOneMsg(String xxbt) {
        List<Message> list = messageService.findOneMsg(xxbt);
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("allMsg");
        return mv;
    }

}
