package com.code.oc.recyclerviewpersonalizado;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//El Adpatadorpersonajes es el encargado de alimentar el itemListPersonajes
public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {

    //generamos un ArrayList que tiene que contener un objeto, por eso
    //creamos otra clase java (PersonajeVo)
    ArrayList<PersonajeVo> listaPersonajes;

    //generamos el constructor que reciba la lista


    public AdaptadorPersonajes(ArrayList<PersonajeVo> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @NonNull
    @Override
    public ViewHolderPersonajes onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_personajes,null,false);
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersonajes viewHolderPersonajes, int i) {
        //desde donde se llenan los datos
        viewHolderPersonajes.etiNombre.setText(listaPersonajes.get(i).getNombre());
        viewHolderPersonajes.etiInformacion.setText(listaPersonajes.get(i).getInfo());
        viewHolderPersonajes.foto.setImageResource(listaPersonajes.get(i).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformacion;
        ImageView foto;
        public ViewHolderPersonajes(@NonNull View itemView) {
            super(itemView);
            etiNombre=itemView.findViewById(R.id.idNombre);
            etiInformacion=itemView.findViewById(R.id.idInfo);
            foto=itemView.findViewById(R.id.idImagen);
        }
    }
}
