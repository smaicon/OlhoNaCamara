package com.codemaicon.olhonacamara.activitys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.codemaicon.olhonacamara.R;
import com.codemaicon.olhonacamara.model.Vereador;

import java.util.ArrayList;

/**
 * Created by Maicon on 29/11/2017.
 */

class MyAdapter extends BaseAdapter {
    private ArrayList <Vereador> listVereadores;
    private LayoutInflater inflater;


    public MyAdapter(ArrayList<Vereador> listVereadores, Context context) {
        this.listVereadores = listVereadores;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return listVereadores.size();
    }

    @Override
    public Object getItem(int i) {return listVereadores.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Vereador vereador = listVereadores.get(i);
        view = inflater.inflate(R.layout.activity_item_lista, null);

        TextView tvNome = (TextView) view.findViewById(R.id.tvNome);
        TextView tvPartido = (TextView) view.findViewById(R.id.tvPartido);
//

        tvNome.setText(vereador.getNome_completo());
        tvPartido.setText(vereador.getPartido());
//


        return view;

    }


}
