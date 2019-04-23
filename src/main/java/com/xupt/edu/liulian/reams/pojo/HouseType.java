package com.xupt.edu.liulian.reams.pojo;

public class HouseType {
    private Integer id;

    private String area_type;

    private String area;

    private String price;

    private Integer status;

    private Integer building_id;

    private String house_img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(Integer building_id) {
        this.building_id = building_id;
    }

    public String getHouse_img() {
        return house_img;
    }

    public void setHouse_img(String house_img) {
        this.house_img = house_img == null ? null : house_img.trim();
    }
}