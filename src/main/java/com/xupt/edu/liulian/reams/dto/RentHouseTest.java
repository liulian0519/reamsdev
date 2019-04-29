package com.xupt.edu.liulian.reams.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xupt.edu.liulian.reams.pojo.RentHouse;

import java.util.Date;
import java.util.List;

public class RentHouseTest {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private List<RentHouse> rentHouses;

    public List<RentHouse> getRentHouses() {
        return rentHouses;
    }

    public void setRentHouses(List<RentHouse> rentHouses) {
        this.rentHouses = rentHouses;
    }

    private String name;
    private String address;
    private String position;
    private Byte rent_type;
    private String type;
    private Integer area;
    private Integer price;
    private String area_type;
    private Date con_time;
    private Byte heating;
    private Byte wifi;

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getCon_time() {
        return con_time;
    }

    public void setCon_time(Date con_time) {
        this.con_time = con_time;
    }

    public Byte getHeating() {
        return heating;
    }

    public void setHeating(Byte heating) {
        this.heating = heating;
    }

    public Byte getWifi() {
        return wifi;
    }

    public void setWifi(Byte wifi) {
        this.wifi = wifi;
    }

    private List<String> url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Byte getRent_type() {
        return rent_type;
    }

    public void setRent_type(Byte rent_type) {
        this.rent_type = rent_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

}
