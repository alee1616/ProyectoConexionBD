module com.example.proyectoconexionbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.proyectoconexionbd to javafx.fxml;
    exports com.example.proyectoconexionbd;
    exports com.example.proyectoconexionbd.controller to javafx.fxml;
    opens com.example.proyectoconexionbd.controller to javafx.fxml;
}