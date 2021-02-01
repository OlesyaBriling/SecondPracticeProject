package com.accenture.practice.secondProject.controller;

import java.net.URL;
import java.sql.SQLOutput;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

    public class Controller {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private TextField Login;

        @FXML
        private PasswordField Password;

        @FXML
        private Button SignIn;

        @FXML
        void initialize() {
           SignIn.setOnAction(event -> {
               System.out.printf("Вы нажали на кнопу войти");
            });

        }


}
