package com.example.semana1tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView imcresultado,imcresultado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imcresultado = (TextView) findViewById(R.id.et_imc);
        imcresultado2 = (TextView) findViewById(R.id.et_recomendacion);


        Intent i = getIntent();
        double peso = i.getDoubleExtra("peso",0);
        double altura = i.getDoubleExtra("altura",0);
        double imc= (peso/Math.pow(altura,2));
        imcresultado.setText(String.valueOf(imc));

        if (imc<18.5){
            imcresultado2.setText(R.string.recomendacion1);
        }else if (imc>18 && imc <24.9){
            imcresultado2.setText(R.string.recomendacion2);
        }
        else if (imc>25 && imc < 29.9){
            imcresultado2.setText(R.string.recomendacion3);
        }else {
            imcresultado2.setText(R.string.recomendacion4);
        }



    }
    public void VolverOnClick(View v){

        super.onBackPressed();
    }
}