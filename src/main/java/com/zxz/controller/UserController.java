package com.zxz.controller;

import com.zxz.pojo.User;
import com.zxz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //Controller调用Service层
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    //正常访问login页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //表单提交过来的路径
    @RequestMapping("/checkLogin")
    public String checkLogin(User user,Model model){
        //调用service方法
        //User = userServivce.checkLogin(user.getTel(), user.getPsd());
        User u = userService.checkLogin(user.getTel(), user.getPsd());
        //若有User则添加到model里并且跳转到成功页面
        if(u != null){
            model.addAttribute("u",u);
            return "success";
        }
        return "fail";
    }

    //测试超链接跳转到另一个页面是否可以取到session值
    @RequestMapping("/anotherpage")
    public String hrefpage(){
        return "anotherpage";
    }

    //注销方法
    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
        return "login";
    }

    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }

    @RequestMapping("/doRegist")
    public String doRegist(User user,Model model){
        System.out.println(user.getTel());
        userService.Regist(user);
        return "success";
    }




    //查询全部用户并返回allUser页面
    @RequestMapping("/allUser")
    public String queryAllUser(Model model) {
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        return "allUser";
    }

    //跳转到增加用户页面
    @RequestMapping("/toAddUser")
    public String toAddUser() {
        return "addUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {
        System.out.println(user);
        userService.addUser(user);
        //重定向到@RequestMapping("/allUser")请求
        return "redirect:/user/allUser";
    }

    //跳转到修改信息页面
    @RequestMapping("/toUpdateUser")
    public String toUpdateUser(Model model, Integer uid) {
        User user = userService.findByUid(uid);
        System.out.println(user);
        model.addAttribute("user", user);
        return "updateUser";
    }

    //修改用户信息
    @RequestMapping("/updateUser")
    public String updateUser(Model model, User user) {
        System.out.println(user);
        userService.updateUser(user);
        User user1 = userService.findByUid(user.getUid());
        model.addAttribute("user",user1);
        return "redirect:/user/allUser";
    }

    //删除用户
    @RequestMapping("/del/{uid}")
    public String deleteUser(@PathVariable("uid") int uid) {
        userService.deleteUser(uid);
        return "redirect:/user/allUser";
    }

    //模糊查询用户
    @RequestMapping("/findByName")
    public ModelAndView findByName(String uname) {
        List<User> list = userService.findByName(uname);
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("allUser");
        return mv;
    }

}
