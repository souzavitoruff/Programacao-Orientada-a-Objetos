public class Porta {
    Boolean aberta = false;
    String cor = "Branca";
    float largura = 80;
    float altura = 200;

    void abrePorta(){
        aberta = true;
    }

    void fechaPorta(){
        aberta = false;
    }

    void pintaPorta(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setAltura(float altura){
        this.altura = altura;
    }

    void setLargura(float largura){
        this.largura = largura;
    }

    void estaAberta(){
        if(aberta){
            System.out.println("A porta está aberta!");
        }else{
            System.out.println("A porta está fechada!");
        }
    }

    Boolean getAberta(){
        return aberta;
    }
}
