package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouse;

import java.util.List;

public class House {
    private List<test>  greenHouses;
//    private List<test> tests;
    private List<NewHouseTest> newHouses;
    private List<RentHouseTest> rentHouses;

    public void setHouse(List<test>  greenHouses, List<NewHouseTest> newHouses,List<RentHouseTest> rentHouses){
        this.setGreenHouses(greenHouses);

        this.setNewHouses(newHouses);
        this.setRentHouses(rentHouses);
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
