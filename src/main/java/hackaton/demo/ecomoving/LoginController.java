package hackaton.demo.ecomoving;

import hackaton.demo.ecomoving.model.Gestionale;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {
    MainApp mainApp;

    Gestionale gestionaleUtenti;

    @FXML
    TextField textFieldUsernameEmail;

    @FXML
    PasswordField passwordFieldPassword;

    // funzione che fa il switch di scena per la schermata di sign up
    @FXML
    private void switchSceneSignUp() throws IOException {
        mainApp.singUpUtente();
    }

    @FXML
    private void loginUtente() {
        if(gestionaleUtenti.checkLogin(textFieldUsernameEmail.getText(), passwordFieldPassword.getText())) {
            //mainApp.faiqualcosa();
            System.out.println("Login");
        }
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        gestionaleUtenti = mainApp.getGestionaleUtenti();
    }
}