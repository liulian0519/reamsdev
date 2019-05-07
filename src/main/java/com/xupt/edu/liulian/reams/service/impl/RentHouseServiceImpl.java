package com.xupt.edu.liulian.reams.service.impl;

import com.github.pagehelper.PageHelper;
import com.xupt.edu.liulian.reams.dto.PicTest;
import com.xupt.edu.liulian.reams.dto.Rent;
import com.xupt.edu.liulian.reams.dto.RentHouseTest;
import com.xupt.edu.liulian.reams.mapper.AgentMapper;
import com.xupt.edu.liulian.reams.mapper.CommunityMapper;
import com.xupt.edu.liulian.reams.mapper.PicMapper;
import com.xupt.edu.liulian.reams.mapper.RentHouseMapper;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.service.RentHouseService;
import com.xupt.edu.liulian.reams.util.PageInfo;
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
        rent.setRent(picTests, rentHouse, communities, agents);
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

        List<RentHouseTest> rentHouseTests = new ArrayList<>();
        for (RentHouse rentHouse : rentHouseList) {
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
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }

        Rent rent = new Rent();
        rent.setTest(rentHouseTests, rentHouseTests.size());
        return rent;

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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }

        Rent rent = new Rent();
        rent.setTest(rentHouseTests, rentHouseTests.size());
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
    public Rent sortByArea() {
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("area asc");
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
    public Rent sortByID() {
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("id asc");
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
    public PageInfo<RentHouseTest> listByPage(Integer pageNum) {
        PageHelper.startPage(pageNum, 2);
        RentHouseExample rentHouseExample = new RentHouseExample();
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }
        PageInfo<RentHouseTest> pageInfo = new PageInfo<>(rentHouseTests);
        return pageInfo;
    }

    @Override
    public PageInfo<RentHouseTest> listByPageTime(Integer pageNum){
        PageHelper.startPage(pageNum, 2);
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("con_time desc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }
        PageInfo<RentHouseTest> pageInfo = new PageInfo<>(rentHouseTests);
        return pageInfo;
    }
    @Override
    public PageInfo<RentHouseTest> listByPagePrice(Integer pageNum){
        PageHelper.startPage(pageNum, 3);
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("price desc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }
        PageInfo<RentHouseTest> pageInfo = new PageInfo<>(rentHouseTests);
        return pageInfo;
    }
    @Override
    public PageInfo<RentHouseTest> listByPageArea(Integer pageNum){
        PageHelper.startPage(pageNum, 2);
        RentHouseExample rentHouseExample = new RentHouseExample();
        rentHouseExample.setOrderByClause("area asc");
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }
        PageInfo<RentHouseTest> pageInfo = new PageInfo<>(rentHouseTests);
        return pageInfo;
    }
    @Override
    public  Rent selectBySql(String address,Byte rent_type,String price,String area_type,String position){
        Integer instart;
        Integer inend;
        if(price.length()>0){
            System.out.println(price.length());
            String str = price;
            String[] strarray = str.split("-");
            String start="";
            String end="";
            for(int i = 0;i<strarray.length;i++){

                start = strarray[0];
                end = strarray[1];

            }
            instart= Integer.valueOf(start);
            inend = Integer.valueOf(end);
        }else{
             instart = 0;
             inend = 1000000000;
        }
        RentHouseExample rentHouseExample = new RentHouseExample();
        if(rent_type == 2){
            rentHouseExample.createCriteria().andAddressLike("%"+address+"%").andPriceBetween(instart,inend).andArea_typeLike("%"+ area_type+"%").andPositionLike("%"+position+"%");
        }else{
            rentHouseExample.createCriteria().andAddressLike("%"+address+"%").andRent_typeEqualTo(rent_type).andPriceBetween(instart,inend).andArea_typeLike("%"+ area_type+"%").andPositionLike("%"+position+"%");
        }

        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);
        }

        Rent rent = new Rent();
        rent.setTest(rentHouseTests, rentHouseTests.size());
        return rent;
    }

}


