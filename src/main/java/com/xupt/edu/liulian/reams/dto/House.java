package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.GreenHouse;
import com.xupt.edu.liulian.reams.pojo.NewHouse;
import com.xupt.edu.liulian.reams.pojo.RentHouse;

import java.util.List;

public class House {
    private List<GreenHouse>  greenHouses;
    private List<NewHouse> newHouses;
    private List<RentHouse> rentHouses;

    public void setHouse(List<GreenHouse>  greenHouses, List<NewHouse> newHouses,List<RentHouse> rentHouses){
        this.setGreenHouses(greenHouses);
        this.setNewHouses(newHouses);
        this.setRentHouses(rentHouses);
    }
    public List<GreenHouse> getGreenHouses() {
        return greenHouses;
    }

    public void setGreenHouses(List<GreenHouse> greenHouses) {
        this.greenHouses = greenHouses;
    }

    public List<NewHouse> getNewHouses() {
        return newHouses;
    }

    public void setNewHouses(List<NewHouse> newHouses) {
        this.newHouses = newHouses;
    }

    public List<RentHouse> getRentHouses() {
        return rentHouses;
    }

    public void setRentHouses(List<RentHouse> rentHouses) {
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
