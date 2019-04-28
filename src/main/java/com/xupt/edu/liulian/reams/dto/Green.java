package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.Agent;
import com.xupt.edu.liulian.reams.pojo.Community;
import com.xupt.edu.liulian.reams.pojo.GreenHouse;

import java.util.List;

public class Green {
    private List<Community> communityList;
    private GreenHouse greenHouse;
    private  List<PicTest> picTests;
    private List<Agent> agents;

    public List<PicTest> getPicTests() {
        return picTests;
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
}
