package com.xupt.edu.liulian.reams.service;

import com.xupt.edu.liulian.reams.dto.New;
import com.xupt.edu.liulian.reams.pojo.NewHouse;

import java.util.List;

public interface NewHouseService {
    List<NewHouse> list();
    New selectByID(Integer id);
}