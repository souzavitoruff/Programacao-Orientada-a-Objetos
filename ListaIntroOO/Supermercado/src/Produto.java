public class Produto{
    float preco;
    int qtdEstoque;

    void setPreco(float novoPreco){
        preco = novoPreco;
    }

    float getPreco(){
        return preco;
    }

    void setEstoque(int novaQtdEstoque){
        qtdEstoque = novaQtdEstoque;
    }

    int getEstoque(){
        return qtdEstoque;
    }
}