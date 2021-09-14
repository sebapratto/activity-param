package com.codesol.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tv2 = findViewById(R.id.tv2);
        String param = getIntent().getStringExtra("dato");
        if(param.length() > 0){
            tv2.setText("Hola! " + param);
        }
    }

    public void BotonAnterior(View view){
        Intent anterior =  new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
}