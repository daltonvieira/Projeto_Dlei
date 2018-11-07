package com.example.dlei.tit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act_esquecisenha2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_esquecisenha2);
    }

    public void inicio(View view){
        Intent it = new Intent(getApplicationContext(), Act_teladelogin.class);
        startActivity(it);
        finish();
    }
}
