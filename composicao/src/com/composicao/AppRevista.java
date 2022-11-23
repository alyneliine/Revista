package com.composicao;
import java.util.ArrayList;
import java.util.List;


public  class AppRevista {
    public static void main(String[] args){

        Revista revista = new Revista(1, "Chocoloate com pimenta");
        revista.adcionarEdicao(52, 1000, 800);
        revista.adcionarEdicao(53, 900, 900);
        revista.adcionarEdicao(54, 1200, 1000);

        imprimirRetorno(revista, 53);
        System.out.println();
        imprimirRetorno(revista, 54);
        System.out.println();
        imprimirRetorno(revista, 54);
        System.out.println();
        imprimirRetorno(revista, 99);

    }

    private static void imprimirRetorno(Revista revista, int numero) {
        String retorno = revista.reciclarEdicao(numero);
        Edicao edicao = pesquisarEdicaoPorNumero(numero, revista);
        System.out.println(retorno + " \nA reciclagem produzida é: " + revista.getRecligameProduzida() + " \nA edição foi reciclada? " + edicao.isReclicou());
    }

    public static Edicao pesquisarEdicaoPorNumero(int numero, Revista revista) {
        for ( Edicao edicao : revista.getEdicoes() ) {
            if (edicao != null && edicao.getNumero() == numero) {
                return edicao;
            }
        }
        return new Edicao();
    }
}
