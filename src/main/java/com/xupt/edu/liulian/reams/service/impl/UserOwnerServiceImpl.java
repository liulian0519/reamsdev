package com.xupt.edu.liulian.reams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xupt.edu.liulian.reams.dto.UserOwnerTest;
import com.xupt.edu.liulian.reams.mapper.user_ownerMapper;
import com.xupt.edu.liulian.reams.service.UserOwnerService;
import com.xupt.edu.liulian.reams.dto.*;
import com.xupt.edu.liulian.reams.mapper.*;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserOwnerServiceImpl implements UserOwnerService {
    @Autowired
    user_ownerMapper user_ownerMapper;
    @Autowired
    GreenHouseMapper greenHouseMapper;

    @Override
    public PageInfo<UserOwnerTest> listByPage(Integer pageNum){
        Page p = PageHelper.startPage(pageNum,2);

        user_ownerExample user_ownerExample = new user_ownerExample();
        List<user_owner> user_owners = user_ownerMapper.selectByExample(user_ownerExample);

        GreenHouseExample greenHouseExample = new GreenHouseExample();
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        List<UserOwnerTest> userOwnerTests = new ArrayList<>();
        for(user_owner user_owner:user_owners){
            UserOwnerTest userOwnerTest = new UserOwnerTest();
            userOwnerTest.setId(user_owner.getId());
            userOwnerTest.setName(user_owner.getName());
            userOwnerTest.setAddress(user_owner.getAddress());
            userOwnerTest.setPhone(user_owner.getPhone());

            for(GreenHouse greenHouse:greenHouses){
                if(greenHouse.getId() == user_owner.getGreenHouse_id()){
                    userOwnerTest.setHouseName(greenHouse.getName());
                    userOwnerTest.setHouseAddress(greenHouse.getAddress());
                    userOwnerTest.setHouseAreaType(greenHouse.getArea_type());
                }
            }
            userOwnerTests.add(userOwnerTest);
        }
        PageInfo<UserOwnerTest> pageInfo = new PageInfo<>(userOwnerTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }

    @Override
    public PageInfo<UserOwnerTest> userByName(Integer pageNum,String name){
        Page p = PageHelper.startPage(pageNum,2);
        user_ownerExample user_ownerExample = new user_ownerExample();
        user_ownerExample.createCriteria().andNameLike(name);
        List<user_owner> user_owners = user_ownerMapper.selectByExample(user_ownerExample);

        GreenHouseExample greenHouseExample = new GreenHouseExample();
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        List<UserOwnerTest> userOwnerTests = new ArrayList<>();
        for(user_owner user_owner:user_owners){
            UserOwnerTest userOwnerTest = new UserOwnerTest();
            userOwnerTest.setId(user_owner.getId());
            userOwnerTest.setName(user_owner.getName());
            userOwnerTest.setAddress(user_owner.getAddress());
            userOwnerTest.setPhone(user_owner.getPhone());

            for(GreenHouse greenHouse:greenHouses){
                if(greenHouse.getId() == user_owner.getGreenHouse_id()){
                    userOwnerTest.setHouseName(greenHouse.getName());
                    userOwnerTest.setHouseAddress(greenHouse.getAddress());
                    userOwnerTest.setHouseAreaType(greenHouse.getArea_type());
                }
            }
            userOwnerTests.add(userOwnerTest);
        }
        PageInfo<UserOwnerTest> pageInfo = new PageInfo<>(userOwnerTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }

    @Override
    public void add(user_owner user_owner){
        user_ownerMapper.insert(user_owner);
    }

    @Override
    public void update(user_owner user_owner){
        user_ownerMapper.updateByPrimaryKeySelective(user_owner);
    }

    @Override
    public List<user_owner> listbyphone(String phone){
        user_ownerExample user_ownerExample = new user_ownerExample();
        user_ownerExample.createCriteria().andPhoneEqualTo(phone);
        return user_ownerMapper.selectByExample(user_ownerExample);
    }
}
