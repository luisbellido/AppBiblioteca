package com.example.shaka.appbiblioteca.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shaka.appbiblioteca.R;
import com.example.shaka.appbiblioteca.Seguridad.Modelo.Libro;

import java.util.ArrayList;

public class AdaptadorLibro extends RecyclerView.Adapter<AdaptadorLibro.ViewHolderLibros> {

    ArrayList<Libro> ListaLibros;

    public AdaptadorLibro(ArrayList<Libro> listaLibros) {
        ListaLibros = listaLibros;
    }

    @NonNull
    @Override
    public ViewHolderLibros onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_lista_libros,null,false);
        return new ViewHolderLibros(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLibro.ViewHolderLibros holder, int position) {
        holder.imagen.setImageResource(ListaLibros.get(position).getImagen());
        holder.titulo.setText(ListaLibros.get(position).getTitulo());
        holder.autor.setText(ListaLibros.get(position).getAutor());
        holder.editorial.setText(ListaLibros.get(position).getEditorial());
    }

    @Override
    public int getItemCount() {
        return ListaLibros.size();
    }

    public class ViewHolderLibros extends RecyclerView.ViewHolder {

        TextView titulo,autor,editorial;
        ImageView imagen;

        public ViewHolderLibros(@NonNull View itemView) {
            super(itemView);

            imagen=(ImageView)itemView.findViewById(R.id.imagenlibro);
            titulo=(TextView)itemView.findViewById(R.id.idtitulo);
            autor=(TextView)itemView.findViewById(R.id.idautor);
            editorial=(TextView)itemView.findViewById(R.id.ideditorial);

        }

    }
}
