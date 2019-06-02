package com.xupt.edu.liulian.reams.pojo;

public class user_rent {
    private Integer id;

    private String name;

    private String phone;

    private String address;

    private Integer type;

    private Integer rentHouse_id;

    private Integer newHouse_id;

    private Integer greenHouse_id;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRentHouse_id() {
        return rentHouse_id;
    }

    public void setRentHouse_id(Integer rentHouse_id) {
        this.rentHouse_id = rentHouse_id;
    }

    public Integer getNewHouse_id() {
        return newHouse_id;
    }

    public void setNewHouse_id(Integer newHouse_id) {
        this.newHouse_id = newHouse_id;
    }

    public Integer getGreenHouse_id() {
        return greenHouse_id;
    }

    public void setGreenHouse_id(Integer greenHouse_id) {
        this.greenHouse_id = greenHouse_id;
    }
}