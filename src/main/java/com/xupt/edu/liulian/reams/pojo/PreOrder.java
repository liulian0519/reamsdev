package com.xupt.edu.liulian.reams.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PreOrder {
    private Integer id;

    private String phone;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date order_time;

    private String area_type;

    private String area;

    private String order_type;

    private String price;

    private String name;

    private Integer greenhouse_id;

    private Integer newhouse_id;

    private Integer renthouse_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getOrder_time() {
        return order_time;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type == null ? null : area_type.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type == null ? null : order_type.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGreenhouse_id() {
        return greenhouse_id;
    }

    public void setGreenhouse_id(Integer greenhouse_id) {
        this.greenhouse_id = greenhouse_id;
    }

    public Integer getNewhouse_id() {
        return newhouse_id;
    }

    public void setNewhouse_id(Integer newhouse_id) {
        this.newhouse_id = newhouse_id;
    }

    public Integer getRenthouse_id() {
        return renthouse_id;
    }

    public void setRenthouse_id(Integer renthouse_id) {
        this.renthouse_id = renthouse_id;
    }
}