package br.ic.uff.poo.anteriores.baralho;

public class Baralho {
    private Carta[] cartas = new Carta[52];
    private int qtdCartas = 0;
    private String[] naipes = {"Ouros", "Copas", "Paus", "Espadas"};

    public void insereCarta(Carta carta){
        cartas[qtdCartas] = carta;
        qtdCartas++;
    }

    public void preencheBaralho(){
        for(int i = 0; i < 4; i++){
            String naipeDaVez = naipes[i];

            Carta cartaAs = new Carta("Ás", naipeDaVez);
            this.insereCarta(cartaAs);
            Carta carta2 = new Carta("2", naipeDaVez);
            this.insereCarta(carta2);
            Carta carta3 = new Carta("3", naipeDaVez);
            this.insereCarta(carta3);
            Carta carta4 = new Carta("4", naipeDaVez);
            this.insereCarta(carta4);
            Carta carta5 = new Carta("5", naipeDaVez);
            this.insereCarta(carta5);
            Carta carta6 = new Carta("6", naipeDaVez);
            this.insereCarta(carta6);
            Carta carta7 = new Carta("7", naipeDaVez);
            this.insereCarta(carta7);
            Carta carta8 = new Carta("8", naipeDaVez);
            this.insereCarta(carta8);
            Carta carta9 = new Carta("9", naipeDaVez);
            this.insereCarta(carta9);
            Carta carta10 = new Carta("10", naipeDaVez);
            this.insereCarta(carta10);
            Carta cartaVal = new Carta("Valete", naipeDaVez);
            this.insereCarta(cartaVal);
            Carta cartaDam = new Carta("Dama", naipeDaVez);
            this.insereCarta(cartaDam);
            Carta cartaRei = new Carta("Rei", naipeDaVez);
            this.insereCarta(cartaRei);
        }

    }

    public void mostraBaralho(){
        for(int i = 0; i < 52; i++){
            System.out.printf("Carta: %s de %s.\n", this.cartas[i].getValor(), this.cartas[i].getNaipe());
        }
    }
}
