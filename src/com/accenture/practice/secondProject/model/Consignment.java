package com.accenture.practice.secondProject.model;

import java.util.Date;

public class Consignment {

    private int id;
    private int productId;
    private int quantity;
    private Date creationDateTime;
    private int factoryId;
    private int warehouseId;
    private int storeId;
    private boolean customMade;
    private int supplierId;

    public Consignment(int id, int productId, int quantity, Date creationDateTime, int factoryId, int warehouseId, int storeId, boolean customMade, int supplierId) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.creationDateTime = creationDateTime;
        this.factoryId = factoryId;
        this.warehouseId = warehouseId;
        this.storeId = storeId;
        this.customMade = customMade;
        this.supplierId = supplierId;
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

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public boolean isCustomMade() {
        return customMade;
    }

    public void setCustomMade(boolean customMade) {
        this.customMade = customMade;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
}
