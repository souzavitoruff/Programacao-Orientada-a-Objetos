package br.ic.uff.poo.anteriores.agendaTelefonica;

public class Agenda {
    private Contato[] contatos = new Contato[100];
    private int qtdContatos = 0;

    public void adicionarContato(Contato contato){
        contatos[qtdContatos] = contato;
        qtdContatos++;
    }

    public void imprimeContato(String nome){
        for(int i=0; i < qtdContatos; i++){
            if(contatos[i].getNome() == nome){
                System.out.printf("O número do(a) %s é %s%n", nome, contatos[i].getNumero());
            }
        }
    }

    public void apagarContato(Contato contato){
        for(int i = 0; i < qtdContatos; i++){
            if(contatos[i] == contato){
                contatos[i] = null;
            }
        }
        System.out.println("O contato foi apagado.");
    }
}
