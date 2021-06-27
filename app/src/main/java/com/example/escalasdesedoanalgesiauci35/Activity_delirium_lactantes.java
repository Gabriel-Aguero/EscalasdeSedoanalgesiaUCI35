package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

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

public class Activity_delirium_lactantes extends AppCompatActivity {

    Spinner spinner1,spinner2,spinner3,spinner4,spinner5,spinner6,spinner7,spinner8, spinner_edad;
    int contador = 0, spiner1, spiner2, spiner3, spiner4, spiner5, spiner6, spiner7, spiner8, bandera;
    String ScoreDelirium;
    TextView txtresultadoScoredelirium, idtitulodelirium, txtinfoDelirium, txt_opcion1,txt_opcion2,txt_opcion3,txt_opcion4,txt_opcion5,txt_opcion6,txt_opcion7,txt_opcion8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delirium_lactantes);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        txt_opcion1 = (TextView)findViewById(R.id.txt_opcion1);
        txt_opcion2 = (TextView)findViewById(R.id.txt_opcion2);
        txt_opcion3 = (TextView)findViewById(R.id.txt_opcion3);
        txt_opcion4 = (TextView)findViewById(R.id.txt_opcion4);
        txt_opcion5 = (TextView)findViewById(R.id.txt_opcion5);
        txt_opcion6 = (TextView)findViewById(R.id.txt_opcion6);
        txt_opcion7 = (TextView)findViewById(R.id.txt_opcion7);
        txt_opcion8 = (TextView)findViewById(R.id.txt_opcion8);
        txtinfoDelirium = (TextView)findViewById(R.id.txt_infoDelirium);
        txtresultadoScoredelirium = (TextView)findViewById(R.id.txtresultadoScoredelirium);
        idtitulodelirium = (TextView)findViewById(R.id.id_titulo_Delirium);

        spinner_edad = (Spinner)findViewById(R.id.sp_lista_edad);
        spinner1 = (Spinner)findViewById(R.id.sp_lista_lactante1);
        spinner2 = (Spinner)findViewById(R.id.sp_lista_lactante3);
        spinner3 = (Spinner)findViewById(R.id.sp_lista_lactante2);
        spinner4 = (Spinner)findViewById(R.id.sp_lista_lactante4);
        spinner5 = (Spinner)findViewById(R.id.sp_lista_lactante5);
        spinner6 = (Spinner)findViewById(R.id.sp_lista_lactante6);
        spinner7 = (Spinner)findViewById(R.id.sp_lista_lactante7);
        spinner8 = (Spinner)findViewById(R.id.sp_lista_lactante8);

        ArrayAdapter<CharSequence> listaedad= ArrayAdapter.createFromResource(this, R.array.lista_delirium_edad, R.layout.spinner_item_delirium_edades);
        spinner_edad.setAdapter(listaedad);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.lista_delirium, R.layout.spinner_item_delirium);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
        spinner8.setAdapter(adapter);

        spinner_edad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();

                switch (indiceSeleccionado){
                    case "Recién Nacido":
                        txt_opcion1.setHint(R.string.txt_rn1);
                        txt_opcion2.setHint(R.string.txt_rn2);
                        txt_opcion3.setHint(R.string.txt_rn3);
                        txt_opcion4.setHint(R.string.txt_rn4);
                        txt_opcion5.setHint(R.string.txt_rn5);
                        txt_opcion6.setHint(R.string.txt_rn6);
                        txt_opcion7.setHint(R.string.txt_rn7);
                        txt_opcion8.setHint(R.string.txt_rn8);
                        break;

                    case "4 Semanas":
                        txt_opcion1.setHint(R.string.txt_4s1);
                        txt_opcion2.setHint(R.string.txt_4s2);
                        txt_opcion3.setHint(R.string.txt_4s3);
                        txt_opcion4.setHint(R.string.txt_4s4);
                        txt_opcion5.setHint(R.string.txt_4s5);
                        txt_opcion6.setHint(R.string.txt_4s6);
                        txt_opcion7.setHint(R.string.txt_4s7);
                        txt_opcion8.setHint(R.string.txt_4s8);
                        break;

                    case "6 Semanas":
                        txt_opcion1.setHint(R.string.txt_6semanas1);
                        txt_opcion2.setHint(R.string.txt_6semanas2);
                        txt_opcion3.setHint(R.string.txt_6semanas3);
                        txt_opcion4.setHint(R.string.txt_6semanas4);
                        txt_opcion5.setHint(R.string.txt_6semanas5);
                        txt_opcion6.setHint(R.string.txt_6semanas6);
                        txt_opcion7.setHint(R.string.txt_6semanas7);
                        txt_opcion8.setHint(R.string.txt_6semanas8);
                        break;

                    case "8 Semanas (2m)":
                        txt_opcion1.setHint(R.string.txt_8semanas1);
                        txt_opcion2.setHint(R.string.txt_8semanas2);
                        txt_opcion3.setHint(R.string.txt_8semanas3);
                        txt_opcion4.setHint(R.string.txt_8semanas4);
                        txt_opcion5.setHint(R.string.txt_8semanas5);
                        txt_opcion6.setHint(R.string.txt_8semanas6);
                        txt_opcion7.setHint(R.string.txt_8semanas7);
                        txt_opcion8.setHint(R.string.txt_8semanas8);
                        break;

                    case "28 Semanas (7m)":
                        txt_opcion1.setHint(R.string.txt_28semanas1);
                        txt_opcion2.setHint(R.string.txt_28semanas2);
                        txt_opcion3.setHint(R.string.txt_28semanas3);
                        txt_opcion4.setHint(R.string.txt_28semanas4);
                        txt_opcion5.setHint(R.string.txt_28semanas5);
                        txt_opcion6.setHint(R.string.txt_28semanas6);
                        txt_opcion7.setHint(R.string.txt_28semanas7);
                        txt_opcion8.setHint(R.string.txt_28semanas8);
                        break;

                    case "1 Año":
                        txt_opcion1.setHint(R.string.txt_1año1);
                        txt_opcion2.setHint(R.string.txt_1año2);
                        txt_opcion3.setHint(R.string.txt_1año3);
                        txt_opcion4.setHint(R.string.txt_1año4);
                        txt_opcion5.setHint(R.string.txt_1año5);
                        txt_opcion6.setHint(R.string.txt_1año6);
                        txt_opcion7.setHint(R.string.txt_1año7);
                        txt_opcion8.setHint(R.string.txt_1año8);
                        break;

                    case "2 Año":
                        txt_opcion1.setHint(R.string.txt_2año1);
                        txt_opcion2.setHint(R.string.txt_2año2);
                        txt_opcion3.setHint(R.string.txt_2año3);
                        txt_opcion4.setHint(R.string.txt_2año4);
                        txt_opcion5.setHint(R.string.txt_2año5);
                        txt_opcion6.setHint(R.string.txt_2año6);
                        txt_opcion7.setHint(R.string.txt_2año7);
                        txt_opcion8.setHint(R.string.txt_2año8);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String indiceSeleccionado = parent.getItemAtPosition(position).toString();
               // int idseleccionado = parent.getSelectedItemPosition(); con esto selecciono la posicion del elemento de la lista
              //  String valor = String.valueOf(idseleccionado);
              //  txtresultadoScoredelirium.setText(valor);

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

}