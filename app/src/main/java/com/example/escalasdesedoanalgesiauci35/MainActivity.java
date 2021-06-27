package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.lang.reflect.Array;
import java.util.IllegalFormatCodePointException;
import java.util.ResourceBundle;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity {

    int bandera = -1;
    int bandera_dolor = -1;
    ListView listaMenu;
    TextView MensajeAutor, tv_dolor, tv_delirium, tv_sedacion, tv_abstinencia;
    CardView TarjetaMensajeAutor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        tv_dolor = (TextView)findViewById(R.id.id_Menu_Dolor);
        tv_delirium = (TextView)findViewById(R.id.idd_Menu_Delirium);
        tv_sedacion = (TextView)findViewById(R.id.id_Menu_Sedacion);
        tv_abstinencia = (TextView)findViewById(R.id.id_Menu_Dolor);


        // Aqui le doy funcionalidad a la opcion de delirium y hago que aparezca el subMenu
        tv_delirium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] Items = {"Delirium para Pediatria", "Delirium para Lactantes y Niños"};

                int checkedItem = -1;


                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);

                builder.setIcon(R.drawable.ic_cuadrodialogo);
                builder.setTitle("Seleccione una opción");

                builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (bandera == 0){
                            Intent i = new Intent(MainActivity.this, activity_Delirium.class);
                            startActivity(i);
                        } else if (bandera == 1){
                            Intent i = new Intent(MainActivity.this, Activity_delirium_lactantes.class);
                            startActivity(i);
                        }
                    }
                });

                builder.setSingleChoiceItems(Items, checkedItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (which == 0) {
                            bandera = 0;
                        } else if (which == 1){
                            bandera = 1;
                        }
                    }
                });
                builder.show();
            }
        });

        tv_dolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] Items = {"Escala de Dolor Flacc", "Escala Objetive Pain Scale (OPS)","Escala de Dolor Numerica","Escala de Dolor Caritas"};

                int checkedItem = -1;


                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);

                builder.setIcon(R.drawable.ic_cuadrodialogo);
                builder.setTitle("Seleccione una opción");

                builder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }

                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (bandera_dolor == 0){
                            Intent i = new Intent(MainActivity.this, Activity_Flacc.class);
                            startActivity(i);
                        } else if (bandera_dolor == 1){
                            Intent i = new Intent(MainActivity.this, Activity_OPS.class);
                            startActivity(i);
                        } else if (bandera_dolor == 2){
                            Intent i = new Intent(MainActivity.this, Activity_Numerica.class);
                            startActivity(i);
                        } else if (bandera_dolor == 3){
                            Intent i = new Intent(MainActivity.this, Activity_Caritas.class);
                            startActivity(i);
                        }
                    }
                });

                builder.setSingleChoiceItems(Items, checkedItem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (which == 0) {
                            bandera_dolor = 0;
                        } else if (which == 1){
                            bandera_dolor = 1;
                        } else if (which == 2){
                            bandera_dolor = 2;
                        }else if (which == 3){
                            bandera_dolor = 3;
                        }
                    }
                });
                builder.show();
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
            Intent i = new Intent(this, Activity_acerde.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    public void AbrirMenuDelirium(View v){
        Intent i = new Intent(this, activity_Delirium.class);
        startActivity(i);
    }

    public void AbrirMenuSedacion(View v){
        Intent i = new Intent(this, Activity_Sedacion.class);
        startActivity(i);
    }

    public void AbrirMenuAbstinencia(View v){
        Intent i = new Intent(this, Activity_Abstinencia.class);
        startActivity(i);
    }

}