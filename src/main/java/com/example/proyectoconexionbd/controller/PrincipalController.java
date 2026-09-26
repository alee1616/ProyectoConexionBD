package com.example.proyectoconexionbd.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrincipalController {

    @FXML
    private Label lblEstado;

    @FXML
    private void ProbarConexion() {
        try {
            lblEstado.setText("Conexión exitosa");
        } catch (Exception e) {
            lblEstado.setText("Error de conexión.");
            e.printStackTrace();
        }
    }
}
