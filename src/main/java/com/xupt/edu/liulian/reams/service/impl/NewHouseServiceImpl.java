package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.NewHouseMapper;
import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.pojo.NewHouseExample;
import com.xupt.edu.liulian.reams.service.NewHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewHouseServiceImpl implements NewHouseService {
    @Autowired
    NewHouseMapper newHouseMapper;
    @Override
    public List<NewHouse> list(){
        NewHouseExample newHouseExample = new NewHouseExample();
        newHouseExample.setOrderByClause("id asc");
        return newHouseMapper.selectByExample(newHouseExample);
    }
}
