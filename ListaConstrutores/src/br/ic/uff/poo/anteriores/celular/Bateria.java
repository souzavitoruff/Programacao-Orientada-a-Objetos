package br.ic.uff.poo.anteriores.celular;

public class Bateria {
    private int capacidadeCarga = 4000;
    private int nivelCarga = 100;

    public void consomeBateria(int bateriaConsumida){
        this.capacidadeCarga -= bateriaConsumida;
        this.nivelCarga = capacidadeCarga/40;
    }

    public void porcentagemBateria(){
        System.out.printf("A bateria do celular está com %d porcento de carga.%n", this.nivelCarga);
    }

    public void setCapacidadeCarga(int capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setNivelCarga(int nivelCarga){
        this.nivelCarga = nivelCarga;
    }
}
