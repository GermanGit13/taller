package com.fhecor.taller.controller;

import com.fhecor.taller.domain.Student;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    //Podríamos conectar con una BBDD
    @FXML
    private TableView<Student> tbData; //Creamos una tabla
    @FXML
    private TableColumn<Student, Integer> studentId; //Creamos las columnas de la tabla parameter el id de la clase domain
    @FXML
    private TableColumn<Student, String> firstName; //Creamos las columnas de la tabla de String para el atributo de la clase domain
    @FXML
    private TableColumn<Student, String> lastName; //Creamos las columnas de la tabla String para el atributo de la clase domain

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentId.setCellValueFactory(new PropertyValueFactory<>("studentId")); //Se inicializan los objetos de la tabla
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName")); //Se inicializan los objetos de la tabla
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName")); //Se inicializan los objetos de la tabla

        /**
         * Datos que se van a visualizar, lo ideal sería conetar con una BBDD
         */
        tbData.setItems(FXCollections.observableArrayList(
                new Student(1, "student1", "lastName1"),
                new Student(2, "student2", "lastName2"),
                new Student(3, "student3", "lastName3"),
                new Student(4, "student4", "lastName4")
        ));
    }
}
