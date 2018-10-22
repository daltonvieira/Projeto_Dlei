package com.example.dlei.tit;

import android.app.ActionBar;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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
    }

}
