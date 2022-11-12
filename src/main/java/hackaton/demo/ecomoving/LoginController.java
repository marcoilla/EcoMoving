package hackaton.demo.ecomoving;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {
    MainApp mainApp;

    @FXML
    TextField textFieldUsername;

    @FXML
    PasswordField passwordFieldPassword;

    // funzione che fa il switch di scena per la schermata di sign up
    @FXML
    private void switchSceneSignUp() throws IOException {
        mainApp.singUpUtente();
    }

    @FXML
    private void loginUtente() {
        if(mainApp.getGestionaleUtenti().checkLogin(textFieldUsername.getText(), passwordFieldPassword.getText())) {
            mainApp.faiqualcosa();
        }
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}