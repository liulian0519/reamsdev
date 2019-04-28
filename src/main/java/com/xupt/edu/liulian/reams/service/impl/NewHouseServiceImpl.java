package com.xupt.edu.liulian.reams.service.impl;

import com.xupt.edu.liulian.reams.dto.HouseTypeTest;
import com.xupt.edu.liulian.reams.dto.New;
import com.xupt.edu.liulian.reams.dto.PicTest;
import com.xupt.edu.liulian.reams.mapper.HouseTypeMapper;
import com.xupt.edu.liulian.reams.mapper.NewHouseMapper;
import com.xupt.edu.liulian.reams.mapper.PicMapper;
import com.xupt.edu.liulian.reams.pojo.*;
import com.xupt.edu.liulian.reams.service.NewHouseService;
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
        newtest.setNew(picTests,newHouse,houseTypeTests,houseTypeList);
        return newtest;
    }
}
