package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.dto.House;
import com.xupt.edu.liulian.reams.dto.test;
import com.xupt.edu.liulian.reams.mapper.GreenHouseMapper;
import com.xupt.edu.liulian.reams.mapper.NewHouseMapper;
import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.service.GreenHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreenHouseServiceImpl implements GreenHouseService {
    @Autowired
    GreenHouseMapper greenHouseMapper;
    @Autowired
    NewHouseMapper newHouseMapper;
    @Autowired
    RentHouseMapper rentHouseMapper;
    @Override
    public House list(){
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.setOrderByClause("id asc");
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);
        List<test> tests=new ArrayList<>();
        for(GreenHouse greenHouse:greenHouses){
            test test=new test();
            test.setId(greenHouse.getId());
            tests.add(test);
        }
//        for(test test:tests){
//            System.out.println(test);
//        }

        NewHouseExample newHouseExample = new NewHouseExample();
        newHouseExample.setOrderByClause("id asc");
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);

        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("id asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        House house=new House();
        house.setHouse(greenHouses,newHouses,rentHouses);
        return house;
    }
}
