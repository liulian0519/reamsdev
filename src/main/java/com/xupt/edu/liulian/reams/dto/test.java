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
    private String area;
    private String price;

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

    public void setArea(String area) {
        this.area = area;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getArea() {
        return area;
    }

    public String getPrice() {
        return price;
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
