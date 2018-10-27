package com.example.shaka.appbiblioteca.Seguridad.Modelo;

public class Libro {

    private String Codigo;
    private String Titulo;
    private String Autor;
    private  String editorial;
    private int imagen;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Libro(){
    }

    public Libro(String codigo, String titulo, String autor, int imagen) {
        Codigo = codigo;
        Titulo = titulo;
        Autor = autor;
        this.imagen = imagen;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
