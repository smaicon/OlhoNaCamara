package com.codemaicon.olhonacamara.activitys;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.codemaicon.olhonacamara.R;
import com.codemaicon.olhonacamara.model.Vereador;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class ItemVereador extends AppCompatActivity {

    ListView lvVereadores;
    Vereador vereador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_vereador);
        Bundle param = getIntent().getExtras();
        vereador = (Vereador) param.getSerializable("vereador");
       ConsultaGastos();

    }
    public void ConsultaGastos() {

      //  final ListaGastos listagastos = new ListaGastos();

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://172.28.2.17:8080/web-app/webresources/ws/gastos_vereador/list/"+vereador.getId(),
                new AsyncHttpResponseHandler() {

                    @Override
                    public void onStart() {
                        super.onStart();
                    }

                    @Override
                    public void onSuccess(int i, PreferenceActivity.Header[] headers, byte[] response) {

                        Gasto gasto = new Gasto();

                        String responseString = new String(response);

                        Gson g = new Gson();
                        gasto = g.fromJson(responseString, Gasto.class);



                        TextView tvtvDebitosMes  = (TextView) findViewById(R.id.tvDebitosMes);
                        TextView tvSelos = (TextView) findViewById(R.id.tvSelos);
                        TextView tvMaterialExpediente = (TextView) findViewById(R.id.tvMaterialExpediente);
                        TextView tvDiarias = (TextView) findViewById(R.id.tvDiarias);

                        tvtvDebitosMes.setText((int) gasto.getDebitos_mes());
                        tvSelos.setText((int) gasto.getSelos());
                        tvMaterialExpediente.setText((int) gasto.getMaterial_expediente());
                        tvDiarias.setText((int) gasto.getDiarias());

                        gasto.setDebitos_mes(gasto.getDebitos_mes());
                        gasto.setDiarias(gasto.getDiarias());
                        gasto.setSelos(gasto.getSelos());

                    }

                    @Override
                    public void onFailure(int i, PreferenceActivity.Header[] headers, byte[] bytes, Throwable throwable) {

                    }

                });
    }
}
