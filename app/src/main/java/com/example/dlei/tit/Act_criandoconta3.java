package com.example.dlei.tit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act_criandoconta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_criandoconta3);
    }

    public void voltar(View view){
        Intent it = new Intent(getApplicationContext(), Act_criandoconta2.class);
        startActivity(it);
        finish();
    }

    public void proximo(View view){
        Intent it = new Intent(getApplicationContext(), Act_criandoconta44.class);
        startActivity(it);
        finish();
    }
}
