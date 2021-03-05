package br.ic.uff.poo.academico;

public class Aluno {
    private String matricula;
    private float cr;
    private Turma[] turmasPassadas = new Turma[100];
    private Turma[] turmasAtuais = new Turma[6];
    private String nome;
    private String dataNascimento;

    Aluno(String nome, String dataNascimento, String matricula){}

    private String exibirHistorico(){
        return "Histórico";
    }

    private void calculaCr(){}

}
