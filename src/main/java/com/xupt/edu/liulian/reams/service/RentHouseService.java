package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.dto.Rent;
import com.xupt.edu.liulian.reams.dto.RentHouseTest;
import com.xupt.edu.liulian.reams.pojo.RentHouse;

import java.util.Date;
import java.util.List;

public interface RentHouseService {
    List<RentHouse> list();
    Rent selectByID(Integer id);
    Rent listByName(String name);
    Rent sortByTime();
    Rent sortByPrice();

}
