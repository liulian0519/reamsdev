package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.RentHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouseExample;
import com.xupt.edu.liulian.reams.service.RentHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentHouseServiceImpl implements RentHouseService {
    @Autowired
    RentHouseMapper rentHouseMapper;
    @Override
    public List<RentHouse> list(){
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("id asc");
        return rentHouseMapper.selectByExample(rentHouseExample);
    }
}
