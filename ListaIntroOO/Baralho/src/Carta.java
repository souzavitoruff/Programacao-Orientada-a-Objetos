public class Carta{
    String valor;
    String naipe;

    Carta(String valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    String getValor(){
        return valor;
    }

    String getNaipe(){
        return naipe;
    }

}