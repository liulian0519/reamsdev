package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.HouseType;
import com.xupt.edu.liulian.reams.pojo.NewHouse;

import java.util.List;

public class New {

    private List<PicTest> picTestList;
    private NewHouse newHouse;
    private List<HouseTypeTest> houseTypes;
    private List<HouseType> houseType;

    public List<HouseType> getHouseType() {
        return houseType;
    }

    public void setHouseType(List<HouseType> houseType) {
        this.houseType = houseType;
    }

    public List<PicTest> getPicTestList() {
        return picTestList;
    }

    public void setPicTestList(List<PicTest> picTestList) {
        this.picTestList = picTestList;
    }

    public NewHouse getNewHouse() {
        return newHouse;
    }

    public void setNewHouse(NewHouse newHouse) {
        this.newHouse = newHouse;
    }

    public List<HouseTypeTest> getHouseTypes() {
        return houseTypes;
    }

    public void setHouseTypes(List<HouseTypeTest> houseTypes) {
        this.houseTypes = houseTypes;
    }
    public void setNew(List<PicTest> picTestList,NewHouse newHouse,List<HouseTypeTest> houseTypes,List<HouseType> houseType){
        this.setPicTestList(picTestList);
        this.setNewHouse(newHouse);
        this.setHouseTypes(houseTypes);
        this.setHouseType(houseType);
    }
}
