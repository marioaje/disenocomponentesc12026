package org.example.controller;

import org.example.dao.personasDAO;
import org.example.models.personasModel;

public class personasController {
    private personasDAO personasDAO = new personasDAO();

    public void insertar(personasModel personas) {
        personasDAO.insertar(personas);
    }

}
