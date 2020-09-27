package com.example.semana1tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Et_peso,Et_altura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Et_peso = (EditText) findViewById(R.id.et_peso);
        Et_altura = (EditText) findViewById(R.id.et_altura);



    }

    public void CalcularOnClick(View view){
        try{
            double peso = Double.parseDouble(Et_peso.getText().toString());
            double altura = Double.parseDouble(Et_altura.getText().toString());

            Intent i = new Intent(this, MainActivity2.class);

            i.putExtra("peso",peso);
            i.putExtra("altura",altura);

            startActivity(i);
        }catch(Exception e){
            Toast.makeText(this,"complete el texto",Toast.LENGTH_SHORT).show();

        }



    }

}