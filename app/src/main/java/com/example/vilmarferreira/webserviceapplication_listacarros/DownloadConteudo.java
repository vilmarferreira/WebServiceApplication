package com.example.vilmarferreira.webserviceapplication_listacarros;

import android.app.DownloadManager;
import android.os.AsyncTask;

import com.example.vilmarferreira.webserviceapplication_listacarros.pacote_carro.Carro;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by vilmarferreira on 26/10/2017.
 */

public class DownloadConteudo extends AsyncTask<URL,Void, ArrayList>
{
    //Metodo que executa a Thread em segundo plano
    @Override
    protected ArrayList<Carro> doInBackground(URL...urls) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(urls[0]).build();

        try {
            Response response = client.newCall(request).execute();

            String teste= response.body().string();
            teste+="";


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Metodo que executa apos a conclusao da Thread
    //Codigo chamado ja na tread principal
    public void onPostExecute(ArrayList<Carro> carros)
    {

    }

}
