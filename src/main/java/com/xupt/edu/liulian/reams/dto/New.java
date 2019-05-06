package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.pojo.Building;
import com.xupt.edu.liulian.reams.pojo.HouseType;
import com.xupt.edu.liulian.reams.pojo.NewHouse;

import java.util.List;

public class New {

    private List<PicTest> picTestList;
    private NewHouse newHouse;
    private List<HouseTypeTest> houseTypes;
    private List<HouseType> houseType;
    private List<Building> buildings;
    private List<Agent> agents;

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

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
    public void setNew(List<PicTest> picTestList, NewHouse newHouse, List<HouseTypeTest> houseTypes, List<HouseType> houseType, List<Building> buildings,List<Agent> agents){
        this.setPicTestList(picTestList);
        this.setNewHouse(newHouse);
        this.setHouseTypes(houseTypes);
        this.setHouseType(houseType);
        this.setBuildings(buildings);
        this.setAgents(agents);

    }
}
