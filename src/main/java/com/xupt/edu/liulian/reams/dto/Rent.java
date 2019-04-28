package com.xupt.edu.liulian.reams.dto;

import com.xupt.edu.liulian.reams.pojo.Pic;
import com.xupt.edu.liulian.reams.pojo.RentHouse;

import java.util.List;

public class Rent {
    private List<PicTest> picList;
    private RentHouse rentHouse;
    private List<RentHouse> rentHouses;
    private List<RentHouseTest> rentHouseTests;

    public List<RentHouseTest> getRentHouseTests() {
        return rentHouseTests;
    }

    public void setRentHouseTests(List<RentHouseTest> rentHouseTests) {
        this.rentHouseTests = rentHouseTests;
    }

    public List<RentHouse> getRentHouses() {
        return rentHouses;
    }

    public void setRentHouses(List<RentHouse> rentHouses) {
        this.rentHouses = rentHouses;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<PicTest> getPicList() {
        return picList;
    }

    public void setPicList(List<PicTest> picList) {
        this.picList = picList;
    }

    public RentHouse getRentHouse() {
        return rentHouse;
    }

    public void setRentHouse(RentHouse rentHouse) {
        this.rentHouse = rentHouse;
    }



    public void setRent(List<PicTest> picList, RentHouse rentHouse) {
        this.setPicList(picList);
        this.setRentHouse(rentHouse);
    }
    public void setRent(List<PicTest> picList,List<RentHouse> rentHouses,int count){
        this.setPicList(picList);
        this.setRentHouses(rentHouses);
        this.setCount(count);
    }

    public void setTest(List<RentHouseTest> rentHouseTests,int count){
        this.setRentHouseTests(rentHouseTests);
        this.setCount(count);
    }

    //    public void setRent(List<Pic> picList, Rent rent){
//        this.setPicList(picList);
//        this.setRent(rent);
//    }

}
