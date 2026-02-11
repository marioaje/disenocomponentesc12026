package org.example;

import org.example.controller.personasController;
import org.example.misc.Conexion;
import org.example.models.personasModel;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Connection conexion = Conexion.getConexion();
        if (conexion != null) {
            System.out.println("Conexion establecida");
        }

        personasController personasController = new personasController();
        personasController.insertar(
                new personasModel(
                        0,
                        "Mario",
                        "Correo mario",
                        "Activo"
                )
        );

    }
}