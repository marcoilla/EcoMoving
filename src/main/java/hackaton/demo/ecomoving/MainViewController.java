package hackaton.demo.ecomoving;

import javafx.fxml.FXML;

import java.io.IOException;

public class MainViewController {
    MainApp mainApp;

    @FXML
    public void logout() throws IOException {
        mainApp.loginUtente();
    }

    public void setMainApp(MainApp mainApp){
        this.mainApp = mainApp;
    }
}
