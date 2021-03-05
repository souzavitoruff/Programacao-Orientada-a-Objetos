package br.ic.uff.poo.anteriores.baralho;

public class Carta {
    private String valor;
    private String naipe;

    Carta(String valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    String getValor(){
        return valor;
    }

    String getNaipe(){
        return naipe;
    }
}
