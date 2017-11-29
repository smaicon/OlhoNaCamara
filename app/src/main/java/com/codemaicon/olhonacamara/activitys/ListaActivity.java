package com.codemaicon.olhonacamara.activitys;

import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.codemaicon.olhonacamara.R;
import com.codemaicon.olhonacamara.model.ListaVereadores;
import com.codemaicon.olhonacamara.model.Vereador;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class ListaActivity extends AppCompatActivity {

    MyAdapter myAdapter;
    ListView lvVereadores;
    Vereador vereador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        lvVereadores = (ListView) findViewById(R.id.lvVereadores);
        lvVereadores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                vereador = (Vereador) myAdapter.getItem(i);
                Intent it = new Intent(ListaActivity.this, ItemVereador.class);
                it.putExtra("vereador", vereador)


                startActivity(it);

            }
        });

        Consulta();
    }

    public void exibirVereador(View v) {

    }

    public ListaVereadores Consulta() {

        ListaVereadores listaVereadores = new ListaVereadores();

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://172.28.2.17:8080/web-app/webresources/ws/vereador/list",
                new AsyncHttpResponseHandler() {

                    @Override
                    public void onStart() {
                        super.onStart();
                    }

                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] response) {
                        ListaVereadores listaVereadores = new ListaVereadores();

                        String responseString = "{\"listaVereadores\":" + new String(response) + "}";

                        Gson g = new Gson();
                        listaVereadores = g.fromJson(responseString, ListaVereadores.class);


                        myAdapter = new MyAdapter(listaVereadores.getListaVereadores(), ListaActivity.this);
                        lvVereadores.setAdapter(myAdapter);
                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                    }



                });

        return listaVereadores;
    }

}