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
        String param = getIntent().getStringExtra("param");
        if(param.length() > 0){
            param = "Hola! " + param;
            tv2.setText(param);
        }
    }

    public void BotonAnterior(View view){
        Intent anteriorActivity =  new Intent(this,MainActivity.class);
        startActivity(anteriorActivity);
    }
}