package com.codesol.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
    }

    public void PrimerBoton(View view){
        Intent segundoActivity =  new Intent(this, SegundoActivity.class);
        segundoActivity.putExtra("param",et1.getText().toString());
        startActivity(segundoActivity);
    }

}