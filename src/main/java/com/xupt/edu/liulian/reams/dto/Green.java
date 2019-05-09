package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.pojo.Community;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;

import java.util.List;

public class Green {
    private List<Community> communityList;
    private GreenHouse greenHouse;
    private List<GreenHouse> greenHouses;
    private  List<PicTest> picTests;
    private List<Agent> agents;
    private List<GreenHouseTest> greenHouseTests;
    private int count;

    public List<PicTest> getPicTests() {
        return picTests;
    }

    public List<GreenHouseTest> getGreenHouseTests() {
        return greenHouseTests;
    }

    public void setGreenHouseTests(List<GreenHouseTest> greenHouseTests) {
        this.greenHouseTests = greenHouseTests;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPicTests(List<PicTest> picTests) {
        this.picTests = picTests;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public List<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(List<Community> communityList) {
        this.communityList = communityList;
    }

    public GreenHouse getGreenHouse() {
        return greenHouse;
    }

    public void setGreenHouse(GreenHouse greenHouse) {
        this.greenHouse = greenHouse;
    }
    public void setGreen(List<Community> communities,GreenHouse greenHouse,List<PicTest> picTests,List<Agent> agents){
        this.setCommunityList(communities);
        this.setGreenHouse(greenHouse);
        this.setPicTests(picTests);
        this.setAgents(agents);
    }

    public List<GreenHouse> getGreenHouses() {
        return greenHouses;
    }

    public void setGreenHouses(List<GreenHouse> greenHouses) {
        this.greenHouses = greenHouses;
    }

    public void setGreen(List<GreenHouse> greenHouses, int count){
        this.setGreenHouses(greenHouses);
        this.setCount(count);
    }
    public void setTest(List<GreenHouseTest> greenHouseTests,int count){
        this.setGreenHouseTests(greenHouseTests);
        this.setCount(count);
    }
}
