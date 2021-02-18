public class Agenda {
    Contato[] contatos = new Contato[100];
    int qtdContatos = 0;

    void adicionarContato(Contato contato){
        contatos[qtdContatos] = contato;
        qtdContatos++;
    }

    void imprimeContato(String nome){
        for(int i=0; i < qtdContatos; i++){
            if(contatos[i].nome == nome){
                System.out.printf("O número do(a) %s é %s%n", nome, contatos[i].numero);
            }
        }
    }
}
