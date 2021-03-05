package br.ic.uff.poo.anteriores.aniversarios;

public class Pessoa {
    private String nome;
    private int idade;
    private String dataDeNascimento;

    Pessoa(String nome, int idade, String dataDeNascimento){
        this.nome = nome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void aniversario(){
        this.idade++;
    }

    public void imprimePessoa(){
        System.out.printf("O(A) %s tem %d anos.%n", this.nome, this.idade);
    }
}
