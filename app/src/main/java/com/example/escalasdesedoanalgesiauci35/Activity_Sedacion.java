package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Sedacion extends AppCompatActivity {

    Spinner spinersedacion;
    TextView txtresultadosedacion;
    RadioGroup grupo;
    String score;
    int valor;
    RadioButton rb_menos3, rb_menos2, rb_menos1, rb_0, rb_1, rb_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sedacion);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

       spinersedacion = findViewById(R.id.spinner_sedacion);

       txtresultadosedacion = (TextView)findViewById(R.id.txt_resultado_score_sedacion);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.lista_sedacion, R.layout.spinner_item_sedacion);
        spinersedacion.setAdapter(adapter);

        spinersedacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado){
                    case "No responde":
                        txtresultadosedacion.setText("Score: -3 ");
                        break;

                    case "Responde a estímulos nociceptivos":
                        txtresultadosedacion.setText("Score: -2 ");
                        break;

                    case "Responde al tocarlo o a la voz":
                        txtresultadosedacion.setText("Score: -1 ");
                        break;

                    case "Despierto o calmo":
                        txtresultadosedacion.setText("Score: 0 ");
                        break;

                    case "Inquieto y dificil de calmar":
                        txtresultadosedacion.setText("Score: 1 ");
                        break;

                    case "Agitado":
                        txtresultadosedacion.setText("Score: 2 ");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }

    // Para colocar el menu en el action bar original.
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    // Para darle funciones a los items del menu
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.menu_item1){
            Intent i = new Intent(this, Activity_Menuversion.class);
            startActivity(i);
        }else if (id == R.id.menu_item2){
            Toast.makeText(this, "Opcion 2", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}