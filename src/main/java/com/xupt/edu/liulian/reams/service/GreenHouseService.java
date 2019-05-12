package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.dto.Green;
import com.xupt.edu.liulian.reams.dto.GreenHouseTest;
import com.xupt.edu.liulian.reams.dto.House;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.util.PageInfo;

import java.util.List;

public interface GreenHouseService {
    House list();
    Green selectByID(Integer id);
    void add(GreenHouse greenHouse);
    PageInfo<GreenHouseTest> listByPage(Integer pageNum);
    PageInfo<GreenHouseTest> listByTime(Integer pageNum);
    PageInfo<GreenHouseTest> listByPrice(Integer pageNum);
    PageInfo<GreenHouseTest> listByArea(Integer pageNum);
    PageInfo<GreenHouseTest> selectBySql(Integer pageNum,String address,String area_type,String position,String build_use,Integer heating);

    Green listCount();

    Green listByName(String name);

    Green selectBySql(String address,String area_type,String position,String build_use,Integer heating);

    Green selectByPhone(String phone);







}
