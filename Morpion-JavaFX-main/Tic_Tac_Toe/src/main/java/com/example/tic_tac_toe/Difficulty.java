package com.example.tic_tac_toe;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Difficulty {

    @FXML
    private TextArea NameJ1;

    @FXML
    private TextArea NameJ2;

    @FXML
    private Button Play;

    @FXML
    void Joueur1MouseReleased(MouseEvent event) {


    }

    @FXML
    void Joueur2MouseReleased(MouseEvent event) {


    }

    @FXML
    void PlayMouseReleased(MouseEvent event) {


    }
    @FXML
    public void PlayGame(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Grid2.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) Play.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
