package com.example.dlei.tit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act_teladelogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_teladelogin);
    }

    public void voltar(View view){
        Intent it = new Intent(getApplicationContext(), Act_teladelogin.class);
        startActivity(it);
        finish();
    }

    public void proximo(View view){
        Intent it = new Intent(getApplicationContext(), Act_telaprincipal.class);
        startActivity(it);
        finish();

    }

    public void txtlinkado(View view){
        Intent it = new Intent(getApplicationContext(), Act_esquecisenha.class);
        startActivity(it);
        finish();
    }
}
