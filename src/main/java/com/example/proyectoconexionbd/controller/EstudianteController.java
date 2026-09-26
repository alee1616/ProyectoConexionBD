package com.example.proyectoconexionbd.controller;

import com.example.proyectoconexionbd.connection.DatabaseConnection;
import com.example.proyectoconexionbd.model.Estudiante;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class EstudianteController {

    @FXML
    private TableView<Estudiante> tblListaEstudiante;
    @FXML
    private TableColumn<Estudiante, Integer> colId;
    @FXML
    private TableColumn<Estudiante, String> colNombre;
    @FXML
    private TableColumn<Estudiante, String> colCorreo;
    @FXML
    private TableColumn<Estudiante, String> colCarrera;
    @FXML
    private TableColumn<Estudiante, String> colTelefono;
    @FXML
    private TableColumn<Estudiante, Integer> colEdad;
    @FXML
    private TableColumn<Estudiante, LocalDate> colFechaIngreso;
    @FXML
    private TableColumn<Estudiante, BigDecimal> colPromedio;

    private final ObservableList<Estudiante> listaEstudiante = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));
        colCarrera.setCellValueFactory(new PropertyValueFactory<>("carrera"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        colFechaIngreso.setCellValueFactory(new PropertyValueFactory<>("fechaIngreso"));
        colPromedio.setCellValueFactory(new PropertyValueFactory<>("promedio"));
    }

    @FXML
    private void cargarEstudiantes() {
        listaEstudiante.clear();

        String sql = "SELECT id, nombre, correo, carrera, telefono, edad, fecha_ingreso, promedio FROM estudiante";

        try (
                Connection connection = DatabaseConnection.getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)
        ) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String correo = resultSet.getString("correo");
                String carrera = resultSet.getString("carrera");
                String telefono = resultSet.getString("telefono");
                int edad = resultSet.getInt("edad");

                // Convertir Date de SQL a LocalDate
                Date fechaSql = resultSet.getDate("fecha_ingreso");
                LocalDate fechaIngreso = fechaSql != null ? fechaSql.toLocalDate() : null;

                BigDecimal promedio = resultSet.getBigDecimal("promedio");

                Estudiante estudiante = new Estudiante(id, nombre, correo, carrera,
                        telefono, edad, fechaIngreso, promedio);
                listaEstudiante.add(estudiante);
            }

            tblListaEstudiante.setItems(listaEstudiante);

        } catch (SQLException ex){
            System.out.println("Error al cargar estudiantes: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}