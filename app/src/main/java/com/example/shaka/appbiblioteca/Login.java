package com.example.shaka.appbiblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.shaka.appbiblioteca.Seguridad.Controlador.UsuarioADM;
import com.example.shaka.appbiblioteca.Seguridad.Modelo.Usuario;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button btnIngresar;
    Button btnRegistrar;
    EditText usuario;
    EditText Password;
    Usuario usu = new Usuario();
    UsuarioADM usuarioadm = new UsuarioADM();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnIngresar=(Button)findViewById(R.id.button);
        btnIngresar.setOnClickListener(this);
        btnRegistrar=(Button)findViewById(R.id.button2);
        btnRegistrar.setOnClickListener(this);

        usuario=(EditText)findViewById(R.id.editText2);
        Password=(EditText)findViewById(R.id.editText3);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                    if (!usuario.getText().toString().isEmpty() || !Password.getText().toString().isEmpty()){
                        usu = usuarioadm.ValidadUsuario(usuario.getText().toString() ,Password.getText().toString());
                        System.out.println(usuarioadm.ListaUsuario.size());
                        if(usu!=null){
                            Intent i1= new Intent(this,CatalogoLibro.class);
                            i1.putExtra("Udni",usu.getDni());
                            i1.putExtra("Unombres",usu.getNombres());
                            i1.putExtra("UapellidoPaterno",usu.getApellidoPaterno());
                            i1.putExtra("UapellidoMaterno",usu.getGetApellidoMaterno());
                            startActivity(i1);
                        }else{
                            Toast.makeText(this, "Usuario o Contraseña incorrectos",Toast.LENGTH_LONG).show();
                        }
                    }else {
                        Toast.makeText(this, "Ingrese datos",Toast.LENGTH_LONG).show();
                    }
                break;

            case R.id.button2 :
                Intent i2= new Intent(this,registrar_usuario.class);
                startActivity(i2);
                break;

            default:

                break;

        }
    }
}
