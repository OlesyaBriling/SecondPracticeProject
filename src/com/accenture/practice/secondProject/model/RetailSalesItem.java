package com.accenture.practice.secondProject.model;

public class RetailSalesItem {

    private int id;
    private int productId;
    private int quantity;
    private float discount;
    private int saleId;

    public RetailSalesItem(int id, int productId, int quantity, float discount, int saleId) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.discount = discount;
        this.saleId = saleId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }
}
