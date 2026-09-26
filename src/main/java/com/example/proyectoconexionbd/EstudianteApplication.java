package com.example.proyectoconexionbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EstudianteApplication extends Application {

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EstudianteApplication.class.getResource("lista-estudiante-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Listado de estudiantes");
        stage.setScene(scene);
        stage.show();
    }
}


