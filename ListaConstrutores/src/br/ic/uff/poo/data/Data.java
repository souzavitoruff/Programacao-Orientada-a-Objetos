package br.ic.uff.poo.data;

public class Data {
    private int dia;
    private int mesInt;
    private int ano;
    private int diasCompletos;
    private String mesString;
    private String[] mesesDoAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                                    "Junho", "Julho", "Agosto", "Setembro", "Outubro",
                                    "Novembro", "Dezembro"};

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mesInt = mes;
        this.ano = ano;
        this.mesString = this.mesesDoAno[mesInt - 1];
        if(mesInt == 1){
            this.diasCompletos = this.dia;
        }else{
            this.diasCompletos = ((this.mesInt - 1) * 30) + this.dia;
        }
    }

    Data(String mesString, int dia, int ano){
        this.mesString = mesString;
        this.dia = dia;
        this.ano = ano;
        for(int i = 0; i < 12; i++){
            if(this.mesesDoAno[i] == mesString){
                this.mesInt = i + 1;
            }
        }
        this.diasCompletos = (this.mesInt * 30) + this.dia;
    }

    Data(int diasCompletos, int ano){
        this.ano = ano;
        this.diasCompletos = diasCompletos;
        this.mesInt = diasCompletos / 30;
        this.dia = diasCompletos -  (this.mesInt * 30);
        this.mesString = mesesDoAno[mesInt - 1];
    }

    public void imprimeDiaMesAno(){
        System.out.printf("%d/%d/%d\n", this.dia, this.mesInt, this.ano);
    }

    public void imprimeMesDiaAno(){
        System.out.printf("%s %d, %d\n", this.mesString, this.dia, this.ano);
    }

    public void imprimeDiasCompletosAno(){
        System.out.printf("%d %d\n", this.diasCompletos, this.ano);
    }

}
