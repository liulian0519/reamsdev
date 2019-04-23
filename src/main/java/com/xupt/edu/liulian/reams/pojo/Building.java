package com.xupt.edu.liulian.reams.pojo;

public class Building {
    private Integer id;

    private String name;

    private String address;

    private String developer;

    private String build_type;

    private String build_area;

    private String build_user;

    private String right_age;

    private String green_percent;

    private String area_size;

    private String surrounding;

    private String introduce;

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

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getBuild_type() {
        return build_type;
    }

    public void setBuild_type(String build_type) {
        this.build_type = build_type == null ? null : build_type.trim();
    }

    public String getBuild_area() {
        return build_area;
    }

    public void setBuild_area(String build_area) {
        this.build_area = build_area == null ? null : build_area.trim();
    }

    public String getBuild_user() {
        return build_user;
    }

    public void setBuild_user(String build_user) {
        this.build_user = build_user == null ? null : build_user.trim();
    }

    public String getRight_age() {
        return right_age;
    }

    public void setRight_age(String right_age) {
        this.right_age = right_age == null ? null : right_age.trim();
    }

    public String getGreen_percent() {
        return green_percent;
    }

    public void setGreen_percent(String green_percent) {
        this.green_percent = green_percent == null ? null : green_percent.trim();
    }

    public String getArea_size() {
        return area_size;
    }

    public void setArea_size(String area_size) {
        this.area_size = area_size == null ? null : area_size.trim();
    }

    public String getSurrounding() {
        return surrounding;
    }

    public void setSurrounding(String surrounding) {
        this.surrounding = surrounding == null ? null : surrounding.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}