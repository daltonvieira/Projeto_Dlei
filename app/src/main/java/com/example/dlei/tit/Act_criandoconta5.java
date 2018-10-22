package com.example.dlei.tit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Act_criandoconta5 extends AppCompatActivity {

    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_criandoconta5);
        imagem = (ImageView) findViewById(R.id.imageid);
    }
    public void voltar(View view){
        Intent it = new Intent(getApplicationContext(), Act_criandoconta44.class);
        startActivity(it);
    }

    public void proximo(View view) {
        Intent it = new Intent(getApplicationContext(), Act_teladelogin.class);
        startActivity(it);
    }

    public void escolherimg(View view){
        Intent it = new Intent(getApplicationContext(), Act_criandoconta44.class);
        startActivity(it);

    }
}
