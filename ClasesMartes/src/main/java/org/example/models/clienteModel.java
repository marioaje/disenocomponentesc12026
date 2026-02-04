package org.example.models;

public class clienteModel {

    private String id;

    private String nombre;

    private String apellido;

    private String estado;

    private String usuario;

    public clienteModel(String id, String nombre, String apellido, String estado, String usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.usuario = usuario;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}

//
//Clientes
//Representa un cliente relacionado con un grupo o curso.
//
//        Atributos:
//
//id (String): Identificador único del cliente.
//nombre (String): Nombre del cliente.
//apellidos (String): Apellidos del cliente.
//estado (String): Estado del cliente (e.g., Activo = "1", Inactivo = "0").
//usuario (String): Usuario relacionado con el cliente.