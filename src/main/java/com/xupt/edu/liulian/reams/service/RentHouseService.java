package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.dto.Rent;
import com.xupt.edu.liulian.reams.dto.RentHouseTest;
import com.xupt.edu.liulian.reams.pojo.RentHouse;
import com.xupt.edu.liulian.reams.util.PageInfo;

import java.util.Date;
import java.util.List;

public interface RentHouseService {
    List<RentHouse> list();

    PageInfo<RentHouseTest> listByPage(Integer pageNum);
    PageInfo<RentHouseTest> listByPageTime(Integer pagNum);
    PageInfo<RentHouseTest> listByPagePrice(Integer pagNum);
    PageInfo<RentHouseTest> listByPageArea(Integer pagNum);

    Rent selectByID(Integer id);

    Rent listByName(String name);

    Rent sortByTime();

    Rent sortByPrice();

    Rent sortByArea();

    Rent sortByID();

    Rent selectBySql(String address,Byte rent_type,String price,String area_type,String position);

    Rent listByExam();


}
