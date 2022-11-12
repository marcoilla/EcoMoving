package hackaton.demo.ecomoving;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SignUpLavoroController implements Initializable {
    // variabili di scena
    @FXML
    private CheckBox checkBoxSiSmartWorking;

    @FXML
    private CheckBox checkBoxNoSmartWorking;

    @FXML
    private ComboBox<Integer> choiceBoxOraIngresso;

    @FXML
    private ComboBox<Integer> choiceBoxMinutiIngresso;

    @FXML
    private ComboBox<Integer> choiceBoxOraUscita;

    @FXML
    private ComboBox<Integer> choiceBoxMinutiUscita;

    @FXML
    private Button bottoneConfermaSignUp;

    private ObservableList<Integer> listaMinuti = FXCollections.observableArrayList();
    private ObservableList<Integer> listaOre = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int i=1; i<=59; i++){
            listaMinuti.add(i);
        }

        for(int i=0; i<=23; i++){
            listaOre.add(i);
        }

        choiceBoxMinutiIngresso.setItems(listaMinuti);
        choiceBoxMinutiUscita.setItems(listaMinuti);
        choiceBoxOraIngresso.setItems(listaOre);
        choiceBoxOraUscita.setItems(listaOre);
    }

    @FXML
    public void confermaSignUp() {
        if(checkCampi()) {
            System.out.println("Login Effettuato");
        }
        else{
            Alert alert = new Alert(Alert.AlertType.WARNING, "Compilare tutti i campi correttamente.", ButtonType.OK, ButtonType.CANCEL);
            alert.showAndWait();
        }
    }


    // ritorna true se va bene
    //
    @FXML
    public boolean checkCampi(){
        if(checkBoxSiSmartWorking.isSelected() || checkBoxNoSmartWorking.isSelected()){
            if(choiceBoxMinutiIngresso.getValue()==(null) || choiceBoxMinutiUscita.getValue()==(null) || choiceBoxOraUscita.getValue()==(null) || choiceBoxMinutiIngresso==(null)){
                return false;
            } else {
                return true;
            }
        }

        return false;
    }


    @FXML
    public void selectCheckBox(){
        if(checkBoxSiSmartWorking.isSelected()){
            checkBoxNoSmartWorking.setDisable(true);
        }

        if(checkBoxNoSmartWorking.isSelected()){
            checkBoxSiSmartWorking.setDisable(true);
        }

        if(!checkBoxSiSmartWorking.isSelected()){
            checkBoxNoSmartWorking.setDisable(false);
        }

        if(!checkBoxNoSmartWorking.isSelected()){
            checkBoxSiSmartWorking.setDisable(false);
        }
    }
}
