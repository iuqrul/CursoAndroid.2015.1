package com.example.jlurqui.mislugares;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Intercambio2 extends ActionBarActivity {

    TextView tevPregunta;
    String sNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intercambio2);
        TextView tevPregunta = (TextView) findViewById(R.id.tevPregunta);
        Bundle extras = getIntent().getExtras();
        sNombre = extras.getString("nombre");
        tevPregunta.setText("Hola " + sNombre + ", ¿aceptas las condiciones?");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intercambio2, menu);
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

    public void lanzarAceptar(View vVista) {
        Intent lIntento = new Intent();
        lIntento.putExtra("resultado", sNombre + ": ACEPTADO");
        setResult(RESULT_OK, lIntento);
        finish();
    }

    public void lanzarCancelar(View vVista) {
        finish();
    }

}