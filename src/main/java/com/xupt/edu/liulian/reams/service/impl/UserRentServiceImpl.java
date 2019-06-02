package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.mapper.user_rentMapper;
import com.xupt.edu.liulian.reams.pojo.user_rent;
import com.xupt.edu.liulian.reams.service.UserRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRentServiceImpl implements UserRentService {
    @Autowired
    user_rentMapper userRentMapper;
    public void add(user_rent user_rent){
        userRentMapper.insert(user_rent);
    }

}
