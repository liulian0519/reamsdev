package com.xupt.edu.liulian.reams.pojo;

public class NewHouse {
    private Integer id;

    private String name;

    private String address;

    private Integer price;

    private Integer status;

    private String type;

    private String water;

    private String fee;

    private String heating;

    private String electric;

    private Integer housetype_id;

    private Integer building_id;

    private String housex;

    private String housey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water == null ? null : water.trim();
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee == null ? null : fee.trim();
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating == null ? null : heating.trim();
    }

    public String getElectric() {
        return electric;
    }

    public void setElectric(String electric) {
        this.electric = electric == null ? null : electric.trim();
    }

    public Integer getHousetype_id() {
        return housetype_id;
    }

    public void setHousetype_id(Integer housetype_id) {
        this.housetype_id = housetype_id;
    }

    public Integer getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(Integer building_id) {
        this.building_id = building_id;
    }

    public String getHousex() {
        return housex;
    }

    public void setHousex(String housex) {
        this.housex = housex == null ? null : housex.trim();
    }

    public String getHousey() {
        return housey;
    }

    public void setHousey(String housey) {
        this.housey = housey == null ? null : housey.trim();
    }
}