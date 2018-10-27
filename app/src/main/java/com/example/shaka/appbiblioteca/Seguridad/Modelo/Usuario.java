package com.example.shaka.appbiblioteca.Seguridad.Modelo;

public class Usuario {

    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String getApellidoMaterno;
    private String password;

    public  Usuario(){
    }

    public Usuario(String dni, String nombres, String apellidoPaterno, String getApellidoMaterno, String usuario, String password) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.getApellidoMaterno = getApellidoMaterno;
        this.password = password;
        System.out.println(password);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getGetApellidoMaterno() {
        return getApellidoMaterno;
    }

    public void setGetApellidoMaterno(String getApellidoMaterno) {
        this.getApellidoMaterno = getApellidoMaterno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + dni + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", getApellidoMaterno='" + getApellidoMaterno + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
