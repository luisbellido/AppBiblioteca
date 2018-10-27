package com.example.shaka.appbiblioteca;

import com.example.shaka.appbiblioteca.Seguridad.Controlador.UsuarioADM;
import com.example.shaka.appbiblioteca.Seguridad.Modelo.Usuario;

public class test {

    public static void main(String[]args){

        UsuarioADM usuario = new UsuarioADM();
        Boolean registro= true;
        registro=usuario.RegistrarUsuario("46236072","awd","awd","awdaw","awda");

        if (registro){
            System.out.println("registro");
        }else {
            System.out.println(registro);
        }

        System.out.println(usuario.ValidadUsuario("46236072","awda"));
    }
}
