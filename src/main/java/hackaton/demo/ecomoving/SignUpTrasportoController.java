package hackaton.demo.ecomoving;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

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

    //submit del sign up
    @FXML
    public void switchToScenaSmartWorking() {
        if (checkCampi()) {
            Stage stage;
            Parent root = null;
            stage = (Stage) bottoneConferma.getScene().getWindow();
            try {
                root = FXMLLoader.load(getClass().getResource("signup-smartworking-view.fxml"));
            } catch (Exception e) {
                System.out.println("ERRORE, non carica il file");
            }
            Scene scene = new Scene(root);
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
}
