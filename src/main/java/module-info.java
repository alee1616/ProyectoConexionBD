module com.example.proyectoconexionbd {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    requires org.postgresql.jdbc;

    exports com.example.proyectoconexionbd;

    opens com.example.proyectoconexionbd to javafx.fxml;
    opens com.example.proyectoconexionbd.model to javafx.base;
    opens com.example.proyectoconexionbd.controller to javafx.fxml;
}