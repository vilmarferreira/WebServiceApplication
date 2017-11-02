package com.example.vilmarferreira.webserviceapplication_listacarros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.URL;

public class ActivityLista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_carro);
        DownloadConteudo downloadConteudo = new DownloadConteudo();

        try
        {
            downloadConteudo.execute(new URL("http://www.livroandroid.com.br/livro/carros/v2/carros_classicos.json"));
        }
        catch (Exception e)
        {

        }
    }
}
