package com.xupt.edu.liulian.reams.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class GreenHouseTest {
    private Integer id;
    private String name;
    private String area_type;
    private String position;
    private String address;
    private String floor;
    private Integer area;
    private String build_use;
    private Integer price;
    private Integer exam;
    private Date con_time;
    private Date order_time;
    private String rent_phone;

    public String getRent_phone() {
        return rent_phone;
    }

    public void setRent_phone(String rent_phone) {
        this.rent_phone = rent_phone;
    }

    private String user_phone;

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getCon_time() {
        return con_time;
    }

    public void setCon_time(Date con_time) {
        this.con_time = con_time;
    }

    public Integer getExam() {
        return exam;
    }

    public void setExam(Integer exam) {
        this.exam = exam;
    }

    private List<String> url;
    private Date build_time;

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

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
        this.name = name;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getBuild_time() {
        return build_time;
    }

    public void setBuild_time(Date build_time) {
        this.build_time = build_time;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getBuild_use() {
        return build_use;
    }

    public void setBuild_use(String build_use) {
        this.build_use = build_use;
    }
}
