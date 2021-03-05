package br.ic.uff.poo.data;

public class Main {
    public static void main(String[] args){
        Data data1 = new Data(1, 3, 2021);
        Data data2 = new Data("Agosto", 17,2020);
        Data data3 = new Data(287, 2020);

        data1.imprimeDiaMesAno();
        data1.imprimeMesDiaAno();
        data1.imprimeDiasCompletosAno();

        System.out.println("\n---------------------");

        data2.imprimeDiaMesAno();
        data2.imprimeMesDiaAno();
        data2.imprimeDiasCompletosAno();

        System.out.println("\n---------------------");

        data3.imprimeDiaMesAno();
        data3.imprimeMesDiaAno();
        data3.imprimeDiasCompletosAno();
    }
}
