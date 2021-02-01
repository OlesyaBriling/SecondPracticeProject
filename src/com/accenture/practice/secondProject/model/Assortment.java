package com.accenture.practice.secondProject.model;

public class Assortment {

    private int storeId;
    private int productId;
    private int quantityInStock;

    public Assortment(int storeId, int productId, int quantityInStock) {
        this.storeId = storeId;
        this.productId = productId;
        this.quantityInStock = quantityInStock;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
