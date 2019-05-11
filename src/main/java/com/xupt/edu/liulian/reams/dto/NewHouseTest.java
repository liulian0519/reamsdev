package com.xupt.edu.liulian.reams.dto;

import java.util.List;

public class NewHouseTest {
    private Integer id;
    private List<String> url;
    private List<String> typeUrl;
    private List<String> area_type;
    private String name;
    private Integer status;
    private String address;
    private List<NewHouseTest> newHouseTests;

    public List<NewHouseTest> getNewHouseTests() {
        return newHouseTests;
    }

    public void setNewHouseTests(List<NewHouseTest> newHouseTests) {
        this.newHouseTests = newHouseTests;
    }

    public List<String> getTypeUrl() {
        return typeUrl;
    }

    public void setTypeUrl(List<String> typeUrl) {
        this.typeUrl = typeUrl;
    }

    public List<String> getArea_type() {
        return area_type;
    }

    public void setArea_type(List<String> area_type) {
        this.area_type = area_type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public List<String> getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }



    public void setId(Integer id) {
        this.id = id;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setTest(List<NewHouseTest> newHouseTests){
        this.setNewHouseTests(newHouseTests);
    }
}
