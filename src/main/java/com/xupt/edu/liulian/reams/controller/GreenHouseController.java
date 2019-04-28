package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.dto.Green;
import com.xupt.edu.liulian.reams.dto.House;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.service.GreenHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GreenHouseController {
    @Autowired
    GreenHouseService greenHouseService;
    @RequestMapping(value = "list" ,method = RequestMethod.GET)
    @ResponseBody
    public House list() {
        House list = greenHouseService.list();
        return list;
    }

    @RequestMapping(value = "greenHouseById",method = RequestMethod.POST)
    @ResponseBody
    public Green selectByID(Integer green_id){
        Green green = greenHouseService.selectByID(green_id);
        return green;
    }

}

