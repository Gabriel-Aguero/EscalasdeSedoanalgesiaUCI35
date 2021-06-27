package com.example.escalasdesedoanalgesiauci35;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_acerde extends AppCompatActivity {

    Button btnEnviarmail;
    TextView contenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerde);


        btnEnviarmail = findViewById(R.id.btnenviarmail);
        contenido = findViewById(R.id.txt_acerdecontenido);

        contenido.setText("Mi nombre es Gabriel Aguero soy programador, \n" +
                        " analista en sistemas y Lic. en enfermería. \n" +
                        " Desarrollo aplicaciones para dispositivos móviles, \n" +
                        " de escritorio y sitios web, que logren facilitar las \n" +
                        " tareas de las personas, sacando provecho a los avances tecnológicos. \n\n" +
                        " Si tienes alguna sugerencia o encuentras un Error en esta aplicación, \n" +
                        " puedes enviarme un Email, será de gran ayuda \n" +
                "para mejorar la próxima versión.");


        //Codigo para enviar correo electronico
        btnEnviarmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = "Gabriel, ";
                String mensaje = "Hola mi nombre es ";
                String asunto = "Sugerencia";

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("plain/text");
                i.putExtra(i.EXTRA_TEXT, mensaje + nombre);
                i.putExtra(i.EXTRA_SUBJECT,asunto);

                if (i.resolveActivity(getPackageManager()) != null){
                    startActivity(i);
                } else {
                    Toast.makeText(Activity_acerde.this,"No existe aplicacion para enviar Mail", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}