public class Main {
    public static void main(String[] args){
        Pessoa vitor = new Pessoa();

        vitor.setNome("Vitor Souza");
        vitor.setIdade(20);

        vitor.imprimePessoa();

        vitor.aniversario();
        vitor.aniversario();
        vitor.aniversario();

        vitor.imprimePessoa();
    }
}
