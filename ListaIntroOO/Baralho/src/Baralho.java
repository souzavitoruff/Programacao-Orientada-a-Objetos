public class Baralho {
    Carta[] cartas = new Carta[52];
    int qtdCartas = 0;

    void insereCarta(Carta carta){
        cartas[qtdCartas] = carta;
        qtdCartas++; 
    }
}
