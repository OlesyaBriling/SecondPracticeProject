package com.accenture.practice.secondProject.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Staff {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> StaffTable;

    @FXML
    private TableColumn<?, ?> Surname;

    @FXML
    private TableColumn<?, ?> Name;

    @FXML
    private TableColumn<?, ?> Login;

    @FXML
    private TableColumn<?, ?> Password;

    @FXML
    private TableColumn<?, ?> Telegram;

    @FXML
    private TableColumn<?, ?> Email;

    @FXML
    private Button Exit;

    @FXML
    void initialize() {
        assert StaffTable != null : "fx:id=\"StaffTable\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Surname != null : "fx:id=\"Surname\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Name != null : "fx:id=\"Name\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Login != null : "fx:id=\"Login\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Password != null : "fx:id=\"Password\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Telegram != null : "fx:id=\"Telegram\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Email != null : "fx:id=\"Email\" was not injected: check your FXML file 'Staff.fxml'.";
        assert Exit != null : "fx:id=\"Exit\" was not injected: check your FXML file 'Staff.fxml'.";

    }
}

