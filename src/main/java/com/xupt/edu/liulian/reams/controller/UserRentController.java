package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.pojo.user_rent;
import com.xupt.edu.liulian.reams.service.UserRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRentController {
    @Autowired
    UserRentService userRentService;

    @RequestMapping(value = "rentAdd",method = RequestMethod.POST)
    @ResponseBody
    public user_rent add(user_rent user_rent){
        userRentService.add(user_rent);
        return user_rent;
    }
}
