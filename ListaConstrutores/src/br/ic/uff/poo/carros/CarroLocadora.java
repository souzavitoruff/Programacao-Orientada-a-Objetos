package br.ic.uff.poo.carros;

public class CarroLocadora {
    private float valorDaDiaria;
    private float valorDoSeguro;
    private int numeroDeDiasAlugados;
    private String ano;
    private String modelo;
    private String categoria;
    private Boolean disponibilidade;

    CarroLocadora(String ano, String modelo, String categoria, String disponibilidade,
                  float valorDaDiaria, float valorDoSeguro){}

    public void setNumeroDeDiasAlugados(int dias){}

    public void alugarVeiculo(int numeroDeDiasAlugados){}

    public float getValorTotalDoAluguel(){
        return (valorDaDiaria * numeroDeDiasAlugados) + valorDoSeguro;
    }

    public void mostrarVeiculo(){}

}
