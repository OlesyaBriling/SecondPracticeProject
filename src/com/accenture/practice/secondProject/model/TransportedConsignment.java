package com.accenture.practice.secondProject.model;

public class TransportedConsignment {

    private int id;
    private int transportationId;
    private int consignmentId;

    public TransportedConsignment(int id, int transportationId, int consignmentId) {
        this.id = id;
        this.transportationId = transportationId;
        this.consignmentId = consignmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(int transportationId) {
        this.transportationId = transportationId;
    }

    public int getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(int consignmentId) {
        this.consignmentId = consignmentId;
    }
}
