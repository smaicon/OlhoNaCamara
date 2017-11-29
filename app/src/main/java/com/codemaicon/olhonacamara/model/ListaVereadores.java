package com.codemaicon.olhonacamara.model;

import java.util.ArrayList;

/**
 * Created by Maicon on 29/11/2017.
 */

public class ListaVereadores {
    private ArrayList <Vereador> listaVereadores;

    public ListaVereadores() {
    }

    public ListaVereadores(ArrayList<Vereador> listaVereadores) {
        this.listaVereadores = listaVereadores;
    }

    public ArrayList<Vereador> getListaVereadores() {
        return listaVereadores;
    }

    public void setListaVereadores(ArrayList<Vereador> listaVereadores) {
        this.listaVereadores = listaVereadores;
    }
}
