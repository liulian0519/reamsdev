package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.dto.New;
import com.xupt.edu.liulian.reams.dto.NewHouseTest;
import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.util.PageInfo;

import java.util.List;

public interface NewHouseService {
    List<NewHouse> list();
    New selectByID(Integer id);

    PageInfo<NewHouseTest> listByPage(Integer pageNum);
    PageInfo<NewHouseTest> listByPrice(Integer pageNum);

    NewHouseTest selectBySql(String address,String price,String heating,Integer status,String type);
    NewHouseTest listByName(String name);

}
