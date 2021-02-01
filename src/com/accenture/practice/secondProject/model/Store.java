package com.accenture.practice.secondProject.model;

public class Store {

    private int id;
    private String address;
    private int maxCapacity;

    public Store(int id, String address, int maxCapacity) {
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

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
