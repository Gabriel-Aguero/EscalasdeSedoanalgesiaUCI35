package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_OPS extends AppCompatActivity {

    RadioGroup rg_ta, rg_llanto, rg_movimiento, rg_agitacion, rg_evaluacionverbal;
    RadioButton rb_ops1, rb_ops2, rb_ops3, rb_ops4, rb_ops5, rb_ops6, rb_ops7, rb_ops8, rb_ops9, rb_ops10, rb_ops11, rb_ops12, rb_ops13, rb_ops14, rb_ops15;
    int contador_TA, contador_movimiento, contador_agitacion, contador_llanto, contador_evaluacionVerbal, contador_total;
    String score;
    TextView resultado_Score, resultado_TA, resultado_llanto, resultado_movimiento, resultado_agitacion, resultado_evaluacionVerbal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__o_p_s);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        resultado_Score = (TextView)findViewById(R.id.id_ResultadoScoreOPS);
        rg_ta = (RadioGroup)findViewById(R.id.rg_TA);
        rg_llanto = (RadioGroup)findViewById(R.id.rg_opsllanto);
        rg_movimiento = (RadioGroup)findViewById(R.id.rg_movimiento);
        rg_agitacion = (RadioGroup)findViewById(R.id.rg_agitacion);
        rg_evaluacionverbal = (RadioGroup)findViewById(R.id.rg_evaluacionVerbal);

        rg_ta.setVisibility(View.GONE);
        rg_llanto.setVisibility(View.GONE);
        rg_movimiento.setVisibility(View.GONE);
        rg_agitacion.setVisibility(View.GONE);
        rg_evaluacionverbal.setVisibility(View.GONE);

        rb_ops1 = (RadioButton)findViewById(R.id.rb_ops1);
        rb_ops2 = (RadioButton)findViewById(R.id.rb_ops2);
        rb_ops3 = (RadioButton)findViewById(R.id.rb_ops3);
        rb_ops4 = (RadioButton)findViewById(R.id.rb_ops4);
        rb_ops5 = (RadioButton)findViewById(R.id.rb_ops5);
        rb_ops6 = (RadioButton)findViewById(R.id.rb_ops6);
        rb_ops7 = (RadioButton)findViewById(R.id.rb_ops7);
        rb_ops8 = (RadioButton)findViewById(R.id.rb_ops8);
        rb_ops9 = (RadioButton)findViewById(R.id.rb_ops9);
        rb_ops10 = (RadioButton)findViewById(R.id.rb_ops10);
        rb_ops11 = (RadioButton)findViewById(R.id.rb_ops11);
        rb_ops12 = (RadioButton)findViewById(R.id.rb_ops12);
        rb_ops13 = (RadioButton)findViewById(R.id.rb_ops13);
        rb_ops14 = (RadioButton)findViewById(R.id.rb_ops14);
        rb_ops15 = (RadioButton)findViewById(R.id.rb_ops15);

        resultado_Score.setText(" Resultado de Score ");

        rg_ta.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_ops1:
                        contador_TA = 0;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops2:
                        contador_TA = 1;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops3:
                        contador_TA = 2;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_llanto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_ops4:
                        contador_llanto = 0;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops5:
                        contador_llanto = 1;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops6:
                        contador_llanto = 2;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_movimiento.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_ops7:
                        contador_movimiento = 0;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops8:
                        contador_movimiento = 1;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops9:
                        contador_movimiento = 2;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_agitacion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_ops10:
                        contador_agitacion = 0;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops11:
                        contador_agitacion = 1;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops12:
                        contador_agitacion = 2;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_evaluacionverbal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_ops13:
                        contador_evaluacionVerbal = 0;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);

                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops14:
                        contador_evaluacionVerbal = 1;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_ops15:
                        contador_evaluacionVerbal = 2;
                        contador_total = contador_TA + contador_llanto + contador_movimiento + contador_agitacion + contador_evaluacionVerbal;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
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

    public String resultadoFinal(){
        String valoracion = null;
        if (contador_total == 0){
            valoracion = "0: Sin dolor";
        }

        if (contador_total == 1 || contador_total == 2){
            valoracion = "1-2: Dolor leve";
        }
        if (contador_total == 3 || contador_total == 4 || contador_total == 5){
            valoracion = "3-5: Dolor moderado";
        }
        if (contador_total == 6 || contador_total == 7 || contador_total == 8){
            valoracion = "6-8: Dolor Intenso";
        }
        if (contador_total == 9 || contador_total == 10){
            valoracion = "9-10: Dolor Insoportable ";
        }

        return valoracion;
    }

     public void Lista_ops_ta(View view){

        if (rg_ta.getVisibility()==View.GONE){
            rg_ta.setVisibility(View.VISIBLE);
        }else if (rg_ta.getVisibility()==View.VISIBLE){
            rg_ta.setVisibility(View.GONE);
        }
    }

    public void Lista_ops_llanto(View view){

        if (rg_llanto.getVisibility()==View.GONE){
            rg_llanto.setVisibility(View.VISIBLE);
        }else if (rg_llanto.getVisibility()==View.VISIBLE){
            rg_llanto.setVisibility(View.GONE);
        }
    }

    public void Lista_ops_movimiento(View view){

        if (rg_movimiento.getVisibility()==View.GONE){
            rg_movimiento.setVisibility(View.VISIBLE);
        }else if (rg_movimiento.getVisibility()==View.VISIBLE){
            rg_movimiento.setVisibility(View.GONE);
        }
    }

    public void Lista_ops_agitacion(View view){

        if (rg_agitacion.getVisibility()==View.GONE){
            rg_agitacion.setVisibility(View.VISIBLE);
        }else if (rg_agitacion.getVisibility()==View.VISIBLE){
            rg_agitacion.setVisibility(View.GONE);
        }
    }

    public void Lista_ops_evaluacionVerbal(View view){

        if (rg_evaluacionverbal.getVisibility()==View.GONE){
            rg_evaluacionverbal.setVisibility(View.VISIBLE);
        }else if (rg_evaluacionverbal.getVisibility()==View.VISIBLE){
            rg_evaluacionverbal.setVisibility(View.GONE);
        }
    }

}