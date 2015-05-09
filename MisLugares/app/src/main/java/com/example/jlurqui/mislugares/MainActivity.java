package com.example.jlurqui.mislugares;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    public BaseAdapter adaptador;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adaptador = new AdaptadorLugares(this);
        /*
        adaptador = new ArrayAdapter(this,
                R.layout.elemento_lista,
                R.id.nombre,
                Lugares.listaNombres());
                */
        ListView listView = (ListView) findViewById(R.id.lviLugares);
        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(this);
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
            lanzarPreferencias(null);
            return true;
        } else if (id == R.id.action_about) {
            lanzarAcercaDe(null);
            return true;
        }

        //return super.onOptionsItemSelected(item);
        return true; /** true -> consumimos el item, no se propaga*/
    }

    public void lanzarIntercambio(View vVista) {
        Intent lIntento = new Intent(this, Intercambio1.class);
        startActivity(lIntento);
    }

    public void lanzarAcercaDe(View vVista) {
        Intent lIntento = new Intent(this, AcercaDeActivity.class);
        startActivity(lIntento);
    }

    public void lanzarPreferencias(View vVista) {
        Intent lIntento = new Intent(this, Preferenciass.class);
        startActivity(lIntento);
    }

    @Override
    public void onItemClick(AdapterView parent,View vista,
                               int posicion, long id){
        Intent i = new Intent(this, VistaLugar.class);
        i.putExtra("id", id);
        startActivity(i);
    }
}
