package com.example.dlei.tit;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Act_Solicitarcoleta extends AppCompatActivity {


    private ImageView imagenFelpudo;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__solicitarcoleta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Solicitar Coleta");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imagenFelpudo = (ImageView)findViewById(R.id.animacao);
        imagenFelpudo.setBackgroundResource(R.drawable.animacao_solicitar_coleta);

        AnimationDrawable anima = (AnimationDrawable)imagenFelpudo.getBackground();
        anima.start();

        /* Segue abaixo o codigo para mostra a tela durante um determinado periodo de tempo*/

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent it = new Intent(getApplicationContext(), Act_Informacao_catador.class);
                 startActivity(it);
                 finish();

             }
         }, 3000);

    }

}
