package hackaton.demo.ecomoving;

import hackaton.demo.ecomoving.model.Gestionale;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class LoginController {
    MainApp mainApp;

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
    private void loginUtente() throws IOException {
        if(mainApp.getGestionaleUtenti().checkLogin(textFieldUsernameEmail.getText(), passwordFieldPassword.getText())) {
            mainApp.mainPage();
        }
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
}