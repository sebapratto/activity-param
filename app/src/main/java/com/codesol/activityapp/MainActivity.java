package com.codesol.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etIngresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIngresa = findViewById(R.id.etIngresa);

    }

    public void PrimerBoton(View view){
        String nombre = etIngresa.getText().toString();
        Intent segundo =  new Intent(this, SegundoActivity.class);
        segundo.putExtra("dato",nombre);
        startActivity(segundo);
    }

}