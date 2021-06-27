package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Abstinencia extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11, cb12, cb13, cb14, cb15;
    TextView valorResultadoScore;
    String score;
    int valor, contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__abstinencia);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        cb1 = (CheckBox)findViewById(R.id.cbitems1);
        cb2 = (CheckBox)findViewById(R.id.cbitems2);
        cb3 = (CheckBox)findViewById(R.id.cbitems3);
        cb4 = (CheckBox)findViewById(R.id.cbitems4);
        cb5 = (CheckBox)findViewById(R.id.cbitems5);
        cb6 = (CheckBox)findViewById(R.id.cbitems6);
        cb7 = (CheckBox)findViewById(R.id.cbitems7);
        cb8 = (CheckBox)findViewById(R.id.cbitems8);
        cb9 = (CheckBox)findViewById(R.id.cbitems9);
        cb10 = (CheckBox)findViewById(R.id.cbitems10);
        cb11 = (CheckBox)findViewById(R.id.cbitems11);
        cb12 = (CheckBox)findViewById(R.id.cbitems12);
        cb13 = (CheckBox)findViewById(R.id.cbitems13);
        cb14 = (CheckBox)findViewById(R.id.cbitems14);
        cb15 = (CheckBox)findViewById(R.id.cbitems15);

        valorResultadoScore = (TextView)findViewById(R.id.id_ResultadoAbstinencia);
        valorResultadoScore.setText(" Resultado de Score: ");

        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
            }
        });

        cb15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CompoundButton) v).isChecked()){
                    contador = contador + 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                } else {
                    contador = contador - 1;
                    score = String.valueOf(contador);
                    valorResultadoScore.setText("Score Total: " + score + " \n" +
                            "Un Score >= 4 indica sindrome de abstinencia");
                }
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