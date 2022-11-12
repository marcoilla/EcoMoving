package hackaton.demo.ecomoving;

import hackaton.demo.ecomoving.model.Utente;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class SignUpDatiController {
    // dichiarazione delle variabili di scena
    @FXML
    private Button bottoneContinua;

    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldCognome;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldDataDiNascita;

    @FXML
    private TextField textFieldUsername;

    @FXML
    private PasswordField passwordFieldPassword;

    @FXML
    private PasswordField passwordFieldConfermaPassword;

    private MainApp mainApp;

    private Object AlertType;

    // switch scena
    @FXML
    public void switchScenaTrasporto() {
        if(checkPassword()) {
            if (checkCampi()) {
                // creazione dell'utente
                mainApp.setUtenteTest(new Utente(textFieldUsername.getText(),passwordFieldPassword.getText(), textFieldEmail.getText(), getDate(textFieldDataDiNascita.getText()),textFieldNome.getText(),textFieldCognome.getText()));

                Stage stage;
                stage = (Stage) bottoneContinua.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup-trasporto-view.fxml"));

                Scene scene = null;
                try {
                    scene = new Scene(fxmlLoader.load(), 500, 800);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                SignUpTrasportoController signUpTrasportoController = fxmlLoader.getController();
                signUpTrasportoController.setMainApp(mainApp);

                stage.setScene(scene);
                stage.show();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Compilare tutti i campi correttamente.", ButtonType.OK, ButtonType.CANCEL);
                alert.showAndWait();
            }
        } else {
            passwordFieldConfermaPassword.setText("");
            passwordFieldPassword.setText("");

            Alert alert = new Alert(Alert.AlertType.WARNING, "Le due password non corrispondono.", ButtonType.OK, ButtonType.CANCEL);
            alert.showAndWait();
        }
    }



    // funzione che controlla che tutti i campi siano stati inseriti
    // ritorna false se i vari campi non sono completati
    // ritorna true se si può continuare
    private boolean checkCampi() {
        if(textFieldCognome.getText().equals("")) {
            return false;
        }

        if(textFieldNome.getText().equals("")){
            return false;
        }

        if(textFieldEmail.getText().equals("")){
            return false;
        }

        if(textFieldDataDiNascita.getText().equals("")){
            return false;
        }

        if(textFieldUsername.getText().equals("")) {
            return false;
        }

        if(passwordFieldPassword.getText().equals("")){
            return false;
        }

        if(passwordFieldConfermaPassword.getText().equals("")){
            return false;
        }

        System.out.println("Login OK");

        return true;
    }

    private boolean checkPassword() {
        if(passwordFieldConfermaPassword.getText().equals(passwordFieldPassword.getText())){
            return true;
        }

        return false;
    }

    public LocalDate getDate(String date) {
        return LocalDate.parse(date);
    }

    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }

}
