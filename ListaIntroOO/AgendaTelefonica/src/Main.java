public class Main {
    public static void main(String[] args){
        Contato vitor = new Contato();
        vitor.setNome("Vitor Souza");
        vitor.setNumero("(21) 97562-4928");

        Contato vania = new Contato();
        vania.setNome("Vania Neves");
        vania.setNumero("(21) 91234-5678");

        Agenda minhaAgenda = new Agenda();
        minhaAgenda.adicionarContato(vitor);
        minhaAgenda.adicionarContato(vania);

        minhaAgenda.imprimeContato("Vitor Souza");
        minhaAgenda.imprimeContato("Vania Neves");
        minhaAgenda.imprimeContato("Vitor Souza");
    
        minhaAgenda.apagarContato(vitor);

    }
}
