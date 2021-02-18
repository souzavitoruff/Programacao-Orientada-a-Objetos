public class Bateria {
    int capacidadeCarga = 4000;
    int nivelCarga = 100;

    void consomeBateria(int bateriaConsumida){
        capacidadeCarga -= bateriaConsumida;
        nivelCarga = capacidadeCarga/40;
    }

    void porcentagemBateria(){
        System.out.printf("A bateria do celular está com %d porcento de carga.%n", nivelCarga);
    }
}