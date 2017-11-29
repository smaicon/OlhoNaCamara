package com.codemaicon.olhonacamara.activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.codemaicon.olhonacamara.R;

public class MainActivity extends AppCompatActivity {
    private ImageView botaoCalendario;
    private ImageView botaoDespesas;
    private ImageView botaoNoticias;
    private ImageView botaoVereadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCalendario = (ImageView) findViewById(R.id.btnCalendario);
        botaoDespesas = (ImageView) findViewById(R.id.btnDespesa);
        botaoNoticias = (ImageView) findViewById(R.id.btnNoticias);
        botaoVereadores = (ImageView) findViewById(R.id.btnVereadores);


        botaoCalendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CalendarioActivity.class));

            }
        });

        botaoDespesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DespesasActivity.class));

            }


        });

        botaoNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NoticiasActivity.class));

            }
        });

        botaoVereadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListaActivity.class));

            }
        });
    }
}
