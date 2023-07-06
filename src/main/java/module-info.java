module com.example.kurs2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.kurs2 to javafx.fxml;
    exports com.example.kurs2;
}