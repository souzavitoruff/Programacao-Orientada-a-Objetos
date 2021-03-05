package br.ic.uff.poo.carros;

public class CarroDETRAN {
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String dono;
    private String cnhDono;
    private int quantidadeMultas;
    private String dataEmplacamento;
    private String dataVistoria;
    private Boolean aprovadoNaVistoria;

    CarroDETRAN(String modelo, String ano, String cor, String placa,
                String dono, String cnhDono, int quantidadeMultas){}

    CarroDETRAN(String modelo, String ano, String cor, String dono, String cnhDono){}

    public void agendarEmplacamento(){}

    public void emplacarVeiculo(){}

    public void multarVeiculo(){}

    public void agendarVistoria(){}

    public void vistoriarVeiculo(){}

    public void aprovarVistoria(){}

    public void gerarDocumentoAtualizado(){}
}
