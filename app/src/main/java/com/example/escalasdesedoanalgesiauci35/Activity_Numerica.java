package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity_Numerica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__numerica);

        //Ponemos el icono de la aplicacion en el action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_logo);

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