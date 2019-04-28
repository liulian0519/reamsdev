package com.xupt.edu.liulian.reams.dto;

import java.util.List;

public class NewHouseTest {
    private Integer id;
    private List<String> url;
    private String name;
    private String price;

    public Integer getId() {
        return id;
    }

    public List<String> getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
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

    public void setPrice(String price) {
        this.price = price;
    }
}
