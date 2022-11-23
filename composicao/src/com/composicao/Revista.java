package com.composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista {

    private int codigo;
    private String titulo;
    private int reciclagemProduzida;

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    private List<Edicao> edicoes;

    public Revista(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.reciclagemProduzida = 0;
        this.edicoes = new ArrayList<Edicao>();

    }

    public void adcionarEdicao(int numero, int tiragem, int qtdeVendida){
       edicoes.add(new Edicao(numero, tiragem, qtdeVendida));
    }

    public void removerEdicao(Edicao edicao){
        edicoes.remove(edicao);
    }
    public String reciclarEdicao(int numero){
        for (Edicao edicao : edicoes ){

            if(edicao != null && edicao.getNumero() == numero && edicao.obterQtdeReciclagem() == 0){
                return "Não houve exemplares para reciclar";
            }
            else if(edicao != null && edicao.getNumero() == numero && edicao.isReclicou() == true){
                return "Edição já reclicada";
            }
            else if(edicao != null && edicao.getNumero() == numero && edicao.isReclicou() == false){
                reciclagemProduzida += edicao.obterQtdeReciclagem();
                edicao.reciclarExemplares();
                return "Reciclagem realizada";

            }
        }
        return "Edição não encontrada";
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getRecligameProduzida() {
        return reciclagemProduzida;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setRecligameProduzida(int recligameProduzida) {
        this.reciclagemProduzida = recligameProduzida;
    }
}
