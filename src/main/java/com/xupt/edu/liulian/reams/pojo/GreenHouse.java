package com.xupt.edu.liulian.reams.pojo;

import java.util.Date;

public class GreenHouse {
    private Integer id;

    private String area;

    private String area_type;

    private String price;

    private String floor;

    private String build_type;

    private String position;

    private String decoration;

    private String ladder_house;

    private Integer heating;

    private Integer elevator;

    private String build_use;

    private String right_age;

    private Date con_time;

    private Integer mortgage;

    private String name;

    private String address;

    private Integer community_id;

    private String housey;

    private String housex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type == null ? null : area_type.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor == null ? null : floor.trim();
    }

    public String getBuild_type() {
        return build_type;
    }

    public void setBuild_type(String build_type) {
        this.build_type = build_type == null ? null : build_type.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration == null ? null : decoration.trim();
    }

    public String getLadder_house() {
        return ladder_house;
    }

    public void setLadder_house(String ladder_house) {
        this.ladder_house = ladder_house == null ? null : ladder_house.trim();
    }

    public Integer getHeating() {
        return heating;
    }

    public void setHeating(Integer heating) {
        this.heating = heating;
    }

    public Integer getElevator() {
        return elevator;
    }

    public void setElevator(Integer elevator) {
        this.elevator = elevator;
    }

    public String getBuild_use() {
        return build_use;
    }

    public void setBuild_use(String build_use) {
        this.build_use = build_use == null ? null : build_use.trim();
    }

    public String getRight_age() {
        return right_age;
    }

    public void setRight_age(String right_age) {
        this.right_age = right_age == null ? null : right_age.trim();
    }

    public Date getCon_time() {
        return con_time;
    }

    public void setCon_time(Date con_time) {
        this.con_time = con_time;
    }

    public Integer getMortgage() {
        return mortgage;
    }

    public void setMortgage(Integer mortgage) {
        this.mortgage = mortgage;
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

    public Integer getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(Integer community_id) {
        this.community_id = community_id;
    }

    public String getHousey() {
        return housey;
    }

    public void setHousey(String housey) {
        this.housey = housey == null ? null : housey.trim();
    }

    public String getHousex() {
        return housex;
    }

    public void setHousex(String housex) {
        this.housex = housex == null ? null : housex.trim();
    }
}