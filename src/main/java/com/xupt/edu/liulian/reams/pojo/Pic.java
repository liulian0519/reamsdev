package com.xupt.edu.liulian.reams.pojo;

public class Pic {
    private Integer id;

    private Integer greenhouse_id;

    private Integer newhouse_id;

    private Integer renthouse_id;

    private Integer type;

    private String imgurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}