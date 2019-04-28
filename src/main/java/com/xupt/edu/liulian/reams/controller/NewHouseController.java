package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.dto.New;
import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.service.NewHouseService;
import jdk.nashorn.internal.runtime.ECMAException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class NewHouseController {
    @Autowired
    NewHouseService newHouseService;
    @RequestMapping(value = "newHouseList",method = RequestMethod.GET)
    @ResponseBody
    public List<NewHouse> list() throws Exception{
        List<NewHouse> newHouse = newHouseService.list();
        return newHouse;
    }

    @RequestMapping(value = "newHouseById",method = RequestMethod.POST)
    @ResponseBody
    public New selectByKey(Integer new_id){
        New newtest = newHouseService.selectByID(new_id);
        return newtest;
    }
}
