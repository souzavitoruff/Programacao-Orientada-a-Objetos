public class Pessoa {
    String nome;
    int idade;

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    void setIdade(int idade){
        this.idade = idade;
    }

    int getIdade(){
        return idade;
    }

    void aniversario(){
        idade++;
    }

    void imprimePessoa(){
        System.out.printf("O(A) %s tem %d anos.%n", nome, idade);
    }
}
