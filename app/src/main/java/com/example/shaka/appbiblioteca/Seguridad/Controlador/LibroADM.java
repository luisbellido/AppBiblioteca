package com.example.shaka.appbiblioteca.Seguridad.Controlador;

import com.example.shaka.appbiblioteca.R;
import com.example.shaka.appbiblioteca.Seguridad.Modelo.Libro;

import java.util.ArrayList;

public class LibroADM {

    ArrayList<Libro> ListaLibros=new ArrayList();

    public  LibroADM(){
        Libro libro1=new Libro();
        libro1.setCodigo("1");
        libro1.setTitulo("One Piece");
        libro1.setAutor("un japonese");
        libro1.setEditorial("okinawa");
        libro1.setImagen(R.drawable.onepiece);

        Libro libro2=new Libro();
        libro2.setCodigo("2");
        libro2.setTitulo("San juan masias");
        libro2.setAutor("San juan masias");
        libro2.setEditorial("peru");
        libro2.setImagen(R.drawable.sjm);

        ListaLibros.add(libro1);
        ListaLibros.add(libro2);


    }
    public ArrayList<Libro> llamarlistaLibro(){

        return ListaLibros;
    }

}
