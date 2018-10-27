package com.example.shaka.appbiblioteca.Seguridad.Controlador;

import com.example.shaka.appbiblioteca.Seguridad.Modelo.Usuario;

import java.util.ArrayList;

public class UsuarioADM {

    //public ArrayList<Usuario> ListaUsuario=new ArrayList<>();
    public static ArrayList<Usuario> ListaUsuario=new ArrayList<>();

    public  UsuarioADM(){
        Usuario usu1 = new Usuario();
        usu1.setDni("47784257");
        usu1.setNombres("George");
        usu1.setApellidoPaterno("Quistan");
        usu1.setGetApellidoMaterno("Adams");
        usu1.setPassword("1234");

        Usuario usu2 = new Usuario();
        usu2.setDni("47784258");
        usu2.setNombres("Alexander");
        usu2.setApellidoPaterno("Quistan");
        usu2.setGetApellidoMaterno("Adams");
        usu2.setPassword("4567");

        Usuario usu3 = new Usuario();
        usu3.setDni("47784259");
        usu3.setNombres("George Alexander");
        usu3.setApellidoPaterno("Quistan");
        usu3.setGetApellidoMaterno("Adams");
        usu3.setPassword("9637");



        ListaUsuario.add(usu1);
        ListaUsuario.add(usu2);
        ListaUsuario.add(usu3);
    }



    public Usuario ValidadUsuario(String dni, String password){
        Usuario usu = null;

        for (int i=0;i<ListaUsuario.size();i++){
            Usuario usuItem=ListaUsuario.get(i);
            if (usuItem.getDni().contentEquals(dni) && usuItem.getPassword().contentEquals(password)){
                usu = new Usuario();
                usu.setDni(usuItem.getDni());
                usu.setNombres(usuItem.getNombres());
                usu.setApellidoPaterno(usuItem.getApellidoPaterno());
                usu.setGetApellidoMaterno(usuItem.getGetApellidoMaterno());
                usu.setPassword(usuItem.getPassword());
            }
        }
        return usu;
    }

    public Boolean RegistrarUsuario(String dni,String nombres,String apellidoPaterno,String ApellidoMaterno,String password){
        Usuario usu =null;
        Boolean registrar=true;
        for (int i=0;i<ListaUsuario.size();i++){
            Usuario usuItem=ListaUsuario.get(i);
            if(usuItem.getDni().contentEquals(dni)){
                registrar= false;
            }
        }

        System.out.println(password);
        if(registrar){
            usu = new Usuario();
            usu.setDni(dni);
            usu.setNombres(nombres);
            usu.setApellidoPaterno(apellidoPaterno);
            usu.setGetApellidoMaterno(ApellidoMaterno);
            usu.setPassword(password);
            ListaUsuario.add(usu);
        }
        return registrar;
    }


}
