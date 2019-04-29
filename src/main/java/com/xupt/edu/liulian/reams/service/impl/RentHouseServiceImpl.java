package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.dto.PicTest;
import com.xupt.edu.liulian.reams.dto.Rent;
import com.xupt.edu.liulian.reams.dto.RentHouseTest;
import com.xupt.edu.liulian.reams.mapper.AgentMapper;
import com.xupt.edu.liulian.reams.mapper.CommunityMapper;
import com.xupt.edu.liulian.reams.mapper.PicMapper;
import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.service.RentHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RentHouseServiceImpl implements RentHouseService {
    @Autowired
    RentHouseMapper rentHouseMapper;
    @Autowired
    PicMapper picMapper;
    @Autowired
    CommunityMapper communityMapper;
    @Autowired
    AgentMapper agentMapper;

    @Override
    public List<RentHouse> list() {
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("id asc");
        return rentHouseMapper.selectByExample(rentHouseExample);
    }

    @Override
    public Rent selectByID(Integer rent_id) {
        RentHouse rentHouse = rentHouseMapper.selectByPrimaryKey(rent_id);

        CommunityExample communityExample = new CommunityExample();
        communityExample.createCriteria().andIdEqualTo(rentHouse.getCommunity_id());
        List<Community> communities = communityMapper.selectByExample(communityExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        List<PicTest> picTests = new ArrayList<>();
        PicTest picTest = new PicTest();
        List<String> urls = new ArrayList<>();

        for (Pic pic : pics) {
            if (pic.getRenthouse_id() == rent_id) {
                urls.add(pic.getImgurl());
            }
            picTest.setUrl(urls);
            picTest.setId(rent_id);
        }
        picTests.add(picTest);

        AgentExample agentExample = new AgentExample();
        agentExample.createCriteria().andTypeEqualTo(1);
        List<Agent> agents = agentMapper.selectByExample(agentExample);


        Rent rent = new Rent();
        rent.setRent(picTests, rentHouse,communities,agents);
        return rent;
    }

    @Override
    public Rent listByName(String name) {

        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.createCriteria().andNameLike("%" + name + "%");
        List<RentHouse> rentHouseList = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        List<PicTest> picTests = new ArrayList<>();
        for (RentHouse rentHouse : rentHouseList) {
            PicTest picTest = new PicTest();
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (rentHouse.getId() == pic.getRenthouse_id()) {
                    urls.add(pic.getImgurl());
                }
                picTest.setUrl(urls);
            }
            picTests.add(picTest);
        }


        Rent rent1 = new Rent();
        rent1.setRent(picTests, rentHouseList, rentHouseList.size());
        return rent1;

    }

    @Override
    public Rent sortByTime() {

        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("con_time asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

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
            rentHouseTest.setArea_type(rentHouse.getArea_type());
            rentHouseTest.setCon_time(rentHouse.getCon_time());
            rentHouseTest.setHeating(rentHouse.getHeating());
            rentHouseTest.setWifi(rentHouse.getWifi());
            List<String> urls = new ArrayList<>();
            for(Pic pic:pics){
                if(pic.getRenthouse_id()== rentHouse.getId()){
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }

        Rent rent = new Rent();
        rent.setTest(rentHouseTests,rentHouseTests.size());
        return rent;


    }

    @Override
    public Rent sortByPrice() {
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("price asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();

        List<RentHouseTest> rentHouseTests = new ArrayList<>();
        for (RentHouse rentHouse : rentHouses) {
            RentHouseTest rentHouseTest = new RentHouseTest();
            rentHouseTest.setId(rentHouse.getId());
            rentHouseTest.setName(rentHouse.getName());
            rentHouseTest.setAddress(rentHouse.getAddress());
            rentHouseTest.setPosition(rentHouse.getPosition());
            rentHouseTest.setRent_type(rentHouse.getRent_type());
            rentHouseTest.setType(rentHouse.getArea_type());
            rentHouseTest.setArea(rentHouse.getArea());
            rentHouseTest.setPrice(rentHouse.getPrice());
            rentHouseTest.setArea_type(rentHouse.getArea_type());
            rentHouseTest.setCon_time(rentHouse.getCon_time());
            rentHouseTest.setHeating(rentHouse.getHeating());
            rentHouseTest.setWifi(rentHouse.getWifi());

            picExample.createCriteria().andRenthouse_idEqualTo(rentHouse.getId());
            List<Pic> pics = picMapper.selectByExample(picExample);
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                urls.add(pic.getImgurl());
            }
            rentHouseTest.setUrl(urls);
            rentHouseTests.add(rentHouseTest);
        }
        Rent rent = new Rent();
        rent.setTest(rentHouseTests, rentHouseTests.size());
        return rent;
    }

    @Override
    public Rent sortByArea(){
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("area asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample =  new PicExample();
        List<RentHouseTest> rentHouseTests = new ArrayList<>();
        for (RentHouse rentHouse : rentHouses) {
            RentHouseTest rentHouseTest = new RentHouseTest();
            rentHouseTest.setId(rentHouse.getId());
            rentHouseTest.setName(rentHouse.getName());
            rentHouseTest.setAddress(rentHouse.getAddress());
            rentHouseTest.setPosition(rentHouse.getPosition());
            rentHouseTest.setRent_type(rentHouse.getRent_type());
            rentHouseTest.setType(rentHouse.getArea_type());
            rentHouseTest.setArea(rentHouse.getArea());
            rentHouseTest.setPrice(rentHouse.getPrice());
            rentHouseTest.setArea_type(rentHouse.getArea_type());
            rentHouseTest.setCon_time(rentHouse.getCon_time());
            rentHouseTest.setHeating(rentHouse.getHeating());
            rentHouseTest.setWifi(rentHouse.getWifi());

            picExample.createCriteria().andRenthouse_idEqualTo(rentHouse.getId());
            List<Pic> pics = picMapper.selectByExample(picExample);
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                urls.add(pic.getImgurl());
            }
            rentHouseTest.setUrl(urls);
            rentHouseTests.add(rentHouseTest);
        }

        Rent rent = new Rent();
        rent.setTest(rentHouseTests,rentHouseTests.size());
        return rent;

    }

    @Override
    public Rent sortByID(){
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("id asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample =  new PicExample();
        List<RentHouseTest> rentHouseTests = new ArrayList<>();
        for (RentHouse rentHouse : rentHouses) {
            RentHouseTest rentHouseTest = new RentHouseTest();
            rentHouseTest.setId(rentHouse.getId());
            rentHouseTest.setName(rentHouse.getName());
            rentHouseTest.setAddress(rentHouse.getAddress());
            rentHouseTest.setPosition(rentHouse.getPosition());
            rentHouseTest.setRent_type(rentHouse.getRent_type());
            rentHouseTest.setType(rentHouse.getArea_type());
            rentHouseTest.setArea(rentHouse.getArea());
            rentHouseTest.setPrice(rentHouse.getPrice());
            rentHouseTest.setArea_type(rentHouse.getArea_type());
            rentHouseTest.setCon_time(rentHouse.getCon_time());
            rentHouseTest.setHeating(rentHouse.getHeating());
            rentHouseTest.setWifi(rentHouse.getWifi());

            picExample.createCriteria().andRenthouse_idEqualTo(rentHouse.getId());
            List<Pic> pics = picMapper.selectByExample(picExample);
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                urls.add(pic.getImgurl());
            }
            rentHouseTest.setUrl(urls);
            rentHouseTests.add(rentHouseTest);
        }

        Rent rent = new Rent();
        rent.setTest(rentHouseTests,rentHouseTests.size());
        return rent;

    }

    @Override
    public List<RentHouse> listByPage(){
        RentHouseExample rentHouseExample = new RentHouseExample();
        return rentHouseMapper.selectByExample(rentHouseExample);
    }

}


