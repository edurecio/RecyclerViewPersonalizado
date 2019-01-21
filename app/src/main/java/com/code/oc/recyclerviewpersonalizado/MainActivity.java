package com.code.oc.recyclerviewpersonalizado;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaPersonajes=new ArrayList<>();
        recyclerPersonajes=findViewById(R.id.RecyclerViewId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        //creamos un método LlenarPersonajes para alimentar la lista
        llenarPersonajes();

        AdaptadorPersonajes adapter=new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);




        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Hommer","Homer Jay Simpson es uno de los protagonistas de la serie. Es el padre de la familia protagonista y uno de los personajes centrales y más importantes de la serie.",R.drawable.hommer));
        listaPersonajes.add(new PersonajeVo("Bart","Bartholomew JoJo «Bart» Simpson, es uno de los protagonistas de la serie. Bart tiene 10 años y es el primogénito, y único hijo varón de Homer y Marge Simpson.",R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Maggie","Margaret Evelyn 'Maggie' Simpson es una de las protagonistas de la serie. Es la tercera hija del matrimonio protagonista, Homer y Marge Simpson, y la más joven de ellos.",R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Lisa","Lisa Marie Simpson es una de las protagonistas de la serie. Es la hija mediana de Homer y Marge Simpson, y hermana de Bart y Maggie. Goza de notable protagonismo y complejidad en la serie.",R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Marge","Marjorie 'Marge' Bouvier Simpson una de los protagonistas de la serie. Es la esposa de Homer Simpson y madre de los tres hijos que ha tenido de esta unión amorosa: Bart, Lisa y Maggie.",R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Burns","Charles Montgomery Burns, más conocido como el señor Burns o Monty Burns, es un personaje ficticio recurrente de la serie de televisión de dibujos animados Los Simpson, creada por Matt Groening. Propietario de la central nuclear donde trabaja Hommer Simpson",R.drawable.burns));
        listaPersonajes.add(new PersonajeVo("Millhouse","Milhouse Mussolini Van Houten es un personaje ficticio de la serie animada Los Simpson, creado por Matt Groening. Gran amigo de Bart Simpson.",R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Flanders","Nedward «Ned» Flanders es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. La voz original en inglés es de Harry Shearer.",R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("Krusty","Herschel Shmoikel Pinkus Yerocham Krustofsky, conocido como Krusty el payaso, es un personaje de la serie de dibujos animados Los Simpson.",R.drawable.krusty));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
