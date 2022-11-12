module hackaton.demo.ecomoving {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens hackaton.demo.ecomoving to javafx.fxml;
    exports hackaton.demo.ecomoving;
}