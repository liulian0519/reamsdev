package com.xupt.edu.liulian.reams.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xupt.edu.liulian.reams.dto.HouseTypeTest;
import com.xupt.edu.liulian.reams.dto.New;
import com.xupt.edu.liulian.reams.dto.NewHouseTest;
import com.xupt.edu.liulian.reams.dto.PicTest;
import com.xupt.edu.liulian.reams.mapper.*;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.service.NewHouseService;
import com.xupt.edu.liulian.reams.util.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewHouseServiceImpl implements NewHouseService {
    @Autowired
    NewHouseMapper newHouseMapper;
    @Autowired
    PicMapper picMapper;
    @Autowired
    HouseTypeMapper houseTypeMapper;
    @Autowired
    BuildingMapper buildingMapper;
    @Autowired
    AgentMapper agentMapper;
    @Override
    public List<NewHouse> list(){
        NewHouseExample newHouseExample = new NewHouseExample();
        newHouseExample.setOrderByClause("id asc");
        return newHouseMapper.selectByExample(newHouseExample);
    }
    @Override
    public New selectByID(Integer new_id){
        NewHouse newHouse = newHouseMapper.selectByPrimaryKey(new_id);

        HouseTypeExample houseTypeExample = new HouseTypeExample();
        houseTypeExample.setOrderByClause("id asc");
        List<HouseType> houseTypes = houseTypeMapper.selectByExample(houseTypeExample);

        BuildingExample buildingExample = new BuildingExample();
        buildingExample.createCriteria().andIdEqualTo(new_id);
        List<Building> buildings = buildingMapper.selectByExample(buildingExample);

        AgentExample agentExample = new AgentExample();
        agentExample.createCriteria().andTypeEqualTo(1);
        List<Agent> agents = agentMapper.selectByExample(agentExample);

        HouseTypeExample houseTypeExample1 = new HouseTypeExample();
        houseTypeExample1.createCriteria().andBuilding_idEqualTo(new_id);
        List<HouseType> houseTypeList = houseTypeMapper.selectByExample(houseTypeExample1);


        List<HouseTypeTest> houseTypeTests = new ArrayList<>();
        HouseTypeTest houseTypeTest = new HouseTypeTest();
        List<String > typeurls = new ArrayList<>();

        for(HouseType houseType:houseTypes){
            if(houseType.getBuilding_id() == new_id){
                typeurls.add(houseType.getHouse_img());
            }
            houseTypeTest.setUrl(typeurls);

        }
        houseTypeTests.add(houseTypeTest);


        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        List<PicTest> picTests = new ArrayList<>();
        PicTest picTest = new PicTest();
        List<String> urls = new ArrayList<>();
        for(Pic pic:pics){
            if(pic.getNewhouse_id() == new_id){
                urls.add(pic.getImgurl());
            }
            picTest.setUrl(urls);
            picTest.setId(new_id);
        }
        picTests.add(picTest);


        New newtest = new New();
        newtest.setNew(picTests,newHouse,houseTypeTests,houseTypeList,buildings,agents);
        return newtest;
    }
    @Override
    public PageInfo<NewHouseTest> listByPage(Integer pageNum){
        Page p = PageHelper.startPage(pageNum,2);

        NewHouseExample newHouseExample = new NewHouseExample();
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        BuildingExample buildingExample = new BuildingExample();
        List<Building> buildings = buildingMapper.selectByExample(buildingExample);

        HouseTypeExample houseTypeExample = new HouseTypeExample();
        List<HouseType> houseTypes = houseTypeMapper.selectByExample(houseTypeExample);

        List<NewHouseTest> newHouseTests = new ArrayList<>();
        for(NewHouse newHouse:newHouses){
            NewHouseTest newHouseTest = new NewHouseTest();
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

        PageInfo<NewHouseTest> pageInfo = new PageInfo<>(newHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;



    }
    @Override
    public PageInfo<NewHouseTest> listByPrice(Integer pageNum){
        Page p = PageHelper.startPage(pageNum,2);

        NewHouseExample newHouseExample = new NewHouseExample();
        newHouseExample.setOrderByClause("price desc");
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        BuildingExample buildingExample = new BuildingExample();
        List<Building> buildings = buildingMapper.selectByExample(buildingExample);

        HouseTypeExample houseTypeExample = new HouseTypeExample();
        List<HouseType> houseTypes = houseTypeMapper.selectByExample(houseTypeExample);

        List<NewHouseTest> newHouseTests = new ArrayList<>();
        for(NewHouse newHouse:newHouses){
            NewHouseTest newHouseTest = new NewHouseTest();
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

        PageInfo<NewHouseTest> pageInfo = new PageInfo<>(newHouseTests);
        pageInfo.setTotal(p.getTotal());
        pageInfo.setPageNum(p.getPageNum());
        pageInfo.setPages(p.getPages());
        return pageInfo;
    }
    @Override
    public  NewHouseTest selectBySql(String address,String price,String heating,Integer status,String type){
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
        NewHouseExample newHouseExample = new NewHouseExample();
        if(status == 3){
            newHouseExample.createCriteria().andAddressLike("%"+address+"%").andPriceBetween(instart,inend).andHeatingLike("%"+heating+"%").andTypeLike("%"+type+"%");
        }else{
            newHouseExample.createCriteria().andAddressLike("%"+address+"%").andPriceBetween(instart,inend).andHeatingLike("%"+heating+"%").andStatusEqualTo(status).andTypeLike("%"+type+"%");
        }
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);
        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        BuildingExample buildingExample = new BuildingExample();
        List<Building> buildings = buildingMapper.selectByExample(buildingExample);

        HouseTypeExample houseTypeExample = new HouseTypeExample();
        List<HouseType> houseTypes = houseTypeMapper.selectByExample(houseTypeExample);

        List<NewHouseTest> newHouseTests = new ArrayList<>();
        for(NewHouse newHouse:newHouses){
            NewHouseTest newHouseTest = new NewHouseTest();
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
        NewHouseTest newHouseTest = new NewHouseTest();
        newHouseTest.setTest(newHouseTests);
        return newHouseTest;

    }

    @Override
    public NewHouseTest listByName(String name){
        NewHouseExample newHouseExample = new NewHouseExample();
        newHouseExample.createCriteria().andNameLike("%"+name+"%");
        List<NewHouse> newHouses = newHouseMapper.selectByExample(newHouseExample);

        PicExample picExample = new PicExample();
        picExample.setOrderByClause("id asc");
        List<Pic> pics = picMapper.selectByExample(picExample);

        BuildingExample buildingExample = new BuildingExample();
        List<Building> buildings = buildingMapper.selectByExample(buildingExample);

        HouseTypeExample houseTypeExample = new HouseTypeExample();
        List<HouseType> houseTypes = houseTypeMapper.selectByExample(houseTypeExample);

        List<NewHouseTest> newHouseTests = new ArrayList<>();
        for(NewHouse newHouse:newHouses){
            NewHouseTest newHouseTest = new NewHouseTest();
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
        NewHouseTest newHouseTest = new NewHouseTest();
        newHouseTest.setTest(newHouseTests);
        return newHouseTest;
    }
}
