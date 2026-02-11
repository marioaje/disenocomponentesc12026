package org.example.controller;

import org.example.dao.personasDAO;
import org.example.models.personasModel;

import java.util.ArrayList;
import java.util.List;

public class personasController {
    private personasDAO personasDAO = new personasDAO();

    public void insertar(personasModel personas) {
        personasDAO.insertar(personas);
    }

    public List<personasModel> listar() {
        return personasDAO.listar();
    }

}
