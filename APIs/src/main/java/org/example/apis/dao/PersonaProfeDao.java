package org.example.apis.dao;

import org.example.apis.config.Conexion;
import org.example.apis.model.personasModel;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaProfeDao {

    private Connection conexion;

    public PersonaProfeDao(){
        conexion = Conexion.getConexion();
    }

    //Create
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

    public List<personasModel> listar(){
        List<personasModel> listaDatos = new ArrayList<>();

        String sql = "SELECT * FROM personasProfe";

        try(Statement miConsulta = conexion.createStatement();
            ResultSet resultSet = miConsulta.executeQuery(sql)
        ){

            while(resultSet.next()){
                personasModel objeto = new personasModel();

                objeto.setIdpersonas(resultSet.getInt("idpersonas"));
                objeto.setNombre(resultSet.getString("nombre"));
                objeto.setCorreo(resultSet.getString("correo"));
                objeto.setEstado(resultSet.getString("estado"));

                listaDatos.add(objeto);

            }

        } catch (SQLException e) {
            System.out.println("Error al consultar personas");
        }

        return listaDatos;
    }


}
