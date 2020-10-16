package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;

public class Controller {
    String nameFile = "";
    String pathFile = "";
    String rash = "";
    String sureName = "";
    String name = "";
    String patronymic = "";

    @FXML
    private TextField text;

    @FXML
    private javafx.scene.control.Label showResult;

//CheckBox;
    @FXML
    public void pressChekBox(){
    }


//RadioButton;
    @FXML
    public void pressRadioButton(){}

//Button;
    @FXML
    public void pressButton(ActionEvent event) throws IOException {
//        String value = ((Button)event.getSource()).getText();
        Module module = new Module().createFile(nameFile, pathFile,rash, sureName, name, patronymic);

        String str = text.getText();
        if (!str.isEmpty()){
            showResult.setText("Статус: Вы зарегистрировались;)");
        } else {
            showResult.setText("Статус: Заполните пустые поля -_-");
        }
    }
}

