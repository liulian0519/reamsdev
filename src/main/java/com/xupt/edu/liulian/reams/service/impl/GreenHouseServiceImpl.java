package com.xupt.edu.liulian.reams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xupt.edu.liulian.reams.dto.*;
import com.xupt.edu.liulian.reams.mapper.*;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.service.GreenHouseService;
import com.xupt.edu.liulian.reams.util.PageInfo;
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
    @Autowired
    SaleOrderMapper saleOrderMapper;
    @Autowired
    PreOrderMapper preOrderMapper;
    @Autowired
    HouseTypeMapper houseTypeMapper;
    @Autowired
    BuildingMapper buildingMapper;
    @Override
    public House list() {
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.setOrderByClause("id asc");
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        List<test> tests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            test test = new test();
            test.setId(greenHouse.getId());
            test.setAddress(greenHouse.getAddress());
            test.setName(greenHouse.getName());
            test.setType(greenHouse.getArea_type());
            test.setArea(greenHouse.getArea());
            test.setPrice(greenHouse.getPrice());
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
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
        for (NewHouse newHouse : newHouses) {
            NewHouseTest newHouseTest = new NewHouseTest();
            newHouseTest.setId(newHouse.getId());
            newHouseTest.setName(newHouse.getName());
            newHouseTest.setPrice(newHouse.getPrice());
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getNewhouse_id() == newHouse.getId()) {
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
            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getRenthouse_id() == rentHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                rentHouseTest.setUrl(urls);
            }
            rentHouseTests.add(rentHouseTest);

        }


        House house = new House();
        house.setHouse(tests, newHouseTests, rentHouseTests);
        return house;
    }

    @Override
    public House orderByPhone(String phone){

        PreOrderExample preOrderExample = new PreOrderExample();
        preOrderExample.createCriteria().andPhoneEqualTo(phone);
        List<PreOrder> preOrders = preOrderMapper.selectByExample(preOrderExample);

        AgentExample agentExample = new AgentExample();
        agentExample.createCriteria().andPhoneEqualTo(phone);
        List<Agent> agents = agentMapper.selectByExample(agentExample);

        GreenHouseExample greenHouseExample = new GreenHouseExample();
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        NewHouseExample newHouseExample = new NewHouseExample();
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);

        RentHouseExample rentHouseExample = new RentHouseExample();
        List<RentHouse> rentHouses = rentHouseMapper.selectByExample(rentHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();
        communityExample.setOrderByClause("id asc");
        List<Community> communities = communityMapper.selectByExample(communityExample);

        BuildingExample buildingExample = new BuildingExample();
        List<Building> buildings = buildingMapper.selectByExample(buildingExample);

        HouseTypeExample houseTypeExample = new HouseTypeExample();
        List<HouseType> houseTypes = houseTypeMapper.selectByExample(houseTypeExample);

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        List<NewHouseTest> newHouseTests = new ArrayList<>();
        List<RentHouseTest> rentHouseTests = new ArrayList<>();

        for(PreOrder preOrder:preOrders){

            for(GreenHouse greenHouse:greenHouses){
                if(preOrder.getGreenhouse_id() == greenHouse.getId()){
                    GreenHouseTest greenHouseTest = new GreenHouseTest();

                    greenHouseTest.setOrder_time(preOrder.getOrder_time());
                    greenHouseTest.setId(greenHouse.getId());
                    greenHouseTest.setName(greenHouse.getName());
                    greenHouseTest.setExam(greenHouse.getExam());
                    greenHouseTest.setArea_type(greenHouse.getArea_type());
                    greenHouseTest.setPosition(greenHouse.getPosition());
                    greenHouseTest.setAddress(greenHouse.getAddress());
                    greenHouseTest.setFloor(greenHouse.getFloor());
                    greenHouseTest.setArea(greenHouse.getArea());
                    greenHouseTest.setPrice(greenHouse.getPrice());
                    greenHouseTest.setBuild_use(greenHouse.getBuild_use());
                    greenHouseTest.setCon_time(greenHouse.getCon_time());
                    for (Community community : communities) {
                        if(greenHouse.getCommunity_id() == community.getId()){
                            greenHouseTest.setBuild_time(community.getBuild_time());
                        }
                    }
                    List<String> urls = new ArrayList<>();
                    for (Pic pic : pics) {
                        if (pic.getGreenhouse_id() == greenHouse.getId()) {
                            urls.add(pic.getImgurl());
                        }
                        greenHouseTest.setUrl(urls);
                    }
                    greenHouseTests.add(greenHouseTest);

                }
            }
            for(NewHouse newHouse : newHouses){
                if(preOrder.getNewhouse_id() == newHouse.getId()){
                    NewHouseTest newHouseTest = new NewHouseTest();
                    newHouseTest.setOrder_time(preOrder.getOrder_time());
                    newHouseTest.setId(newHouse.getId());
                    newHouseTest.setName(newHouse.getName());
                    newHouseTest.setType(newHouse.getType());
                    newHouseTest.setAddress(newHouse.getAddress());
                    newHouseTest.setPrice(newHouse.getPrice());
                    newHouseTest.setStatus(newHouse.getStatus());
                    List<String> urls = new ArrayList<>();
                    for(Pic pic : pics){
                        if(pic.getNewhouse_id() == newHouse.getId()){
                            urls.add(pic.getImgurl());
                        }
                        newHouseTest.setUrl(urls);
                    }

                    List<String> typeUrls = new ArrayList<>();
                    List<String> areaTypes = new ArrayList<>();
                    for(HouseType houseType:houseTypes){
                        if(houseType.getBuilding_id()==newHouse.getBuilding_id()){
                            typeUrls.add(houseType.getHouse_img());
                            areaTypes.add(houseType.getArea_type());
                        }
                        newHouseTest.setTypeUrl(typeUrls);
                        newHouseTest.setArea_type(areaTypes);
                    }
                    newHouseTests.add(newHouseTest);
                }
            }
            for(RentHouse rentHouse:rentHouses){
                if(preOrder.getRenthouse_id() == rentHouse.getId()){
                    RentHouseTest rentHouseTest = new RentHouseTest();

                    rentHouseTest.setOrder_time(preOrder.getOrder_time());
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
                }



        }

        House house = new House();
        house.sete(greenHouseTests,newHouseTests,rentHouseTests,preOrders);
        return house;

    }
    @Override
    public Green selectByID(Integer green_id) {
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
        for (Pic pic : pics) {
            if (pic.getGreenhouse_id() == green_id) {
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
        green.setGreen(communities, greenHouse, picTests, agents);
        return green;

    }


    @Override
    public PageInfo<GreenHouseTest> listByPage(Integer pageNum) {
        Page p =PageHelper.startPage(pageNum, 2);
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.createCriteria().andExamNotEqualTo(0);
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            greenHouseTest.setCon_time(greenHouse.getCon_time());
            communityExample.createCriteria().andGreenHouse_idEqualTo(greenHouse.getId());
            List<Community> communities = communityMapper.selectByExample(communityExample);
            for (Community community : communities) {
                greenHouseTest.setBuild_time(community.getBuild_time());
            }

            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }

        PageInfo<GreenHouseTest> pageInfo = new PageInfo<>(greenHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }

    @Override
    public PageInfo<GreenHouseTest> listByTime(Integer pageNum){
        Page p =PageHelper.startPage(pageNum, 2);
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.setOrderByClause("con_time desc");
        greenHouseExample.createCriteria().andExamNotEqualTo(0);
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            greenHouseTest.setCon_time(greenHouse.getCon_time());
            communityExample.createCriteria().andGreenHouse_idEqualTo(greenHouse.getId());
            List<Community> communities = communityMapper.selectByExample(communityExample);
            for (Community community : communities) {
                greenHouseTest.setBuild_time(community.getBuild_time());
            }

            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }

        PageInfo<GreenHouseTest> pageInfo = new PageInfo<>(greenHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }

    @Override
    public PageInfo<GreenHouseTest> listByPrice(Integer pageNum){
        Page p =PageHelper.startPage(pageNum, 2);
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.setOrderByClause("price desc");
        greenHouseExample.createCriteria().andExamNotEqualTo(0);
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            greenHouseTest.setCon_time(greenHouse.getCon_time());
            communityExample.createCriteria().andGreenHouse_idEqualTo(greenHouse.getId());
            List<Community> communities = communityMapper.selectByExample(communityExample);
            for (Community community : communities) {
                greenHouseTest.setBuild_time(community.getBuild_time());
            }

            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }

        PageInfo<GreenHouseTest> pageInfo = new PageInfo<>(greenHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }

    @Override
    public PageInfo<GreenHouseTest> listByArea(Integer pageNum){
        Page p =PageHelper.startPage(pageNum, 2);
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.setOrderByClause("area asc");
        greenHouseExample.createCriteria().andExamNotEqualTo(0);
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            greenHouseTest.setCon_time(greenHouse.getCon_time());
            communityExample.createCriteria().andGreenHouse_idEqualTo(greenHouse.getId());
            List<Community> communities = communityMapper.selectByExample(communityExample);
            for (Community community : communities) {
                greenHouseTest.setBuild_time(community.getBuild_time());
            }

            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }

        PageInfo<GreenHouseTest> pageInfo = new PageInfo<>(greenHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }
    @Override
    public Green listCount(){
        GreenHouseExample greenHouseExample = new GreenHouseExample();
        greenHouseExample.createCriteria().andExamNotEqualTo(0);
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        Green green = new Green();
        green.setGreen(greenHouses,greenHouses.size());
        return green;
    }
    @Override
    public PageInfo<GreenHouseTest> selectBySql(Integer pageNum,String address,String area_type,String position,String build_use,Integer heating){
        Page p = PageHelper.startPage(pageNum, 2);
        GreenHouseExample greenHouseExample = new GreenHouseExample();

        if(heating == 2){
            greenHouseExample.createCriteria().andExamNotEqualTo(0).andAddressLike("%"+address+"%").andArea_typeLike("%"+ area_type+"%").andPositionLike("%"+position+"%").andBuild_useLike("%"+build_use+"%");
        }else{
            greenHouseExample.createCriteria().andExamNotEqualTo(0).andAddressLike("%"+address+"%").andArea_typeLike("%"+ area_type+"%").andPositionLike("%"+position+"%").andBuild_useLike("%"+build_use+"%").andHeatingEqualTo(heating);
        }

        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            communityExample.createCriteria().andGreenHouse_idEqualTo(greenHouse.getId());
            List<Community> communities = communityMapper.selectByExample(communityExample);
            for (Community community : communities) {
                greenHouseTest.setBuild_time(community.getBuild_time());
            }

            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }
        PageInfo<GreenHouseTest> pageInfo = new PageInfo<>(greenHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }

    @Override
    public Green selectBySql(String address,String area_type,String position,String build_use,Integer heating){
        GreenHouseExample greenHouseExample = new GreenHouseExample();

        if(heating == 2){
            greenHouseExample.createCriteria().andExamNotEqualTo(0).andAddressLike("%"+address+"%").andArea_typeLike("%"+ area_type+"%").andPositionLike("%"+position+"%").andBuild_useLike("%"+build_use+"%");
        }else{
            greenHouseExample.createCriteria().andExamNotEqualTo(0).andAddressLike("%"+address+"%").andArea_typeLike("%"+ area_type+"%").andPositionLike("%"+position+"%").andBuild_useLike("%"+build_use+"%").andHeatingEqualTo(heating);
        }

        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();
        communityExample.setOrderByClause("id asc");
        List<Community> communities = communityMapper.selectByExample(communityExample);

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            greenHouseTest.setCon_time(greenHouse.getCon_time());
            for (Community community : communities) {
                if(greenHouse.getCommunity_id() == community.getId()){
                    greenHouseTest.setBuild_time(community.getBuild_time());
                }
//                if(community.getGreenHouse_id() == greenHouse.getId()){
//                    greenHouseTest.setBuild_time(community.getBuild_time());
//                }
            }


            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }
        Green green = new Green();
        green.setTest(greenHouseTests,greenHouseTests.size());
        return green;
    }

    @Override
    public Green listByName(String name){
        GreenHouseExample greenHouseExample = new GreenHouseExample();

        greenHouseExample.createCriteria().andExamNotEqualTo(0).andNameLike("%"+ name +"%");
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();
        List<Community> communities = communityMapper.selectByExample(communityExample);
        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for (GreenHouse greenHouse : greenHouses) {
            GreenHouseTest greenHouseTest = new GreenHouseTest();
            greenHouseTest.setId(greenHouse.getId());
            greenHouseTest.setName(greenHouse.getName());
            greenHouseTest.setArea_type(greenHouse.getArea_type());
            greenHouseTest.setPosition(greenHouse.getPosition());
            greenHouseTest.setAddress(greenHouse.getAddress());
            greenHouseTest.setFloor(greenHouse.getFloor());
            greenHouseTest.setArea(greenHouse.getArea());
            greenHouseTest.setPrice(greenHouse.getPrice());
            greenHouseTest.setBuild_use(greenHouse.getBuild_use());
            greenHouseTest.setCon_time(greenHouse.getCon_time());
            communityExample.createCriteria().andGreenHouse_idEqualTo(greenHouse.getId());

            for (Community community : communities) {
                if(greenHouse.getCommunity_id() == community.getId()){
                    greenHouseTest.setBuild_time(community.getBuild_time());
                }
//                if(community.getGreenHouse_id() == greenHouse.getId()){
//                    greenHouseTest.setBuild_time(community.getBuild_time());
//                }
            }

            List<String> urls = new ArrayList<>();
            for (Pic pic : pics) {
                if (pic.getGreenhouse_id() == greenHouse.getId()) {
                    urls.add(pic.getImgurl());
                }
                greenHouseTest.setUrl(urls);
            }
            greenHouseTests.add(greenHouseTest);
        }

        Green green = new Green();
        green.setTest(greenHouseTests,greenHouseTests.size());
        return green;
    }

    @Override
    public void add(GreenHouse greenHouse) {
        greenHouseMapper.insert(greenHouse);
    }

    @Override
    public Green selectByPhone(String phone){

        SaleOrderExample saleOrderExample = new SaleOrderExample();
        saleOrderExample.createCriteria().andPhoneEqualTo(phone);
        List<SaleOrder> saleOrderList = saleOrderMapper.selectByExample(saleOrderExample);

        AgentExample agentExample = new AgentExample();
        agentExample.createCriteria().andPhoneEqualTo(phone);
        List<Agent> agents = agentMapper.selectByExample(agentExample);

        GreenHouseExample greenHouseExample = new GreenHouseExample();
        List<GreenHouse> greenHouses = greenHouseMapper.selectByExample(greenHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        CommunityExample communityExample = new CommunityExample();
        communityExample.setOrderByClause("id asc");
        List<Community> communities = communityMapper.selectByExample(communityExample);

        List<GreenHouseTest> greenHouseTests = new ArrayList<>();
        for(SaleOrder saleOrder:saleOrderList){

            for(GreenHouse greenHouse:greenHouses){
                if(saleOrder.getGreenhouse_id() == greenHouse.getId()){
                    GreenHouseTest greenHouseTest = new GreenHouseTest();
                    greenHouseTest.setId(greenHouse.getId());
                    greenHouseTest.setName(greenHouse.getName());
                    greenHouseTest.setExam(greenHouse.getExam());
                    greenHouseTest.setArea_type(greenHouse.getArea_type());
                    greenHouseTest.setPosition(greenHouse.getPosition());
                    greenHouseTest.setAddress(greenHouse.getAddress());
                    greenHouseTest.setFloor(greenHouse.getFloor());
                    greenHouseTest.setArea(greenHouse.getArea());
                    greenHouseTest.setPrice(greenHouse.getPrice());
                    greenHouseTest.setBuild_use(greenHouse.getBuild_use());
                    greenHouseTest.setCon_time(greenHouse.getCon_time());
                    for (Community community : communities) {
                        if(greenHouse.getCommunity_id() == community.getId()){
                            greenHouseTest.setBuild_time(community.getBuild_time());
                        }
                    }
                    List<String> urls = new ArrayList<>();
                    for (Pic pic : pics) {
                        if (pic.getGreenhouse_id() == greenHouse.getId()) {
                            urls.add(pic.getImgurl());
                        }
                        greenHouseTest.setUrl(urls);
                    }
                    greenHouseTests.add(greenHouseTest);
                    
                }
            }
        }
        Green green = new Green();
        green.setTest(greenHouseTests,agents,greenHouseTests.size());
        return green;
    }
}
