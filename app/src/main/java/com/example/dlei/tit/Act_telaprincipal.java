package com.example.dlei.tit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Constraints;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class Act_telaprincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        Fragment_MeuPerfil.OnFragmentInteractionListener,
        Fragment_Historico_De_Coleta.OnFragmentInteractionListener,
        Fragment_Contato.OnFragmentInteractionListener,
        Fragmento_Principal.OnFragmentInteractionListener,
        Fragment_Parceiros.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_telaprincipal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        Boolean FragmentoSelecionado = false;

        if (id == R.id.nav_meuperfil) {
            // Handle the camera action
            fragment = new Fragment_MeuPerfil();
            FragmentoSelecionado = true;
            getSupportActionBar().setTitle("Meu Perfil");


        } else if (id== R.id.nav_inicio) {
            //Intent it = new Intent(getApplicationContext(), Act_telaprincipal.class);
            //startActivity(it);
            fragment = new Fragmento_Principal();
            FragmentoSelecionado = true;


        } else if (id == R.id.nav_historico) {
            fragment = new Fragment_Historico_De_Coleta();
            FragmentoSelecionado = true;
            getSupportActionBar().setTitle("Histórico de Coleta");

        } else if (id == R.id.nav_contatos) {
            fragment = new Fragment_Contato();
            FragmentoSelecionado = true;
            getSupportActionBar().setTitle("Contato");

        } else if (id == R.id.nav_parceiros) {
            fragment = new Fragment_Parceiros();
            FragmentoSelecionado = true;
            //getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.fundo));
            getSupportActionBar().setTitle("Parceiros");
        }

        if (FragmentoSelecionado){
            getSupportFragmentManager() .beginTransaction() .replace(R.id.telaprincipal, fragment) .commit();
            ConstraintLayout ocultar = (ConstraintLayout) findViewById(R.id.tela);
            ocultar.setVisibility(View.INVISIBLE);
            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.fundo));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
    }

    public void solicitarcoleta(View view){
        Intent it = new Intent(getApplicationContext(), Act_Solicitarcoleta.class);
        startActivity(it);
    }

}
