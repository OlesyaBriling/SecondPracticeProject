package com.accenture.practice.secondProject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ManagerStoreController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Staff;

    @FXML
    private Button Assortment;

    @FXML
    private Button Consignment;

    @FXML
    private Button TovarNaSklade;

    @FXML
    private Button Chat;

    @FXML
    private Button Exit;

    @FXML
    void initialize() {
        assert Staff != null : "fx:id=\"Staff\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert Assortment != null : "fx:id=\"Assortment\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert Consignment != null : "fx:id=\"Consignment\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert TovarNaSklade != null : "fx:id=\"TovarNaSklade\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert Chat != null : "fx:id=\"Chat\" was not injected: check your FXML file 'Warehouse.fxml'.";
        assert Exit != null : "fx:id=\"Exit\" was not injected: check your FXML file 'Warehouse.fxml'.";

    }
}

