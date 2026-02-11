package org.example.models;

public class personasModel {

    private int idpersonas;
    private String nombre;
    private String correo;
    private String estado;

    public personasModel() {

    }

    public personasModel(int idpersonas, String nombre, String correo, String estado) {
        this.idpersonas = idpersonas;
        this.nombre = nombre;
        this.correo = correo;
        this.estado = estado;
    }


    public int getIdpersonas() {
        return idpersonas;
    }

    public void setIdpersonas(int idpersonas) {
        this.idpersonas = idpersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

