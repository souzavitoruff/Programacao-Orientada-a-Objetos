package br.ic.uff.poo.academico;

public class Turma {
    private Aluno[] alunos = new Aluno[30];
    private float[] notasp1 = new float[30];
    private float[] notasp2 = new float[30];
    private int quantidadeAlunos = 0;
    private Disciplina disciplina;
    private Professor professor;
    private String diasAula;
    private String horariosAula;

    Turma(Disciplina disciplina, Professor professor, String diasAula, String horariosAula){}

    private float calculaMediaAluno(Aluno aluno){
        // aqui seria implementada a lógica da busca do índice do aluno e aquisição de suas notas nas listas
        return 6;
    }

    public String horariosAula(){
        return this.horariosAula;
    }

    private void adicionarNota(String prova, Aluno aluno, float nota){}
}
