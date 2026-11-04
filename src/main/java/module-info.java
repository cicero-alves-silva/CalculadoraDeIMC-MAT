module com.example.calculadoradeimc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoradeimc to javafx.fxml;
    exports com.example.calculadoradeimc;
}