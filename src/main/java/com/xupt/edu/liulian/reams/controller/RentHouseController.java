package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.RentHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouseExample;
import com.xupt.edu.liulian.reams.service.RentHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RentHouseController{
    @Autowired
    RentHouseService rentHouseService;
    @RequestMapping(value = "rentHouseList",method = RequestMethod.GET)
    @ResponseBody
    public List<RentHouse> list() throws Exception{
        List<RentHouse> rentHouse = rentHouseService.list();
        return rentHouse;
    }
}
