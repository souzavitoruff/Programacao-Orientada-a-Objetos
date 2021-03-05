package br.ic.uff.poo.anteriores.portaCasa;

public class Porta {
    private Boolean aberta = false;
    private String cor = "Branca";
    private float largura = 80;
    private float altura = 200;

    Porta(String cor, float largura, float altura){
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
    }

    public void abrePorta(){
        this.aberta = true;
    }

    public void fechaPorta(){
        this.aberta = false;
    }

    public void pintaPorta(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setLargura(float largura){
        this.largura = largura;
    }

    public void estaAberta(){
        if(aberta){
            System.out.println("A porta está aberta!");
        }else{
            System.out.println("A porta está fechada!");
        }
    }

    public Boolean getAberta(){
        return this.aberta;
    }
}
