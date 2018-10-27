package com.example.shaka.appbiblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.shaka.appbiblioteca.Adaptadores.AdaptadorLibro;
import com.example.shaka.appbiblioteca.Seguridad.Controlador.LibroADM;
import com.example.shaka.appbiblioteca.Seguridad.Modelo.Libro;

import java.util.ArrayList;

public class CatalogoLibro extends AppCompatActivity {


    ArrayList<Libro> ListaLibro;
    RecyclerView rvlistalibros;

    LibroADM libroadm = new LibroADM();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_libro);

        String Udni= getIntent().getStringExtra("Udni");
        String Unombres =getIntent().getStringExtra("Unombres");
        String UapellidoPaterno =getIntent().getStringExtra("UapellidoPaterno");
        String UapellidoMaterno =getIntent().getStringExtra("UapellidoMaterno");
        Toast.makeText(this, Udni+" "+Unombres+" "+UapellidoPaterno+" " +UapellidoMaterno,Toast.LENGTH_LONG).show();


        ListaLibro=new ArrayList<>();
        rvlistalibros=(RecyclerView)findViewById(R.id.rvlista);
        rvlistalibros.setLayoutManager(new LinearLayoutManager(this));

        ListaLibro=libroadm.llamarlistaLibro();
        AdaptadorLibro adapter=new AdaptadorLibro(ListaLibro);
        rvlistalibros.setAdapter(adapter);

    }
}
