package com.accenture.practice.secondProject.model;

import java.util.Date;

public class Sale {

    private int id;
    private Date releaseDateTime;
    private boolean customMade;
    private int storeId;
    private Date registrationDateTime;

    public Sale(int id, Date releaseDateTime, boolean customMade, int storeId, Date registrationDateTime) {
        this.id = id;
        this.releaseDateTime = releaseDateTime;
        this.customMade = customMade;
        this.storeId = storeId;
        this.registrationDateTime = registrationDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReleaseDateTime() {
        return releaseDateTime;
    }

    public void setReleaseDateTime(Date releaseDateTime) {
        this.releaseDateTime = releaseDateTime;
    }

    public boolean isCustomMade() {
        return customMade;
    }

    public void setCustomMade(boolean customMade) {
        this.customMade = customMade;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Date getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(Date registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
}
