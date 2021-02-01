package com.accenture.practice.secondProject.model;

public class OrderedProduct {

    private int id;
    private int saleId;
    private int consignmentId;
    private float discount;

    public OrderedProduct(int id, int saleId, int consignmentId, float discount) {
        this.id = id;
        this.saleId = saleId;
        this.consignmentId = consignmentId;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(int consignmentId) {
        this.consignmentId = consignmentId;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
