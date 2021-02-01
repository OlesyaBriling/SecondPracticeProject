package com.accenture.practice.secondProject.model;

public class Product {

    private int id;
    private int categoryId;
    private String name;
    private float manufacturingCost;
    private float sellingPrice;
    private boolean isOurProduct;
    private float occupiedSpace;

    public Product(int id, int categoryId, String name, float manufacturingCost, float sellingPrice, boolean isOurProduct, float occupiedSpace) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.manufacturingCost = manufacturingCost;
        this.sellingPrice = sellingPrice;
        this.isOurProduct = isOurProduct;
        this.occupiedSpace = occupiedSpace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getManufacturingCost() {
        return manufacturingCost;
    }

    public void setManufacturingCost(float manufacturingCost) {
        this.manufacturingCost = manufacturingCost;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public boolean isOurProduct() {
        return isOurProduct;
    }

    public void setOurProduct(boolean ourProduct) {
        isOurProduct = ourProduct;
    }

    public float getOccupiedSpace() {
        return occupiedSpace;
    }

    public void setOccupiedSpace(float occupiedSpace) {
        this.occupiedSpace = occupiedSpace;
    }
}
