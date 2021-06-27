package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_dolor extends AppCompatActivity {

    ListView lista_escalaMenu;
    TextView items1, items2, items3, items4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolor);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

        items1 = (TextView)findViewById(R.id.itemsDolor1);
        items2 = (TextView)findViewById(R.id.itemsDolor2);
        items3 = (TextView)findViewById(R.id.itemsDolor3);
        items4 = (TextView)findViewById(R.id.itemsDolor4);

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

    public void AbrirFlacc(View v){
        Intent i = new Intent(this, Activity_Flacc.class);
        startActivity(i);
    }

    public void AbrirOPS(View v){
        Intent i = new Intent(this, Activity_OPS.class);
        startActivity(i);
    }

    public void AbrirNumerica(View v){
        Intent i = new Intent(this, Activity_Numerica.class);
        startActivity(i);
    }

    public void AbrirCaritas(View v){
        Intent i = new Intent(this, Activity_Caritas.class);
        startActivity(i);
    }
}