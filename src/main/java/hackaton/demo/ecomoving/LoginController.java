package hackaton.demo.ecomoving;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoginController {
    // dichiarazione delle variabili di scena
    @FXML
    private Button bottonLogin;

    @FXML
    private Button bottoneSignUp;


    // funzione che fa il switch di scena per la schermata di sign up
    @FXML
    private void switchSceneSignUp() {
        Stage stage;
        Parent root = null;
        stage = (Stage) bottonLogin.getScene().getWindow();
        try {
            root = FXMLLoader.load(getClass().getResource("signup-dati-view.fxml"));
        } catch (Exception e) {
            System.out.println("ERRORE, non carica il file");
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}