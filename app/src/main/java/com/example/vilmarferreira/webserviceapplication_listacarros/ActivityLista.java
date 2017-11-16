package com.example.vilmarferreira.webserviceapplication_listacarros;

import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URL;
import java.util.jar.Manifest;

public class ActivityLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_carro);
        DownloadConteudo downloadConteudo = new DownloadConteudo();

       // ActivityCompat.requestPermissions(this, new String [](android.Manifest.permission.INTERNET, android.Manifest.permission.ACCESS_NETWORK_STATE), 12);
        try
        {
            downloadConteudo.execute(new URL("http://www.livroandroid.com.br/livro/carros/v2/carros_classicos.json"));
        }
        catch (Exception e)
        {

        }
    }
}
