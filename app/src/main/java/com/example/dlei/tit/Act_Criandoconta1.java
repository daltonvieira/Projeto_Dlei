package com.example.dlei.tit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act_Criandoconta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__criandoconta1);
    }


    public void voltar(View view){
        Intent it = new Intent(getApplicationContext(), Act_bemvindo.class);
        startActivity(it);
    }

    public void proximo(View view){
        Intent it = new Intent(getApplicationContext(), Act_criandoconta2.class);
        startActivity(it);
    }
}
