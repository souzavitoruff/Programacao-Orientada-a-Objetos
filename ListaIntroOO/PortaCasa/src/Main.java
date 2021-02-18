public class Main {
    public static void main(String[] args){
        //Parte do exercício 3
        Porta porta1 = new Porta();
    
        porta1.abrePorta();

        porta1.pintaPorta("Marrom");
        porta1.pintaPorta("Preto");
        porta1.pintaPorta("Verde Água");

        porta1.setAltura(600);
        porta1.setLargura(1500);

        porta1.estaAberta();

        porta1.fechaPorta();

        porta1.estaAberta();

        //Parte do exercício 4
        System.out.println("----------------------------------------");

        Casa casa = new Casa();

        casa.pintaCasa("Verde");

        Porta porta2 = new Porta();
        porta2.abrePorta();
        Porta porta3 = new Porta();
        porta3.abrePorta();

        casa.adcionarPorta(porta1);
        casa.adcionarPorta(porta2);
        casa.adcionarPorta(porta3);

        casa.quantasPortasEstaoAbertas();

        porta1.abrePorta();

        casa.quantasPortasEstaoAbertas();

    }
}
