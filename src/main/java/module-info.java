module hackaton.demo.ecomoving {
    requires javafx.controls;
    requires javafx.fxml;


    opens hackaton.demo.ecomoving to javafx.fxml;
    exports hackaton.demo.ecomoving;
}