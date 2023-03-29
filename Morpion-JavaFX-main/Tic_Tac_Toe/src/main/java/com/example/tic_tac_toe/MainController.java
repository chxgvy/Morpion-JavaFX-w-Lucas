package com.example.tic_tac_toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Button ModeSolo;

    @FXML
    private Button ONEVONE;

    @FXML
    private Button Score;



    public void Solobtn(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Difficulty2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ModeSolo.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    public void ONEVONEbtn(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Difficulty.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) ONEVONE.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void Scorebtn(ActionEvent actionEvent) {
    }
}
