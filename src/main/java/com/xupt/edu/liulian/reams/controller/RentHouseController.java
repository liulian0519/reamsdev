package com.xupt.edu.liulian.reams.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.xupt.edu.liulian.reams.dto.Rent;
import com.xupt.edu.liulian.reams.dto.RentHouseTest;
import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.RentHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouseExample;
import com.xupt.edu.liulian.reams.service.RentHouseService;
import com.xupt.edu.liulian.reams.util.PageInfo;
import com.xupt.edu.liulian.reams.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller
public class RentHouseController {
    @Autowired
    RentHouseService rentHouseService;

    @RequestMapping(value = "rentHouseList", method = RequestMethod.GET)
    @ResponseBody
    public List<RentHouse> list() throws Exception {
        List<RentHouse> rentHouse = rentHouseService.list();
        return rentHouse;
    }

    @RequestMapping(value = "rentHouseById", method = RequestMethod.POST)
    @ResponseBody
    public Rent selectByKey(Integer rent_id) {
        Rent rent = rentHouseService.selectByID(rent_id);
        return rent;
    }

    @RequestMapping(value = "rentHouseByName", method = RequestMethod.POST)
    @ResponseBody
    public Rent list(@RequestParam("name") String name) {
        Rent rent = rentHouseService.listByName(name);
        return rent;
    }

    @RequestMapping(value = "rentHouseSortByConTime", method = RequestMethod.GET)
    @ResponseBody
    public Rent sortByTime() {
        Rent rentHouseTest = rentHouseService.sortByTime();
        return rentHouseTest;
    }

    @RequestMapping(value = "rentHouseSortByPrice", method = RequestMethod.GET)
    @ResponseBody
    public Rent sortByPrice() {
        Rent rentHouseTest = rentHouseService.sortByPrice();
        return rentHouseTest;
    }

    @RequestMapping(value = "rentHouseSortByArea", method = RequestMethod.GET)
    @ResponseBody
    public Rent sortByArea() {

        Rent rent = rentHouseService.sortByArea();
        return rent;
    }

    @RequestMapping(value = "rentHouseSortByID", method = RequestMethod.GET)
    @ResponseBody
    public Rent sortByID() {

        Rent rent = rentHouseService.sortByID();
        return rent;
    }

    @RequestMapping(value = "rentHouseByPage", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<RentHouseTest> list(@RequestParam("pageNum") Integer pageNum) {
        PageInfo<RentHouseTest> pageInfo = rentHouseService.listByPage(pageNum);
        return pageInfo;
    }

    @RequestMapping(value = "rentHouseByTime", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<RentHouseTest> listone(@RequestParam("pageNum") Integer pageNum) {
        PageInfo<RentHouseTest> pageInfo = rentHouseService.listByPageTime(pageNum);
        return pageInfo;
    }
    @RequestMapping(value = "rentHouseByPrice", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<RentHouseTest> listtwo(@RequestParam("pageNum") Integer pageNum) {
        PageInfo<RentHouseTest> pageInfo = rentHouseService.listByPagePrice(pageNum);
        return pageInfo;
    }
    @RequestMapping(value = "rentHouseByArea", method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<RentHouseTest> listThree(@RequestParam("pageNum") Integer pageNum) {
        PageInfo<RentHouseTest> pageInfo = rentHouseService.listByPageArea(pageNum);
        return pageInfo;
    }
    @RequestMapping(value = "renthouseBySql", method = RequestMethod.POST)
    @ResponseBody
    public Rent selectBySql(@RequestParam("address") String address,
                            @RequestParam("rent_type") Byte rent_type,
                            @RequestParam("price") String price,
                            @RequestParam("area") String area_type,
                            @RequestParam("position") String position) {
        Rent rent = rentHouseService.selectBySql(address,rent_type,price,area_type,position);
        return rent;


    }


}
