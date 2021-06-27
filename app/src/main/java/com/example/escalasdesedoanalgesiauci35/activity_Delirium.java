   package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

   public class activity_Delirium extends AppCompatActivity {

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8;
    int contador = 0, spiner1, spiner2, spiner3, spiner4, spiner5, spiner6, spiner7, spiner8, bandera;
    String ScoreDelirium;
    CardView TarjetaDelirium;
    TextView txtresultadoScoredelirium, idtitulodelirium, txtinfoDelirium;
   // private TextView ResultadoDelirium;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__delirium);


        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        TarjetaDelirium = (CardView)findViewById(R.id.IDTarjetaDelirium);
        txtinfoDelirium = (TextView)findViewById(R.id.txt_infoDelirium);
        txtresultadoScoredelirium = (TextView)findViewById(R.id.txtresultadoScoredelirium);
        idtitulodelirium = (TextView)findViewById(R.id.id_titulo_Delirium);

        spinner1 = (Spinner)findViewById(R.id.sp_lista_lactante1);
        spinner2 = (Spinner)findViewById(R.id.sp_lista_lactante3);
        spinner3 = (Spinner)findViewById(R.id.sp_lista_lactante2);
        spinner4 = (Spinner)findViewById(R.id.sp_lista_lactante4);
        spinner5 = (Spinner)findViewById(R.id.sp_lista_lactante5);
        spinner6 = (Spinner)findViewById(R.id.sp_lista_lactante6);
        spinner7 = (Spinner)findViewById(R.id.sp_lista_lactante7);
        spinner8 = (Spinner)findViewById(R.id.sp_lista_lactante8);

        bandera = 0;
        TarjetaDelirium.setVisibility(View.GONE);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.lista_delirium, R.layout.spinner_item_delirium);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner1 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                        break;

                    case "Raramente":
                        spiner1 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                        break;

                    case "A veces":
                        spiner1 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                        break;

                    case "Frecuente":
                        spiner1 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                        break;

                    case "Siempre":
                        spiner1 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                        break;

                    default: txtresultadoScoredelirium.setText("Se considera Delirium si el Score es >= 9 ");

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner2 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner2 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner2 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner2 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner2 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner3 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner3 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner3 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner3 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner3 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner4 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner4 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner4 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner4 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner4 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner5 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner5 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner5 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner5 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner5 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner6 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner6 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner6 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner6 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner6 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner7 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner7 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner7 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner7 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner7 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado)
                {
                    case "Nunca":
                        spiner8 = 0;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Raramente":
                        spiner8 = 1;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "A veces":
                        spiner8 = 2;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Frecuente":
                        spiner8 = 3;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");

                        break;

                    case "Siempre":
                        spiner8 = 4;
                        contador = spiner1 + spiner2 + spiner3 + spiner4 + spiner5 + spiner6 + spiner7 + spiner8;
                        ScoreDelirium = String.valueOf(contador);
                        txtresultadoScoredelirium.setText("Score Total:  " +  ScoreDelirium + "\n" +
                                "Se considera Delirium si el Score es >= 9 ");
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


    public void MostrarInfoDelirium(View v){
        if (bandera ==0){
            TarjetaDelirium.setVisibility(View.VISIBLE);
            bandera = 1;
            txtinfoDelirium.setText("La escala de Delirium esta basada en la siguiente puntuacion: \n" +
                    "-----------------------------------------------------------------\n" +
                    " Nunca - 4 Puntos \n" +
                    " Raramente - 3 Puntos \n" +
                    "A veces - 2 Puntos \n" +
                    "Frecuente - 1 Punto \n" +
                    "Siempre - 0 Puntos ");
        } else
            {
                TarjetaDelirium.setVisibility(View.GONE);
                bandera = 0;
            }
    }

}