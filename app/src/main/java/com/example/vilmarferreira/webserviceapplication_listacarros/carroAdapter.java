package com.example.vilmarferreira.webserviceapplication_listacarros;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vilmarferreira.webserviceapplication_listacarros.R;
import com.example.vilmarferreira.webserviceapplication_listacarros.pacote_carro.Carro;

import java.util.List;

/**
 * Created by vilmarferreira on 26/10/2017.
 */

public class carroAdapter extends BaseAdapter {

    private final List<Carro> carros;
    private  final Activity activity;

    public carroAdapter(List<Carro> carros, Activity activity) {
        this.carros = carros;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return carros.size();
    }

    @Override
    public Object getItem(int position) {
        return carros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View celula, ViewGroup parent) {
        if (celula==null)
        {
            celula = this.activity.getLayoutInflater().inflate(R.layout.celula_modelo, null);
        }
        Carro copia = carros.get(position);

        ImageView imagem = celula.findViewById(R.id.imageView);
        TextView nome = celula.findViewById(R.id.txtNome);
        TextView latitude= celula.findViewById(R.id.txtLatitude);
        TextView longitude= celula.findViewById(R.id.txtLongitude);
        Bitmap bitmap = buscaImagem(copia.getUrlFoto());

        imagem.setImageBitmap(bitmap);
        nome.setText(copia.getNome());
        latitude.setText("Latitude: "+copia.getLatitude());
        longitude.setText("Longitude: "+copia.getLongitude());
        return null;
    }

    public Bitmap buscaImagem (String ender)
    {
        return null;
    }
}
