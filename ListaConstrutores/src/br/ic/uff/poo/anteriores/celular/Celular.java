package br.ic.uff.poo.anteriores.celular;

public class Celular {
    private Bateria bateria = new Bateria();

    Celular(Bateria bateria){
        this.bateria = bateria;
    }

    public void enviarMensagem(){
        bateria.consomeBateria(1);
    }

    public void fazerLigacao(int tempo){
        bateria.consomeBateria((5 * tempo));
    }

    public void cargaCelular(){
        bateria.porcentagemBateria();
    }

    public void carregarBateria(){
        bateria.setCapacidadeCarga(4000);
        bateria.setNivelCarga(100);
    }
}
