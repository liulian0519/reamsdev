package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.dto.*;
import com.xupt.edu.liulian.reams.mapper.*;
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
    @Autowired
    PicMapper picMapper;
    @Autowired
    CommunityMapper communityMapper;
    @Autowired
    AgentMapper agentMapper;

    @Override
    public House list(){
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.setOrderByClause("id asc");
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        List<test> tests=new ArrayList<>();
        for(GreenHouse greenHouse:greenHouses){
            test test=new test();
            test.setId(greenHouse.getId());
            test.setAddress(greenHouse.getAddress());
            test.setName(greenHouse.getName());
            test.setType(greenHouse.getArea_type());
            test.setArea(greenHouse.getArea());
            test.setPrice(greenHouse.getPrice());
            List<String> urls = new ArrayList<>();
            for(Pic pic:pics){
                if(pic.getGreenhouse_id() == greenHouse.getId()){
                    urls.add(pic.getImgurl());
                }
                test.setUrl(urls);
            }
            tests.add(test);
        }


        NewHouseExample newHouseExample = new NewHouseExample();
        newHouseExample.setOrderByClause("id asc");
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);

        List<NewHouseTest> newHouseTests = new ArrayList<>();
        for(NewHouse newHouse:newHouses){
            NewHouseTest newHouseTest = new NewHouseTest();
            newHouseTest.setId(newHouse.getId());
            newHouseTest.setName(newHouse.getName());
            newHouseTest.setPrice(newHouse.getPrice());
            List<String> urls = new ArrayList<>();
            for(Pic pic:pics){
                if(pic.getNewhouse_id() == newHouse.getId()){
                    urls.add(pic.getImgurl());
                }
                newHouseTest.setUrl(urls);
            }
            newHouseTests.add(newHouseTest);

        }

        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("id asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        List<RentHouseTest> rentHouseTests = new ArrayList<>();
        for(RentHouse rentHouse:rentHouses){
            RentHouseTest rentHouseTest = new RentHouseTest();
            rentHouseTest.setId(rentHouse.getId());
            rentHouseTest.setName(rentHouse.getName());
            rentHouseTest.setAddress(rentHouse.getAddress());
            rentHouseTest.setPosition(rentHouse.getPosition());
            rentHouseTest.setRent_type(rentHouse.getRent_type());
            rentHouseTest.setType(rentHouse.getArea_type());
            rentHouseTest.setArea(rentHouse.getArea());
            rentHouseTest.setPrice(rentHouse.getPrice());
            List<String> urls = new ArrayList<>();
            for(Pic pic:pics){
                if(pic.getRenthouse_id()== rentHouse.getId()){
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);

        }


        House house=new House();
        house.setHouse(tests,newHouseTests,rentHouseTests);
        return house;
    }

    @Override
    public Green selectByID(Integer green_id){
        GreenHouse greenHouse = greenHouseMapper.selectByPrimaryKey(green_id);


        CommunityExample communityExample = new CommunityExample();
        communityExample.createCriteria().andIdEqualTo(greenHouse.getCommunity_id());
        List<Community> communities = communityMapper.selectByExample(communityExample);


        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        List<PicTest> picTests = new ArrayList<>();
        PicTest picTest = new PicTest();
        List<String> urls = new ArrayList<>();
        for(Pic pic:pics){
            if(pic.getGreenhouse_id() == green_id){
                urls.add(pic.getImgurl());
            }
            picTest.setId(green_id);
            picTest.setUrl(urls);
        }
        picTests.add(picTest);

        AgentExample agentExample = new AgentExample();
        agentExample.createCriteria().andTypeEqualTo(1);
        List<Agent> agents = agentMapper.selectByExample(agentExample);


        Green green = new Green();
        green.setGreen(communities,greenHouse,picTests,agents);
        return green;

    }

    @Override
    public void add(GreenHouse greenHouse){
        greenHouseMapper.insert(greenHouse);
    }



}
