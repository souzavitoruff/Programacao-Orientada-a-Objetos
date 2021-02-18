public class Celular{
    Bateria bateria = new Bateria();

    void enviarMensagem(){
        bateria.consomeBateria(1);
    }

    void fazerLigacao(int tempo){
        bateria.consomeBateria(5 * tempo);
    }

    void cargaCelular(){
        bateria.porcentagemBateria();
    }

    void carregarBateria(){
        bateria.capacidadeCarga = 4000;
        bateria.nivelCarga = 100;
    }
}