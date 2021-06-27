package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import static android.widget.Toast.LENGTH_SHORT;

public class Activity_Flacc extends AppCompatActivity {

    RadioGroup rg_cara, rg_piernas, rg_actividad, rg_llanto, rg_consuelo;
    RadioButton rb_cara1,rb_cara2,rb_cara3,rb_pierna1,rb_pierna2,rb_pierna3,rb_actividad1,rb_actividad2,rb_actividad3;
    RadioButton rb_llanto1, rb_llanto2, rb_llanto3, rb_consuelo1, rb_consuelo2, rb_consuelo3;
    TextView resultado_Score, resultadogrupocara, resultadogrupopierna, resultadogrupoactividad, resultadogrupollanto, resultadogrupoconsuelo;
    String score;
    int contador_Cara, contador_Pierna, contador_actividad, contador_llanto, contador_consuelo, contador_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__flacc);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);




        rg_cara = (RadioGroup)findViewById(R.id.rg_cara);
        rg_piernas = (RadioGroup)findViewById(R.id.rg_piernas);
        rg_actividad = (RadioGroup)findViewById(R.id.rg_actividad);
        rg_llanto = (RadioGroup)findViewById(R.id.rg_llanto);
        rg_consuelo = (RadioGroup)findViewById(R.id.rg_consuelo);

        rg_cara.setVisibility(View.GONE);
        rg_piernas.setVisibility(View.GONE);
        rg_actividad.setVisibility(View.GONE);
        rg_llanto.setVisibility(View.GONE);
        rg_consuelo.setVisibility(View.GONE);

        rb_cara1 = (RadioButton)findViewById(R.id.rb_flacc1);
        rb_cara2 = (RadioButton)findViewById(R.id.rb_flacc2);
        rb_cara3 = (RadioButton)findViewById(R.id.rb_flacc3);

        rb_pierna1 = (RadioButton)findViewById(R.id.rb_flacc4);
        rb_pierna2 = (RadioButton)findViewById(R.id.rb_flacc5);
        rb_pierna3 = (RadioButton)findViewById(R.id.rb_flacc6);

        rb_actividad1 = (RadioButton)findViewById(R.id.rb_flacc7);
        rb_actividad2 = (RadioButton)findViewById(R.id.rb_flacc8);
        rb_actividad3 = (RadioButton)findViewById(R.id.rb_flacc9);

        rb_llanto1 = (RadioButton)findViewById(R.id.rb_flacc10);
        rb_llanto2 = (RadioButton)findViewById(R.id.rb_flacc11);
        rb_llanto3 = (RadioButton)findViewById(R.id.rb_flacc12);

        rb_consuelo1 = (RadioButton)findViewById(R.id.rb_flacc13);
        rb_consuelo2 = (RadioButton)findViewById(R.id.rb_flacc14);
        rb_consuelo3 = (RadioButton)findViewById(R.id.rb_flacc15);

        resultado_Score = (TextView)findViewById(R.id.id_ResultadoFlacc);

        resultado_Score.setText(" Resultado del Score ");


        rg_cara.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_flacc1:
                        contador_Cara = 0;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc2:
                        contador_Cara = 1;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc3:
                        contador_Cara = 2;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_piernas.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_flacc4:
                        contador_Pierna = 0;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc5:
                        contador_Pierna = 1;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc6:
                        contador_Pierna = 2;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_actividad.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_flacc7:
                        contador_actividad = 0;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc8:
                        contador_actividad = 1;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc9:
                        contador_actividad = 2;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
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
                    case R.id.rb_flacc10:
                        contador_llanto = 0;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc11:
                        contador_llanto = 1;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc12:
                        contador_llanto = 2;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                }
            }
        });

        rg_consuelo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_flacc13:
                        contador_consuelo = 0;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc14:
                        contador_consuelo = 1;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
                        score = String.valueOf(contador_total);
                        resultado_Score.setText("Score Total: " + score + "\n" + resultadoFinal());
                        break;
                    case R.id.rb_flacc15:
                        contador_consuelo = 2;
                        contador_total = contador_Cara + contador_Pierna + contador_actividad + contador_llanto + contador_consuelo;
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

    public void MostarLista(View view){

            if (rg_cara.getVisibility()==View.GONE){
                rg_cara.setVisibility(View.VISIBLE);
            }else if (rg_cara.getVisibility()==View.VISIBLE){
                    rg_cara.setVisibility(View.GONE);
            }
    }

    public void MostarListaPiernas(View view){

        if (rg_piernas.getVisibility()==View.GONE){
            rg_piernas.setVisibility(View.VISIBLE);
        }else if (rg_piernas.getVisibility()==View.VISIBLE){
            rg_piernas.setVisibility(View.GONE);
        }
    }

    public void MostarListaActividad(View view){

        if (rg_actividad.getVisibility()==View.GONE){
            rg_actividad.setVisibility(View.VISIBLE);
        }else if (rg_actividad.getVisibility()==View.VISIBLE){
            rg_actividad.setVisibility(View.GONE);
        }
    }

    public void MostarListallanto(View view){

        if (rg_llanto.getVisibility()==View.GONE){
            rg_llanto.setVisibility(View.VISIBLE);
        }else if (rg_llanto.getVisibility()==View.VISIBLE){
            rg_llanto.setVisibility(View.GONE);
        }
    }

    public void MostarListaConsuelo(View view){

        if (rg_consuelo.getVisibility()==View.GONE){
            rg_consuelo.setVisibility(View.VISIBLE);
        }else if (rg_consuelo.getVisibility()==View.VISIBLE){
            rg_consuelo.setVisibility(View.GONE);
        }
    }

}