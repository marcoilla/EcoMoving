package hackaton.demo.ecomoving;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpTrasportoController {
    // dichiarazione degli oggetti di scena
    @FXML
    private TextField textFieldLuogoDiPartenza;

    @FXML
    private TextField textFieldLuogoDiLavoro;

    @FXML
    private CheckBox checkBoxBiciclette;

    @FXML
    private CheckBox checkBoxPiedi;

    @FXML
    private CheckBox checkBoxMezziPubblici;

    @FXML
    private CheckBox checkBoxMacchine;

    @FXML
    private Button bottoneConferma;

    private MainApp mainApp;

    //submit del sign up
    @FXML
    public void switchToScenaSmartWorking() {
        if (checkCampi()) {
            Stage stage;
            Scene scene = null;
            stage = (Stage) bottoneConferma.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup-smartworking-view.fxml"));
            try {
                scene = new Scene(fxmlLoader.load(),500,800);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            SignUpLavoroController signUpLavoroController = fxmlLoader.getController();
            signUpLavoroController.setMainApp(mainApp);


            mainApp.getUtenteTest().setLuogoDiResidenza(textFieldLuogoDiPartenza.getText());
            mainApp.getUtenteTest().setLuogoDiLavoro(textFieldLuogoDiLavoro.getText());

            if(checkBoxBiciclette.isSelected()){
                mainApp.getUtenteTest().getMezziTrasporto().add("biciclette");
            }

            if(checkBoxPiedi.isSelected()){
                mainApp.getUtenteTest().getMezziTrasporto().add("piedi");
            }

            if(checkBoxMacchine.isSelected()) {
                mainApp.getUtenteTest().getMezziTrasporto().add("macchina");
            }

            if(checkBoxMezziPubblici.isSelected()){
                mainApp.getUtenteTest().getMezziTrasporto().add("mezzi");
            }

            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Compilare tutti i campi correttamente.", ButtonType.OK, ButtonType.CANCEL);
            alert.showAndWait();
        }
    }


    // controllo che i campi necessari siano stati inseriti correttamente
    // ritorna false se non va bene
    // ritorna true se si può continuare
    private boolean checkCampi() {
        if(textFieldLuogoDiLavoro.getText().equals("")){
            return false;
        }

        if(textFieldLuogoDiPartenza.getText().equals("")){
            return false;
        }

        return true;
    }

    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
}
