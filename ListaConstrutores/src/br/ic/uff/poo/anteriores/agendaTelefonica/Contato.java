package br.ic.uff.poo.anteriores.agendaTelefonica;

public class Contato {
    private String nome;
    private String numero;

    Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero(){
        return this.numero;
    }
}
