package com.accenture.practice.secondProject.model;

public class Warehouse {

    private int id;
    private String address;
    private String maxCapacity;

    public Warehouse(int id, String address, String maxCapacity) {
        this.id = id;
        this.address = address;
        this.maxCapacity = maxCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(String maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
