package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.*;

import java.util.List;

public class House {
    private List<test>  greenHouses;
//    private List<test> tests;
    private List<NewHouseTest> newHouses;
    private List<RentHouseTest> rentHouses;
    private List<GreenHouseTest> greenHouseTests;
    private List<Agent> agents;
    private List<PreOrder> preOrders;

    public List<PreOrder> getPreOrders() {
        return preOrders;
    }

    public void setPreOrders(List<PreOrder> preOrders) {
        this.preOrders = preOrders;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public List<GreenHouseTest> getGreenHouseTests() {
        return greenHouseTests;
    }

    public void setGreenHouseTests(List<GreenHouseTest> greenHouseTests) {
        this.greenHouseTests = greenHouseTests;
    }

    public void setHouse(List<test>  greenHouses, List<NewHouseTest> newHouses, List<RentHouseTest> rentHouses){
        this.setGreenHouses(greenHouses);
        this.setNewHouses(newHouses);
        this.setRentHouses(rentHouses);
    }
    public void sete(List<GreenHouseTest> greenHouseTests,List<NewHouseTest> newHouseTests,List<RentHouseTest> rentHouseTests,List<PreOrder> preOrders){
        this.setGreenHouseTests(greenHouseTests);
        this.setNewHouses(newHouseTests);
        this.setRentHouses(rentHouseTests);
        this.setPreOrders(preOrders);
//        this.setAgents(agents);

    }
    public List<test> getGreenHouses() {
        return greenHouses;
    }
//    public List<test> tests(){
//        return tests;
//    }

    public void setGreenHouses(List<test> greenHouses) {
        this.greenHouses = greenHouses;
    }

    public List<NewHouseTest> getNewHouses() {
        return newHouses;
    }

    public void setNewHouses(List<NewHouseTest> newHouses) {
        this.newHouses = newHouses;
    }

    public List<RentHouseTest> getRentHouses() {
        return rentHouses;
    }

    public void setRentHouses(List<RentHouseTest> rentHouses) {
        this.rentHouses = rentHouses;
    }

    @Override
    public String toString() {
        return "House{" +
                "greenHouses=" + greenHouses +
                ", newHouses=" + newHouses +
                ", rentHouses=" + rentHouses +
                '}';
    }
}
