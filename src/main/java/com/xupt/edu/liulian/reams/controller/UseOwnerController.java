package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.dto.UserOwnerTest;
import com.xupt.edu.liulian.reams.pojo.user_owner;
import com.xupt.edu.liulian.reams.service.UserOwnerService;
import com.xupt.edu.liulian.reams.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UseOwnerController {
    @Autowired
    UserOwnerService userOwnerService;

    @RequestMapping(value="userByPage",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<UserOwnerTest> listByPage(@RequestParam("pageNum") Integer pageNum){
        PageInfo<UserOwnerTest> pageInfo = userOwnerService.listByPage(pageNum);
        return pageInfo;
    }
    @RequestMapping(value="userByName",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<UserOwnerTest> useByName(@RequestParam("pageNum") Integer pageNum,@RequestParam("name") String name){
        PageInfo<UserOwnerTest> pageInfo = userOwnerService.userByName(pageNum,name);
        return pageInfo;
    }
    @RequestMapping(value = "userAdd",method = RequestMethod.POST)
    @ResponseBody
    public user_owner add(user_owner user_owner){
        userOwnerService.add(user_owner);
        return user_owner;
    }
    @RequestMapping(value = "userUpdate",method = RequestMethod.POST)
    @ResponseBody
    public user_owner update(user_owner user_owner){
        userOwnerService.update(user_owner);
        return user_owner;
    }
    @RequestMapping(value = "userByPhone",method = RequestMethod.POST)
    @ResponseBody
    public List<user_owner> listByPhone(@RequestParam("phone") String phone){
        List<user_owner> user_owners = userOwnerService.listbyphone(phone);
        return user_owners;
    }
}
