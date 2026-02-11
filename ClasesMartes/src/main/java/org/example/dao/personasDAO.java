package org.example.dao;

import org.example.misc.Conexion;
import org.example.models.personasModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class personasDAO {

    //Esto es la capa que trabaja contra la base de datos.
    private Connection conexion;

    public personasDAO() {
        conexion = Conexion.getConexion();
    }

    //CRUD
    public void insertar(personasModel personas) {
        //Preparados que es la mejor opcion
        //Esto evita inyecciones de SQL

        String sql = "INSERT INTO personasProfe (nombre, correo, estado) VALUES (?, ?, ?)";

        try(PreparedStatement miPreparado = conexion.prepareStatement(sql))
        {
            miPreparado.setString(1, personas.getNombre());
            miPreparado.setString(2, personas.getCorreo());
            miPreparado.setString(3, personas.getEstado());
            miPreparado.executeUpdate();
            System.out.println("Insercion de personas exitosamente");
        }catch(SQLException e){
            System.out.println("Error al insertar personas");
        }


    }

}



//personasProfe
//
//CREATE TABLE `u484426513_anac126`.`personas` (
//        `idpersonas` INT NOT NULL AUTO_INCREMENT,
//  `nombre` VARCHAR(45) NOT NULL,
//  `correo` VARCHAR(45) NOT NULL,
//  `estado` VARCHAR(45) NOT NULL,
//PRIMARY KEY (`idpersonas`));