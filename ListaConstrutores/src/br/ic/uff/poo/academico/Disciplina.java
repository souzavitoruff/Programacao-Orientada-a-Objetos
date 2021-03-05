package br.ic.uff.poo.academico;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String ementa;
    private String preRequisitos;
    private Professor[] professoresDisponiveis = new Professor[8];

    Disciplina(String nome, int cargaHoraria, String ementa, String preRequisitos){}

    public String descreveEmenta(){
        return "Ementa";
    }
}
