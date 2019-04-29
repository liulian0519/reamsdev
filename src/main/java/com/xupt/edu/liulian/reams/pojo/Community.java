package com.xupt.edu.liulian.reams.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Community {
    private Integer id;

    private String name;

    private String address;

    private String avg_price;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date build_time;

    private String build_type;

    private Integer build_num;

    private String introduce;

    private String surrouding;

    private String key_sale;

    private Integer greenHouse_id;

    private String traffic;

    private Integer rentHouse_id;

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

    public String getAvg_price() {
        return avg_price;
    }

    public void setAvg_price(String avg_price) {
        this.avg_price = avg_price == null ? null : avg_price.trim();
    }

    public Date getBuild_time() {
        return build_time;
    }

    public void setBuild_time(Date build_time) {
        this.build_time = build_time;
    }

    public String getBuild_type() {
        return build_type;
    }

    public void setBuild_type(String build_type) {
        this.build_type = build_type == null ? null : build_type.trim();
    }

    public Integer getBuild_num() {
        return build_num;
    }

    public void setBuild_num(Integer build_num) {
        this.build_num = build_num;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getSurrouding() {
        return surrouding;
    }

    public void setSurrouding(String surrouding) {
        this.surrouding = surrouding == null ? null : surrouding.trim();
    }

    public String getKey_sale() {
        return key_sale;
    }

    public void setKey_sale(String key_sale) {
        this.key_sale = key_sale == null ? null : key_sale.trim();
    }

    public Integer getGreenHouse_id() {
        return greenHouse_id;
    }

    public void setGreenHouse_id(Integer greenHouse_id) {
        this.greenHouse_id = greenHouse_id;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public Integer getRentHouse_id() {
        return rentHouse_id;
    }

    public void setRentHouse_id(Integer rentHouse_id) {
        this.rentHouse_id = rentHouse_id;
    }
}