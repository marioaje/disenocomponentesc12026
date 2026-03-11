package org.example.apis.controller;

import org.example.apis.dao.PersonaProfeDao;
import org.example.apis.model.personasModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonaController {
    private PersonaProfeDao dao = new PersonaProfeDao();

    public void insertar(personasModel personas) {
        dao.insertar(personas);
    }

    public List<personasModel> listar() {
        return dao.listar();
    }

}
