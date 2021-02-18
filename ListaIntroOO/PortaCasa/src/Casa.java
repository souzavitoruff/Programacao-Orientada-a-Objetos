public class Casa {
    Porta[] portas = new Porta[5];
    int qtdPortas = 0;
    String cor = "Branca";

    void adcionarPorta(Porta porta){
        portas[qtdPortas] = porta;
        qtdPortas++;
    } 

    void pintaCasa(String cor){
        this.cor = cor;
    }

    void quantasPortasEstaoAbertas(){
        int qtdPortasAbertas = 0;
        for(int i=0; i < qtdPortas; i++){
            if(portas[i].getAberta()){
                qtdPortasAbertas++;
            }
        }

        System.out.printf("A casa tem %d portas abertas!%n", qtdPortasAbertas);
    }
}
