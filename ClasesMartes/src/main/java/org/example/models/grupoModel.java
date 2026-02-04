package org.example.models;

public class grupoModel {

    private String id;
    private String nombre;
    private String estado;

    public grupoModel(String id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

//
//Grupo
//Representa un grupo asociado a un curso.
//
//        Atributos:
//
//id (String): Identificador único del grupo.
//nombre (String): Nombre del grupo.
//estado (String): Estado del grupo (e.g., Activo o Inactivo).