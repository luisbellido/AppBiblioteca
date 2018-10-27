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

public class registrar_usuario extends AppCompatActivity implements View.OnClickListener{


    EditText DNI,nombre,apellidoPat,apellidoMat,password;
    Button btnregistrar,btncancelar;
    UsuarioADM usuarioadm = new UsuarioADM();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        DNI=(EditText)findViewById(R.id.IDdni);
        nombre=(EditText)findViewById(R.id.IDnombres);
        apellidoPat=(EditText)findViewById(R.id.idapepat);
        apellidoMat=(EditText)findViewById(R.id.idapemat);
        password=(EditText)findViewById(R.id.idpassword);

        btnregistrar=(Button) findViewById(R.id.botonregistrar);
        btnregistrar.setOnClickListener(this);
        btncancelar=(Button)findViewById(R.id.botoncancelar);
        btncancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i1= new Intent(this,Login.class);

        switch (v.getId()){
            case R.id.botonregistrar:
                Boolean registrar=true;
                if (!DNI.getText().toString().isEmpty() || !nombre.getText().toString().isEmpty() || !apellidoPat.getText().toString().isEmpty()
                        || !apellidoMat.getText().toString().isEmpty() || !password.getText().toString().isEmpty()){

                    registrar=usuarioadm.RegistrarUsuario(DNI.getText().toString(),nombre.getText().toString(),
                            apellidoPat.getText().toString(),apellidoMat.getText().toString(),password.getText().toString());
                    if(registrar){
                        System.out.println(usuarioadm.ListaUsuario.size());
                        for (Usuario x:usuarioadm.ListaUsuario){
                            System.out.println(x.getDni()+" - "+x.getPassword());
                        }
                    }
                }

                if (registrar==false){
                    Toast.makeText(this, "Ya existe un usuario con ese DNI",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(this, "Usuario registrado",Toast.LENGTH_LONG).show();
                    startActivity(i1);
                }
                break;

            case R.id.botoncancelar :

                startActivity(i1);
                break;

            default:

                break;

        }
    }
}
