package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.dto.Green;
import com.xupt.edu.liulian.reams.dto.House;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;

import java.util.List;

public interface GreenHouseService {
    House list();
    Green selectByID(Integer id);
    void add(GreenHouse greenHouse);


}
