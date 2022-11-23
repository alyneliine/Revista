package com.composicao;

import java.util.Date;

public class Edicao {

    private int numero;
    private Date data;
    private int tiragem;
    private int qtdeVendida;
    private boolean reclicou;

    public Edicao() {
    }

    public Edicao(int numero, int tiragem, int qtdeVendida) {
        this.numero = numero;
        this.tiragem = tiragem;
        this.qtdeVendida = qtdeVendida;
        this.data = new Date();
        this.reclicou = false;
    }

    public void reciclarExemplares(){
        this.reclicou = true;

    }

    public int obterQtdeReciclagem(){
        return this.tiragem - this.qtdeVendida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public boolean isReclicou() {
        return reclicou;
    }

    public void setReclicou(boolean reclicou) {
        this.reclicou = reclicou;
    }
}
