package com.accenture.practice.secondProject.model;

public class Position {

    private int id;
    private String name;
    private float salary;
    private float bonus;
    private int roleId;
    private String address;

    public Position(int id, String name, float salary, float bonus, int roleId, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        this.roleId = roleId;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
