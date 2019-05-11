package com.xupt.edu.liulian.reams.controller;

import com.xupt.edu.liulian.reams.dto.New;
import com.xupt.edu.liulian.reams.dto.NewHouseTest;
import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.service.NewHouseService;
import com.xupt.edu.liulian.reams.util.PageInfo;
import jdk.nashorn.internal.runtime.ECMAException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "newHouseByPage",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<NewHouseTest> listByPage(@RequestParam("pageNum")Integer pageNum){
        PageInfo<NewHouseTest> pageInfo = newHouseService.listByPage(pageNum);
        return pageInfo;
    }
    @RequestMapping(value = "newHouseByPrice",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<NewHouseTest> listByPrice(@RequestParam("pageNum")Integer pageNum){
        PageInfo<NewHouseTest> pageInfo = newHouseService.listByPrice(pageNum);
        return pageInfo;
    }
    @RequestMapping(value = "newHouseBySql",method = RequestMethod.POST)
    @ResponseBody
    public NewHouseTest selectBySql(@RequestParam("address") String address,
                                    @RequestParam("price") String price,
                                    @RequestParam("heating") String heating,
                                    @RequestParam("status") Integer status,
                                    @RequestParam("type") String type){
        NewHouseTest newHouseTest = newHouseService.selectBySql(address,price,heating,status,type);
        return newHouseTest;
    }
    @RequestMapping(value = "newHouseByName",method = RequestMethod.POST)
    @ResponseBody
    public NewHouseTest selectByName(@RequestParam("name") String name){
        NewHouseTest newHouseTest = newHouseService.listByName(name);
        return newHouseTest;
    }
}
