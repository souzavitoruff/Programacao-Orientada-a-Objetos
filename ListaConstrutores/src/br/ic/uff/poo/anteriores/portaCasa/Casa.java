package br.ic.uff.poo.anteriores.portaCasa;

public class Casa {
    private Porta[] portas = new Porta[5];
    private int qtdPortas = 0;
    private String cor = "Branca";

    public void adcionarPorta(Porta porta){
        portas[qtdPortas] = porta;
        qtdPortas++;
    }

    public void pintaCasa(String cor){
        this.cor = cor;
    }

    public void quantasPortasEstaoAbertas(){
        int qtdPortasAbertas = 0;
        for(int i=0; i < qtdPortas; i++){
            if(portas[i].getAberta()){
                qtdPortasAbertas++;
            }
        }

        System.out.printf("A casa tem %d portas abertas!%n", qtdPortasAbertas);
    }
}
