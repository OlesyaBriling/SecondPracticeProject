package com.accenture.practice.secondProject.model;

import java.util.Date;

public class Transportation {

    private int id;
    private int contractId;
    private String departureAddress;
    private Date departureDateTime;
    private String destinationAddress;
    private Date destinationDateTime;

    public Transportation(int id, int contractId, String departureAddress, Date departureDateTime, String destinationAddress, Date destinationDateTime) {
        this.id = id;
        this.contractId = contractId;
        this.departureAddress = departureAddress;
        this.departureDateTime = departureDateTime;
        this.destinationAddress = destinationAddress;
        this.destinationDateTime = destinationDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public Date getDestinationDateTime() {
        return destinationDateTime;
    }

    public void setDestinationDateTime(Date destinationDateTime) {
        this.destinationDateTime = destinationDateTime;
    }
}
