package com.example.loginpage;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    protected void displayMessage() {
        welcomeText.setText("you are logged in");
    }

    public void login(ActionEvent event){
        String user = userName.getText();
        String pass = password.getText();
        if (Objects.equals(user, "kripal") && Objects.equals(pass, "jaynepal")){
            displayMessage();
        }
        else {
            welcomeText.setText("incorrect username or password");
        }
    }
}