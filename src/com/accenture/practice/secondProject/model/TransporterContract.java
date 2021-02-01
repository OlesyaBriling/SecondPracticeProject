package com.accenture.practice.secondProject.model;

import java.util.Date;

public class TransporterContract {

    private int id;
    private float contractPrice;
    private Date startDateTime;
    private int transportationsQuantity;
    private int transporterId;

    public TransporterContract(int id, float contractPrice, Date startDateTime, int transportationsQuantity, int transporterId) {
        this.id = id;
        this.contractPrice = contractPrice;
        this.startDateTime = startDateTime;
        this.transportationsQuantity = transportationsQuantity;
        this.transporterId = transporterId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getContractPrice() {
        return contractPrice;
    }

    public void setContractPrice(float contractPrice) {
        this.contractPrice = contractPrice;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public int getTransportationsQuantity() {
        return transportationsQuantity;
    }

    public void setTransportationsQuantity(int transportationsQuantity) {
        this.transportationsQuantity = transportationsQuantity;
    }

    public int getTransporterId() {
        return transporterId;
    }

    public void setTransporterId(int transporterId) {
        this.transporterId = transporterId;
    }
}
