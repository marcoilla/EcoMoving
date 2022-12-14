package hackaton.demo.ecomoving;

import hackaton.demo.ecomoving.model.Gestionale;
import hackaton.demo.ecomoving.model.Utente;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    // dichiarazione della variabile gestionale che deve essere accessibile a tutti i controller
    private static Gestionale gestionaleUtenti = new Gestionale();
    private Utente utenteTest;

    private Stage mainWindow = new Stage(); // finestre principale

    @Override
    public void start(Stage stage) throws IOException {
        loginUtente();
    }

    // variabile getter per ottenere il gestionale
    public Gestionale getGestionaleUtenti() {
        return gestionaleUtenti;
    }

    public void addUtenteToGestionale(Utente utente) {
        gestionaleUtenti.addUtente(utente);
    }

    public void singUpUtente() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup-dati-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 800);
        mainWindow.close(); // chiusura login
        mainWindow = new Stage(); // creazione di una nuova finestra per visualizzarla al centro
        mainWindow.setTitle("SingUp");
        mainWindow.setScene(scene);
        mainWindow.setResizable(false);
        mainWindow.show();

        // creazione e set del controller
        SignUpDatiController signUpDatiController = fxmlLoader.getController();
        signUpDatiController.setMainApp(this);
    }

    public void loginUtente() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 800);
        mainWindow.close(); // chiusura login
        mainWindow = new Stage(); // creazione di una nuova finestra per visualizzarla al centro
        mainWindow.setTitle("Login");
        mainWindow.setScene(scene);
        mainWindow.setResizable(false);
        mainWindow.show();

        // creazione e set del controller
        LoginController loginController = fxmlLoader.getController();
        loginController.setMainApp(this);
    }

    public void mainPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 800);
        mainWindow.close(); // chiusura login
        mainWindow = new Stage(); // creazione di una nuova finestra per visualizzarla al centro
        mainWindow.setTitle("EcoMoving");
        mainWindow.setScene(scene);
        mainWindow.setResizable(false);
        mainWindow.show();

        // creazione e set del controller
        MainViewController mainViewCOntroller = fxmlLoader.getController();
        mainViewCOntroller.setMainApp(this);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        launch();
    }
    public Utente getUtenteTest() {
        return utenteTest;
    }

    public void setUtenteTest(Utente u) {
        this.utenteTest = u;
    }

    public MainApp getMainApp() {
        return this;
    }
}