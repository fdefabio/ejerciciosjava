package com.Persona;

public class persona {
    String nombre;
    String apellidos;
    String id;
    String correo;
    String pais;
    int edad;


    public persona(){}

    public persona( String nombre , String apellido , String id , String correo , String pais , int edad){
        this.nombre    = nombre;
        this.apellidos = apellido;
        this.id        = id;
        this.correo    = correo;
        this.pais      = pais;
        this.edad      = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
