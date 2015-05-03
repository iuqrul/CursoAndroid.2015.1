package com.example.jlurqui.mislugares;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Intercambio1 extends ActionBarActivity {

    EditText edtNombre;
    TextView tevResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intercambio1);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        tevResultado = (TextView) findViewById(R.id.tevResultado);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intercambio1, menu);
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

    public void lanzarIntercambio2(View vVista) {
        Intent lIntento = new Intent(this, Intercambio2.class);
//        lIntento.putExtra("nombre", (edtNombre.getText()));
        lIntento.putExtra("nombre", edtNombre.getText().toString());
        startActivityForResult(lIntento, 1234);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==1234 && resultCode==RESULT_OK) {
            tevResultado.setText(data.getExtras().getString("resultado"));
        } else {
            tevResultado.setText("CANCELADO");
        }
    }
}
