package hackaton.demo.ecomoving;

import hackaton.demo.ecomoving.model.Gestionale;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    // dichiarazione della variabile gestionale che deve essere accessibile a tutti i controller
    Gestionale gestionaleUtenti = new Gestionale();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("login-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 500, 800);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    // variabile getter per ottenere il gestionale
    public Gestionale getGestionaleUtenti() {
        return gestionaleUtenti;
    }

    public static void main(String[] args) {
        launch();
    }
}