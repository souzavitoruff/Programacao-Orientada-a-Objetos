package br.ic.uff.poo.anteriores.supermercado;

public class Produto {
    private float preco;
    private int qtdEstoque;

    Produto(float preco, int qtdEstoque){
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void setPreco(float novoPreco){
        preco = novoPreco;
    }

    public float getPreco(){
        return preco;
    }

    public void setEstoque(int novaQtdEstoque){
        qtdEstoque = novaQtdEstoque;
    }

    public int getEstoque(){
        return qtdEstoque;
    }
}
