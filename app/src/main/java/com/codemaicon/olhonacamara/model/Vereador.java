package com.codemaicon.olhonacamara.model;

import java.io.Serializable;

/**
 * Created by Maicon on 29/11/2017.
 */

public class Vereador implements Serializable{

    private Integer id;
    private String cor_raca;
    private String data_nascimento;
    private String email;
    private String fim_mandato;
    private String foto;
    private String grau_instrucao;
    private String inicio_mandato;
    private String nome_completo;
    private String nome_publico;
    private String partido;
    private String sexo;
    private String site;
    private String telefone;
    private Integer total_votos;

    public Vereador() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCor_raca() {
        return cor_raca;
    }

    public void setCor_raca(String cor_raca) {
        this.cor_raca = cor_raca;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFim_mandato() {
        return fim_mandato;
    }

    public void setFim_mandato(String fim_mandato) {
        this.fim_mandato = fim_mandato;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getGrau_instrucao() {
        return grau_instrucao;
    }

    public void setGrau_instrucao(String grau_instrucao) {
        this.grau_instrucao = grau_instrucao;
    }

    public String getInicio_mandato() {
        return inicio_mandato;
    }

    public void setInicio_mandato(String inicio_mandato) {
        this.inicio_mandato = inicio_mandato;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public String getNome_publico() {
        return nome_publico;
    }

    public void setNome_publico(String nome_publico) {
        this.nome_publico = nome_publico;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getTotal_votos() {
        return total_votos;
    }

    public void setTotal_votos(Integer total_votos) {
        this.total_votos = total_votos;
    }

    @Override
    public String toString() {
        return "Vereador{" +
                "id=" + id +
                ", cor_raca='" + cor_raca + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", email='" + email + '\'' +
                ", fim_mandato=" + fim_mandato +
                ", foto='" + foto + '\'' +
                ", grau_instrucao='" + grau_instrucao + '\'' +
                ", inicio_mandato=" + inicio_mandato +
                ", nome_completo='" + nome_completo + '\'' +
                ", nome_publico='" + nome_publico + '\'' +
                ", partido='" + partido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", site='" + site + '\'' +
                ", telefone='" + telefone + '\'' +
                ", total_votos=" + total_votos +
                '}';
    }
}
