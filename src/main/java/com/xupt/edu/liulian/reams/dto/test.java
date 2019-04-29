package com.xupt.edu.liulian.reams.dto;

import java.util.List;

public class test {
    private Integer id;
//    private List url;
//    private String url;
    private List<String> url;

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public List<String> getUrl() {
        return url;
    }

    private String name;
    private String address;
    private String type;
    private Integer area;
    private Integer price;

//    public List getUrl() {
//        return url;
//    }
//
//    public void setUrl(List url) {
//        this.url = url;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }





    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "test{" +
                "id=" + id +
                '}';
    }
}
